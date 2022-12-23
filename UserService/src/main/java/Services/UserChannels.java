
package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.globallogic.slotBooking.Booking;
import com.globallogic.slotBooking.Booking.bookingInput;
import com.globallogic.slotBooking.Booking.cancelInput;
import com.globallogic.slotBooking.Booking.patientRequest;
import com.globallogic.slotBooking.Booking.request;
import com.globallogic.slotBooking.Booking.rescheduleInput;
import com.globallogic.slotBooking.bookingGrpc;
import com.globallogic.slotBooking.bookingGrpc.bookingBlockingStub;
import com.goconsult.grpc.SearchAvailableSlotsGrpc;
import com.goconsult.grpc.SearchAvailableSlotsGrpc.SearchAvailableSlotsBlockingStub;
import com.goconsult.grpc.Slots;
import com.goconsult.grpc.Slots.Empty;
import com.goconsult.grpc.Slots.searchRequest;
import com.goconsult.grpc.Slots.searchResponse;
import com.stackroute.CapstoneUser.User;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.feedback.Feedback;
import com.stackroute.feedback.Feedback.APIResponse;
import com.stackroute.feedback.Feedback.deletereview;
import com.stackroute.feedback.Feedback.getfeedbackbyid;
import com.stackroute.feedback.Feedback.listresponse;
import com.stackroute.feedback.Feedback.review;
import com.stackroute.feedback.Feedback.reviewandrate;
import com.stackroute.feedback.Feedback.updatereview;
import com.stackroute.feedback.feedbackGrpc;
import com.stackroute.feedback.feedbackGrpc.feedbackBlockingStub;

public class UserChannels {

    public static User.APIResponse.Builder booking(User.bookingInput request, User.APIResponse.Builder reponse, String UID) throws SQLException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        int userId = 0;
        Connection con = null;
        try {
            con = CapstoneDbConn.connectToDB();
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
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
                userId = Integer.parseInt(resultData.getString("user_id"));
        }
        Booking.bookingInput requestChanel = Booking.bookingInput.newBuilder().setSlotId(request.getSlotId())
                .setUserId(userId).setCounsellorId(request.getCounsellorId()).setDate(request.getDate())
                .setFromTime(request.getFromTime()).setToTime(request.getToTime()).build();

        bookingGrpc.bookingBlockingStub userStub = bookingGrpc.newBlockingStub(channel);
        com.globallogic.slotBooking.Booking.APIResponse xyz = userStub.booking(requestChanel);
        // com.globallogic.slotBooking.Booking.APIResponse test = xyz;
        reponse.setResponseMessage(xyz.getResponseMessage());
        reponse.setResponseCode(xyz.getResponseCode());

        return reponse;

    }

    public static User.APIResponse.Builder cancelBooking(User.cancelInput request, User.APIResponse.Builder reponse, String UID) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        bookingGrpc.bookingBlockingStub userStub = bookingGrpc.newBlockingStub(channel);
        Booking.cancelInput requestChanel = Booking.cancelInput.newBuilder().setEmail(UID).setDate(request.getDate()).setFromTime(request.getFromTime()).build();
        com.globallogic.slotBooking.Booking.APIResponse xyz = userStub.cancelBooking(requestChanel);
        reponse.setResponseMessage(xyz.getResponseMessage());
        reponse.setResponseCode(xyz.getResponseCode());
        return reponse;
    }

    ///
    public static User.APIResponse.Builder rescheduleBooking(User.rescheduleInput request, User.APIResponse.Builder reponse, String UID) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        bookingGrpc.bookingBlockingStub userStub = bookingGrpc.newBlockingStub(channel);
        Booking.rescheduleInput requestChanel = Booking.rescheduleInput.newBuilder().setEmail(UID).setDate(request.getDate()).setFromTime(request.getFromTime()).setToTime(request.getToTime()).build();
        com.globallogic.slotBooking.Booking.APIResponse xyz = userStub.rescheduleBooking(requestChanel);
        reponse.setResponseMessage(xyz.getResponseMessage());
        reponse.setResponseCode(xyz.getResponseCode());
        return reponse;
    }


    //to get user booking data


    public static User.APIResponse2.Builder getPatientAppointments(User.patientRequest request,
                                                                   User.APIResponse2.Builder reponse, String UID) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        bookingGrpc.bookingBlockingStub userStub = bookingGrpc.newBlockingStub(channel);
        Booking.patientRequest requestChanel = Booking.patientRequest.newBuilder().setEmail(UID).build();
        Booking.APIResponse2 xyz = userStub.getPatientAppointments(requestChanel);
        reponse.setMessagecode(xyz.getMessagecode());
        reponse.setMessageresponse(xyz.getMessageresponse());

        List<User.data1> ls = new ArrayList<User.data1>();
        ls = copyDataListBooking(ls, xyz.getResponseList());
        reponse.addAllResponse(ls);
        return reponse;
    }

    public static List<User.data1> copyDataListBooking(List<User.data1> userList, List<Booking.data1> bookingList) {
        User.data1.Builder ud = User.data1.newBuilder();
        for (Booking.data1 bd : bookingList) {
            ud.setCounselorname(bd.getCounselorname());
            ud.setDate(bd.getDate());
            ud.setFromTime(bd.getFromTime());
            ud.setToTime(bd.getToTime());
            userList.add(ud.build());
        }
        return userList;
    }


    //search service

    public static User.searchResponse.Builder searchAll(User.APIInput request, User.searchResponse.Builder reponse) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8084).usePlaintext().build();
        SearchAvailableSlotsBlockingStub userStub = SearchAvailableSlotsGrpc.newBlockingStub(channel);
        Empty requestChanel = Empty.newBuilder().build();
        searchResponse xyz = userStub.searchAll(requestChanel);

        List<User.Slot> ls = new ArrayList<User.Slot>();
        ls = copyDataListSlot(ls, xyz.getSlotArrList());

        reponse.addAllSlotArr(ls);


        return reponse;
    }

    public static User.searchResponse.Builder searchBySpecification(User.searchRequest request, User.searchResponse.Builder reponse) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8084).usePlaintext().build();
        SearchAvailableSlotsBlockingStub userStub = SearchAvailableSlotsGrpc.newBlockingStub(channel);
        searchRequest requestChanel = searchRequest.newBuilder().setSearchBy(request.getSearchBy()).setValue(request.getValue()).setLowerLimit(request.getLowerLimit()).setUpperLimit(request.getUpperLimit()).build();
        searchResponse xyz = userStub.searchBySpecification(requestChanel);

        List<User.Slot> ls = new ArrayList<User.Slot>();
        ls = copyDataListSlot(ls, xyz.getSlotArrList());

        reponse.addAllSlotArr(ls);


        return reponse;
    }

    public static List<User.Slot> copyDataListSlot(List<User.Slot> userList, List<Slots.Slot> bookingList) {
        User.Slot.Builder ud = User.Slot.newBuilder();
        for (Slots.Slot bd : bookingList) {
            ud.setDate(bd.getDate());
            ud.setSlotId(bd.getSlotId());
            ud.setCounselorName(bd.getCounselorName());
            ud.setCounselorContact(bd.getCounselorContact());
            ud.setFees(bd.getFees());
            ud.setSpecialization(bd.getSpecialization());
            ud.setFromTime(bd.getFromTime());
            ud.setToTime(bd.getToTime());
            userList.add(ud.build());
        }
        return userList;
    }

    //feedback service


    public static User.APIResponse.Builder reviewOnly(User.review request,
                                                      User.APIResponse.Builder reponse, String UID) {
        ManagedChannel channel =
                ManagedChannelBuilder.forAddress("localhost", 8086).usePlaintext().build();
        feedbackBlockingStub userStub = feedbackGrpc.newBlockingStub(channel);
        int
                userID = 0;
        try {
            userID = getIdByMail(UID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        review requestChanel =
                review.newBuilder().setUserId(userID).setCounselorId(request.getCounselorId()
                ).setReview(request.getReview()).build();

        APIResponse xyz = userStub.reviewOnly(requestChanel);
        reponse.setResponseCode(xyz.getResponseCode());
        reponse.setResponseMessage(xyz.getResponseMessage());

        return reponse;
    }

    public static User.APIResponse.Builder reviewAndRate(User.reviewandrate
                                                                 request, User.APIResponse.Builder reponse, String UID) {
        ManagedChannel
                channel = ManagedChannelBuilder.forAddress("localhost",
                8086).usePlaintext().build();
        feedbackBlockingStub userStub =
                feedbackGrpc.newBlockingStub(channel);
        int userID = 0;
        try {
            userID =
                    getIdByMail(UID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        reviewandrate requestChanel =
                reviewandrate.newBuilder().setUserId(userID).setCounselorId(request.
                        getCounselorId()).setReview(request.getReview()).setRating(request.getRating(
                )).build();

        APIResponse xyz = userStub.reviewAndRate(requestChanel);
        reponse.setResponseCode(xyz.getResponseCode());
        reponse.setResponseMessage(xyz.getResponseMessage());

        return reponse;
    }

    public static User.APIResponse.Builder deleteReview(User.deletereview
                                                                request, User.APIResponse.Builder reponse, String UID) {
        ManagedChannel
                channel = ManagedChannelBuilder.forAddress("localhost",
                8086).usePlaintext().build();
        feedbackBlockingStub userStub =
                feedbackGrpc.newBlockingStub(channel);
        int userID = 0;
        try {
            userID =
                    getIdByMail(UID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        deletereview requestChanel =
                deletereview.newBuilder().setUserId(userID).setReviewId(request.getReviewId()
                ).build();
        APIResponse xyz = userStub.deleteReview(requestChanel);
        reponse.setResponseCode(xyz.getResponseCode());
        reponse.setResponseMessage(xyz.getResponseMessage());

        return reponse;
    }

    public static User.APIResponse.Builder updateReview(User.updatereview
                                                                request, User.APIResponse.Builder reponse, String UID) {
        ManagedChannel
                channel = ManagedChannelBuilder.forAddress("localhost",
                8086).usePlaintext().build();
        feedbackBlockingStub userStub =
                feedbackGrpc.newBlockingStub(channel);
        int userID = 0;
        try {
            userID =
                    getIdByMail(UID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updatereview requestChanel =
                updatereview.newBuilder().setUserId(userID).setReviewId(request.getReviewId()
                ).setNewReview(request.getNewReview()).build();

        APIResponse xyz = userStub.updateReview(requestChanel);
        reponse.setResponseCode(xyz.getResponseCode());
        reponse.setResponseMessage(xyz.getResponseMessage());

        return reponse;
    }

    public static User.listresponse.Builder getAllFeedbackById(User.getfeedbackbyid request, User.listresponse.Builder
            reponse, String UID) {
        ManagedChannel channel =
                ManagedChannelBuilder.forAddress("localhost", 8086).usePlaintext().build();
        feedbackBlockingStub userStub = feedbackGrpc.newBlockingStub(channel);
        int userID = 0;
        try {
            userID = getIdByMail(UID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getfeedbackbyid requestChanel = getfeedbackbyid.newBuilder().setUserId(userID).build();
        listresponse xyz = userStub.getAllFeedbackById(requestChanel);
        List<User.reviewobject> ls = new ArrayList<User.reviewobject>();
        ls = copyDataListFeedback(ls, xyz.getReviewarrayList());
        reponse.addAllReviewarray(ls);
        reponse.setSuccessfailure(xyz.getSuccessfailure());
        return reponse;
    }

    public static List<User.reviewobject> copyDataListFeedback(List<User.reviewobject> userList,
                                                               List<Feedback.reviewobject> bookingList) {
        User.reviewobject.Builder ud = User.reviewobject.newBuilder();
        for (Feedback.reviewobject bd : bookingList) {
            ud.setReviewmessage(bd.getReviewmessage());
            ud.setRatinggiven(bd.getRatinggiven());
            userList.add(ud.build());
        }
        return userList;
    }

    public static int getIdByMail(String UID) throws SQLException {
        int userID = 0;
        Connection con = null;
        try {
            con = CapstoneDbConn.connectToDB();
        } catch (SQLException e1) { // TODO Auto-generated catch block
            e1.printStackTrace();
        }
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
                userID = Integer.parseInt(resultData.getString("user_id"));
        }
        return userID;
    }

}
