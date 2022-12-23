package registration;

import app.Server;
import com.gl.goConsult.Notification;
import com.gl.goConsult.notificationGrpc;
import com.stackroute.grpc.UserRegistration;
import com.stackroute.grpc.registrationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.Random;

public class Registration extends registrationGrpc.registrationImplBase {
    @Override
    public void register(com.stackroute.grpc.UserRegistration.request request, StreamObserver<com.stackroute.grpc.UserRegistration.response> responseObserver) {
        System.out.println("registration start");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
        Notification.notificationMessage message = Notification.notificationMessage.newBuilder().setMessage(String.format("Hello there,%n%nWelcome to GoConsult!%nYour " +
                        "account has been successfully created.%n Now you can login with the help of your credentials.%n%n%n Warm Regards%n GoConsult Team"))
                .setEmail(request.getEmail()).setSubject("Account Created").build();
        notificationGrpc.notificationBlockingStub blockingStub = notificationGrpc.newBlockingStub(channel);
        UserRegistration.response.Builder builder = UserRegistration.response.newBuilder();
        int id = 0;
        try {
            id = storeDetails(request.getUsername(), request.getPassword(), request.getEmail(), request.getContactNumber(),
                    request.getAddress(), request.getDob(), request.getGender(), request.getUserType());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (id != 0) {
            blockingStub.registerNotification(message);
            builder.setResponseMessage("User saved successfully with unique id  " + id);
        } else {
            builder.setResponseMessage("Email already exist");
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    public int storeDetails(String username, String password, String email, String contactNumber, String address, String dob, String gender, String userType) throws SQLException {
        System.out.println("databse connect");
        Random random = null;
        Connection conn = Server.connect();
        boolean check = checkUser(email, conn);
        String query = null;
        Date date = Date.valueOf(dob);
        if (check) {
            random = new Random();
            int genId = random.nextInt(500);
            if (userType.equals("user")) {
                query = "Insert into userdata(user_id, user_name, email, password, contact, gender, address, dob) values(?,?,?,?,?,?,?,?)";
            } else if (userType.equals("counsellor")) {
                query = "Insert into counselor(counselor_id, counselor_name, email, password, contact, gender, address, dob) values(?,?,?,?,?,?,?,?)";
            }
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, genId);
            statement.setString(2, username);
            statement.setString(3, email);
            statement.setString(4, password);
            statement.setString(5, contactNumber);
            statement.setString(6, gender);
            statement.setString(7, address);
            if (userType.equals("user")) {
                statement.setString(8, dob);
            } else {
                statement.setObject(8, date);
            }
            statement.executeUpdate();
            return genId;
        }
        return 0;
    }

    private boolean checkUser(String email, Connection conn) throws SQLException {
        String sqlData = "select email from userdata where email= ? union all select email from counselor where email=? ";
        PreparedStatement psData = conn.prepareStatement(sqlData);
        psData.setString(1, email);
        psData.setString(2, email);
        ResultSet resultData = psData.executeQuery();
        if (!resultData.isBeforeFirst()) {
            System.out.println("no data found");
            return true;
        }
        return false;
    }
}
