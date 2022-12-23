package com.globallogic.Services;

import com.globallogic.slotBooking.Booking;
import com.globallogic.slotBooking.Notification;
import com.globallogic.slotBooking.bookingGrpc;
import com.globallogic.slotBooking.notificationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class BookingService extends bookingGrpc.bookingImplBase {

    @Override
    public void booking(Booking.bookingInput request, StreamObserver<Booking.APIResponse> responseObserver) {
        int slotId = request.getSlotId();
        int userId = request.getUserId();
        int counsellorId = request.getCounsellorId();
        Date date = Date.valueOf(request.getDate());
        Time fromTime = Time.valueOf(request.getFromTime());
        Time toTime = Time.valueOf(request.getToTime());
        int totalAmount = 0;
        Booking.APIResponse.Builder response = Booking.APIResponse.newBuilder();
        List<String> list ;
        try {
            totalAmount = getFees(counsellorId);
            list = getNotificationDetails(userId);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String email = list.get(0);
        String name = list.get(1);
        int result = storeDetails(slotId, userId, totalAmount, counsellorId, date, fromTime, toTime);
        if (result == 1) {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
            notificationGrpc.notificationBlockingStub userStub = notificationGrpc.newBlockingStub(channel);

            Notification.notificationMessage message = Notification.notificationMessage.newBuilder().setSubject("Appointment Booked").setMessage("Your Appointment has been Booked for " + date + " from : " + fromTime + " to : " + toTime).setEmail(email).setName(name).build();
            Notification.APIResponse serverResponse = userStub.registerNotification(message);
            response.setResponseCode(200).setResponseMessage("Booking Completed !!!");
        } else {
            response.setResponseCode(400).setResponseMessage("Booking Not Completed !!!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void cancelBooking(Booking.cancelInput request, StreamObserver<Booking.APIResponse> responseObserver) {
        String email = request.getEmail();
        Date date = Date.valueOf(request.getDate());
        Time fromTime = Time.valueOf(request.getFromTime());

        Booking.APIResponse.Builder response = Booking.APIResponse.newBuilder();

        int userId = checkUserExists(email);
        List<String> list = new ArrayList<String>();
        try {
            list = getNotificationDetails(userId);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (userId == 0) {
            response.setResponseMessage("User Not Found !!!").setResponseCode(400);
        } else {
            int result = deleteBooking(userId, date, fromTime);
            System.out.println(result);
            if (result > 0) {
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
                notificationGrpc.notificationBlockingStub userStub = notificationGrpc.newBlockingStub(channel);

                Notification.notificationMessage message = Notification.notificationMessage.newBuilder().setEmail(email).setMessage("Your Booking has been Cancelled Successfully...!!!").setSubject("Booking Cancellation").setName(list.get(1)).build();
                Notification.APIResponse serverResponse = userStub.registerNotification(message);
                response.setResponseMessage("Appointment has been Canceled !!!").setResponseCode(200);
            } else {
                response.setResponseMessage("Appointment has not been Canceled. Please Check date or time...!!!").setResponseCode(100);
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void rescheduleBooking(Booking.rescheduleInput request, StreamObserver<Booking.APIResponse> responseObserver) {
        String email = request.getEmail();
        Date date = Date.valueOf(request.getDate());
        Time fromTime = Time.valueOf(request.getFromTime());
        Time toTime = Time.valueOf(request.getToTime());

        Booking.APIResponse.Builder response = Booking.APIResponse.newBuilder();

        int userId = checkUserExists(email);
        if (userId == 0) {
            response.setResponseMessage("User Not Found !!!").setResponseCode(400);
        } else {
            int result = reschedule(userId, date, fromTime, toTime);
            System.out.println(result);
            if (result > 0) {
                response.setResponseMessage("Appointment has been Rescheduled !!!").setResponseCode(200);
            } else {
                response.setResponseMessage("Appointment has not been Rescheduled. Please try again....!!!").setResponseCode(100);
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    public void getdata(Booking.request request, StreamObserver<Booking.APIResponse1> responseObserver) {
        String counselor_email=request.getEmail();
        String date= request.getDate();
        List<Booking.data> ls=new ArrayList<Booking.data>();
        Booking.APIResponse1.Builder response=Booking.APIResponse1.newBuilder();
        int count=0;
        try {
            ResultSet rs= getdetails(counselor_email,date);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
            DateFormat dateFormat2 = new SimpleDateFormat("hh:mm:ss");
            while(rs.next())
            {
                String user_name=rs.getString("user_name");
                String dates=dateFormat.format(rs.getObject("dates"));
                String fromTime=dateFormat2.format(rs.getObject("from_time"));
                String toTime=dateFormat2.format(rs.getObject("to_time"));
                Booking.data.Builder rspnse=Booking.data.newBuilder();
                rspnse.setUsername(user_name).setDate(dates).setFromTime(fromTime).setToTime(toTime);
                ls.add(rspnse.build());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (ls.isEmpty()){
            response.setMessagecode("100").setMessageresponse("No Appointments Found");
        }else {
            response.addAllResponse(ls).setMessagecode("200");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPatientAppointments(Booking.patientRequest request, StreamObserver<Booking.APIResponse2> responseObserver) {
        String user_email =request.getEmail();
        List<Booking.data1> ls=new ArrayList<Booking.data1>();
        Booking.APIResponse2.Builder response=Booking.APIResponse2.newBuilder();
        int count=0;
        try {
            ResultSet rs= getPatientDetails(user_email);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
            DateFormat dateFormat2 = new SimpleDateFormat("hh:mm:ss");
            while(rs.next())
            {
                String counselor_name = rs.getString("counselor_name");
                String dates=dateFormat.format(rs.getObject("dates"));
                String fromTime=dateFormat2.format(rs.getObject("from_time"));
                String toTime=dateFormat2.format(rs.getObject("to_time"));
                Booking.data1.Builder rspnse=Booking.data1.newBuilder();
                rspnse.setCounselorname(counselor_name).setDate(dates).setFromTime(fromTime).setToTime(toTime);
                ls.add(rspnse.build());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (ls.isEmpty()){
            response.setMessagecode("100").setMessageresponse("No Appointments Found");
        }else {
            response.addAllResponse(ls).setMessagecode("200");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    public int storeDetails(int slotId, int userId, int totalAmount, int counsellorId, java.util.Date date, Time fromTime, Time toTime) {
        try {
            Connection con = connectDb();
            System.out.println("Connection established successfully");
            String query = "Insert into booking(slot_Id, user_Id, total_Amount,counselor_id, dates, from_time, to_time) values(?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, slotId);
            statement.setInt(2, userId);
            statement.setInt(3, totalAmount);
            statement.setInt(4, counsellorId);
            statement.setObject(5, date);
            statement.setTime(6, fromTime);
            statement.setTime(7, toTime);

            int result = statement.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.out.println("SQL Exception caught");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int checkUserExists(String email) {
        int result = 0;
        try {
            Connection con = connectDb();
            System.out.println("Connection established successfully");
            String query = "select user_id from userdata where email = ?;";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                result = rs.getInt("user_Id");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception caught");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int deleteBooking(int userId, Date date, Time fromTime) {
        try {
            Connection con = connectDb();
            System.out.println("Connection established successfully");
            String query = "delete from booking where user_id = ? and dates = ? and from_time = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, userId);
            statement.setObject(2, date);
            statement.setTime(3, fromTime);
            int result = statement.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.out.println("SQL Exception caught");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int reschedule(int userId, java.util.Date date, Time fromTime, Time toTime) {
        try {
            Connection con = connectDb();
            System.out.println("Connection established successfully");
            String query = "update booking set dates = ?, from_time = ?, to_time = ? where user_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setObject(1, date);
            statement.setTime(2, fromTime);
            statement.setTime(3, toTime);
            statement.setInt(4, userId);
            int result = statement.executeUpdate();
            return result;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("SQL Exception caught");
            throw new RuntimeException(e);
        }
    }

    public ResultSet getdetails(String counselor_email, String date) throws ClassNotFoundException, SQLException {
        Connection con = connectDb();
        String sql = "select userdata.user_name ,booking.dates ,booking.from_time,booking.to_time from booking inner join userdata on booking.user_id=userdata.user_id inner join counselor on booking.counselor_id=counselor.counselor_id where counselor.email=? and dates=?";
        PreparedStatement ps = null;
        ps = con.prepareStatement(sql);
        ps.setString(1, counselor_email);
        ps.setDate(2, Date.valueOf(date));
        ResultSet rs = ps.executeQuery();
        System.out.print(rs);
        return rs;
    }

    public List<String> getNotificationDetails(int userId) throws ClassNotFoundException, SQLException {
        List<String> ls = new ArrayList<String>();
        Connection con = connectDb();
        String sql = "select email, user_name from userdata where user_id = ?";
        PreparedStatement ps = null;
        ps = con.prepareStatement(sql);
        ps.setInt(1, userId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            ls.add(rs.getString("email"));
            ls.add(rs.getString("user_name"));
        }
        return ls;
    }

    public ResultSet getPatientDetails(String user_email) throws ClassNotFoundException, SQLException {
        Connection con = connectDb();
        String sql = "select counselor.counselor_name ,booking.dates ,booking.from_time,booking.to_time from booking inner join userdata on booking.user_id=userdata.user_id inner join counselor on booking.counselor_id=counselor.counselor_id where userdata.email=? ";
        PreparedStatement ps = null;
        ps = con.prepareStatement(sql);
        ps.setString(1, user_email);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public int getFees(int counselorId) throws ClassNotFoundException, SQLException {
        Connection con = connectDb();
        String sql = "select fees from counselor where counselor_id = ?";
        PreparedStatement ps = null;
        ps = con.prepareStatement(sql);
        ps.setInt(1, counselorId);
        ResultSet rs = ps.executeQuery();
        int res = 0;
        if (rs.next()) {
            res = rs.getInt("fees");
        }
        return res;
    }

    public Connection connectDb() throws SQLException, ClassNotFoundException {
        Connection con = null;
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        return con;
    }
}
