package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.stackroute.CapstoneUser.User;
import com.stackroute.CapstoneUser.userServiceGrpc.userServiceImplBase;

import io.grpc.stub.StreamObserver;

public class UserService extends userServiceImplBase {
	public static String UID=null;

	// Api call to store user data
	@Override
	public void userUpdation(User.userDetails request, StreamObserver<User.APIResponse> responseObserver) {
		System.out.println("Inside userRegistration method.");
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		if (UID != null && !UID.trim().equals("")) {
			Connection con = null;
			try {
				con = CapstoneDbConn.connectToDB();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			HashMap<String, String> returnMap = null;
			try {
				returnMap = checkLoggedInUser(con, UID);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (returnMap.get("flag").equals("2")) {

				List<String> dataList = new ArrayList<String>();
				dataList = addDataInList(dataList, request);

				reponse.setResponseMessage("Profile updated successfully.").setResponseCode(200);
				try {
					if (!DatabaseEntry(dataList, returnMap.get("id"))) {
						reponse.setResponseMessage("E-mail already used!").setResponseCode(100);
					}
				} catch (Exception e) {
					System.out.println(e);
					reponse.setResponseMessage("FAILURE").setResponseCode(400);
				}
			} else {
				reponse.setResponseMessage("E-mail not registered!").setResponseCode(100);
			}
		} else
			reponse.setResponseMessage("Please provide loggen id user email id.!").setResponseCode(100);

		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();

	}

	// to connect to Database and store the user data
	public boolean DatabaseEntry(List<String> dataList, String loggedId) throws SQLException, ParseException {
		System.out.println("inside DatabaseEntry");
		Connection con = CapstoneDbConn.connectToDB();
		int listLen = dataList.size();
		String[] idListArray = dataList.get(listLen - 1).split(",");
		List<String> idList = Arrays.asList(idListArray);
		boolean flag = true;
		if (idList.contains("email")) {
			if (checkUser(con, dataList.get(idList.indexOf("email")), loggedId)) {
				flag = false;
			}
		}

		if (flag) {
			String sql = "update userdata set ";
			for (String s : idList) {
				sql = sql + s + " = ?, ";
			}
			sql = sql.substring(0, sql.length() - 2);
			sql = sql + " where email = '" + dataList.get(listLen - 2) + "';";
			System.out.println(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(dataList.toString());
			for (int i = 1; i < listLen - 1; i++) {
				ps.setString(i, dataList.get(i - 1));
			}
			/*
			 * Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataList.get(6));
			 * java.sql.Date datesql = new java.sql.Date(date1.getTime()); ps.setDate(7,
			 * datesql); ps.setString(8, dataList.get(7));
			 */

			try {
				ps.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Record inserted successfully.");
			return true;
		} else
			return false;

	}

	// to store user data in list
	public List<String> addDataInList(List<String> dataList, User.userDetails request) {
		String ids = "";

		if (request.getUsername() != null && !request.getUsername().equals("")) {
			dataList.add(request.getUsername());
			ids = ids + "user_name,";
		}
		if (request.getEmail() != null && !request.getEmail().equals("")) {
			dataList.add(request.getEmail());
			ids = ids + "email,";
		}
		if (request.getContactNumber() != null && !request.getContactNumber().equals("")) {
			dataList.add(request.getContactNumber());
			ids = ids + "contact,";
		}
		if (request.getPassword() != null && !request.getPassword().equals("")) {
			dataList.add(request.getPassword());
			ids = ids + "password,";
		}
		if (request.getAddress() != null && !request.getAddress().equals("")) {
			dataList.add(request.getAddress());
			ids = ids + "address,";
		}
		if (request.getOccupation() != null && !request.getOccupation().equals("")) {
			dataList.add(request.getOccupation());
			ids = ids + "occupation,";
		}
		if (request.getDateofBirth() != null && !request.getDateofBirth().equals("")) {
			dataList.add(request.getDateofBirth());
			ids = ids + "dob,";
		}
		if (request.getGender() != null && !request.getGender().equals("")) {
			dataList.add(request.getGender());
			ids = ids + "gender";
		}
		if (UID != null && !UID.equals("")) {
			dataList.add(UID);
		}
		dataList.add(ids);
		return dataList;

	}

	// to check existing user with same mail

	public boolean checkUser(Connection con, String UserEmail, String loggedId) throws SQLException {
		String sqlData = "select * from userdata";
		PreparedStatement psData = con.prepareStatement(sqlData);
		ResultSet resultData = null;
		try {
			resultData = psData.executeQuery();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (resultData.isBeforeFirst()) {

			if (resultData.next()) {
				do {
					if (UserEmail.equals(resultData.getString("email"))
							&& !loggedId.equals(resultData.getString("user_id")))
						return true;
				} while (resultData.next());
			}
		}
		return false;
	}

	public HashMap<String, String> checkLoggedInUser(Connection con, String UserEmail) throws SQLException {
		HashMap<String, String> returnMap = new HashMap<String, String>();
		returnMap.put("flag", "1");
		returnMap.put("id", null);
		String sqlData = "select * from userdata";
		PreparedStatement psData = con.prepareStatement(sqlData);
		ResultSet resultData = null;
		try {
			resultData = psData.executeQuery();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (resultData.isBeforeFirst()) {

			if (resultData.next()) {
				do {
					if (UserEmail.equals(resultData.getString("email"))) {
						returnMap.put("flag", "2");
						returnMap.put("id", resultData.getString("user_id"));
						return returnMap;
					}

				} while (resultData.next());
			}
		}
		return returnMap;
	}

	// Api call to view user data
	@Override
	public void userDetailView(User.APIInput request, StreamObserver<User.userDetailsView> responseObserver) {
		Connection con = null;
		System.out.println(UID);
		try {
			con = CapstoneDbConn.connectToDB();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		User.userDetailsView.Builder reponse = User.userDetailsView.newBuilder();
		try {
			if (checkUser(con, UID, "")) {
				String sqlData = "select * from userdata where email = ?;";
				PreparedStatement psData = con.prepareStatement(sqlData);
				psData.setString(1, UID);
				ResultSet resultData = null;
				try {
					resultData = psData.executeQuery();
				} catch (Exception e) {
					System.out.println(e);
				}

				if (resultData.isBeforeFirst()) {

					if (resultData.next())
						reponse = setReponseView(reponse, resultData);
				}

			} else {
				reponse.setResponseMessage("E-mail id not registered.").setResponseCode(100);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}

	public User.userDetailsView.Builder setReponseView(User.userDetailsView.Builder reponse, ResultSet resultData)
			throws SQLException {
		if (resultData.getString("user_name") != null) {
			reponse.setUsername(resultData.getString("user_name"));
		}
		if (resultData.getString("email") != null) {
			reponse.setEmail(resultData.getString("email"));
		}
		if (resultData.getString("contact") != null) {
			reponse.setContactNumber(resultData.getString("contact"));
		}
		if (resultData.getString("password") != null) {
			reponse.setPassword(resultData.getString("password"));
		}
		if (resultData.getString("address") != null) {
			reponse.setAddress(resultData.getString("address"));
		}
		if (resultData.getString("occupation") != null) {
			reponse.setOccupation(resultData.getString("occupation"));
		}
		if (resultData.getString("dob") != null) {
			reponse.setDateofBirth(resultData.getString("dob"));
		}
		if (resultData.getString("gender") != null) {
			reponse.setGender(resultData.getString("gender"));
		}
		reponse.setResponseMessage("Success");
		reponse.setResponseCode(200);
		return reponse;
	}

	// to delete user record
	@Override
	public void userDetailDelete(User.APIInput request, StreamObserver<User.APIResponse> responseObserver) {
		Connection con = null;
		try {
			con = CapstoneDbConn.connectToDB();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		try {
			if (checkUser(con, UID, "")) {
				String sqlData = "delete from userdata where email = ?;";
				PreparedStatement psData = con.prepareStatement(sqlData);
				psData.setString(1, UID);
				try {
					psData.executeUpdate();
					reponse.setResponseMessage("Profile deleted successfully.");
					reponse.setResponseCode(200);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				reponse.setResponseMessage("E-mail id not registered.").setResponseCode(100);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();

	}
	
	//channels
	 @Override
	 public void bookingChannel(User.bookingInput request,
		        StreamObserver<User.APIResponse> responseObserver) {
		 User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		 
		 try {
			reponse =  UserChannels.booking(request, reponse, UID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();
		 
		 
	 }
	 
	 @Override
		public void cancelBookingChannel(User.cancelInput request, StreamObserver<User.APIResponse> responseObserver) {
			User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
			reponse =  UserChannels.cancelBooking(request, reponse, UID);
			responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();

		}

	 @Override
		public void rescheduleBookingChannel(User.rescheduleInput request,
				StreamObserver<User.APIResponse> responseObserver) {
			User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
			reponse =  UserChannels.rescheduleBooking(request, reponse, UID);
			responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();

		}
	 
	 public void getPatientAppointmentsChannel(User.patientRequest request,
		        StreamObserver<User.APIResponse2> responseObserver) {
		 User.APIResponse2.Builder reponse = User.APIResponse2.newBuilder();
			reponse =  UserChannels.getPatientAppointments(request, reponse, UID);
			responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();

	 }

		
	 
	 @Override
	 public void searchAllChannel(User.APIInput request,
		        StreamObserver<User.searchResponse> responseObserver) {
		 User.searchResponse.Builder reponse = User.searchResponse.newBuilder();
			reponse =  UserChannels.searchAll(request, reponse);
			responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();
		 
	 }
	
	 @Override
	 public void searchBySpecificationChannel(User.searchRequest request,
		        StreamObserver<User.searchResponse> responseObserver) {
		 User.searchResponse.Builder reponse = User.searchResponse.newBuilder();
			reponse =  UserChannels.searchBySpecification(request, reponse);
			responseObserver.onNext(reponse.build());
			responseObserver.onCompleted();
	 }

	@Override
	public void reviewOnlyChannel(User.review request, StreamObserver<User.APIResponse> responseObserver) {
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		reponse = UserChannels.reviewOnly(request, reponse, UID);
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}
	@Override
	public void reviewAndRateChannel(User.reviewandrate request,
									 StreamObserver<User.APIResponse> responseObserver) {
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		reponse = UserChannels.reviewAndRate(request, reponse, UID);
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}
	@Override
	public void deleteReviewChannel(User.deletereview request, StreamObserver<User.APIResponse> responseObserver) {
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		reponse = UserChannels.deleteReview(request, reponse, UID);
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}
	@Override
	public void updateReviewChannel(User.updatereview request, StreamObserver<User.APIResponse> responseObserver) {
		User.APIResponse.Builder reponse = User.APIResponse.newBuilder();
		reponse = UserChannels.updateReview(request, reponse, UID);
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}
	@Override
	public void getAllFeedbackByIdChannel(User.getfeedbackbyid request,
										  StreamObserver<User.listresponse> responseObserver) {
		User.listresponse.Builder reponse = User.listresponse.newBuilder();
		reponse = UserChannels.getAllFeedbackById(request, reponse, UID);
		responseObserver.onNext(reponse.build());
		responseObserver.onCompleted();
	}
}
