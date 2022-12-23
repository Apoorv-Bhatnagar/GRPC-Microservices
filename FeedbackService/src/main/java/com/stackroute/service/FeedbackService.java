package com.stackroute.service;

import com.stackroute.feedback.Feedback;
import com.stackroute.feedback.Feedback.*;
import com.stackroute.feedback.feedbackGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.*;

public class FeedbackService extends feedbackGrpc.feedbackImplBase {


    @Override
    public void getAllFeedbackForCounselorById(getfeedbackbycounselorid request,
                                               StreamObserver<listresponse> responseObserver) {
        // TODO Auto-generated method stub

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int counselor_id = request.getCounselorId();
        // int counselor_id =request.getCounselorId();
        //  String review = request.getReview();
        //  int rating = request.getRating();
        System.out.println("data passed from user: " + counselor_id);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        //  int doctorcount=0;
        //Creating the Statement object
        try {
            Statement ps = con.createStatement();


            //Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM counselor WHERE counselor_id= " + counselor_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            //  ResultSet rs1=ps.executeQuery("SELECT COUNT(*) FROM COUNSELOR WHERE COUNSELLOR_ID= "+counselor_id);
            // rs1.next();
            // doctorcount=rs1.getInt(1);
            //  System.out.println("doctor count found : "+doctorcount);
        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        Feedback.listresponse.Builder response = Feedback.listresponse.newBuilder();

        if (usercount > 0) {
            try {
                Statement stmt = con.createStatement();
                //Retrieving the data
                ResultSet rs = stmt.executeQuery("select REVIEW,RATING from review where counselor_id=" + counselor_id);


                int count = 0;
                while (rs.next()) {
                    String review = rs.getString(1);
                    int rating = rs.getInt(2);
                    Feedback.reviewobject.Builder build = Feedback.reviewobject.newBuilder();
                    build.setReviewmessage(review).setRatinggiven(rating).build();
                    System.out.println(build.getRatinggiven());
                    System.out.println(build.getReviewmessage());
                    response.addReviewarray(count, build);
                    count++;


                }
            } catch (Exception e) {
                System.out.println(e);
            }

            response.setSuccessfailure("Counselor  id present").build();
            // response.setResponseCode(0).build();

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } else {
            //  Feedback.listresponse.Builder response=Feedback.listresponse.newBuilder();
            response.setSuccessfailure("Counselor id not present").build();
            // response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }


    }

    @Override
    public void getAllFeedbackById(Feedback.getfeedbackbyid request, StreamObserver<Feedback.listresponse> responseObserver) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int user_id = request.getUserId();
        // int counselor_id =request.getCounselorId();
        //  String review = request.getReview();
        //  int rating = request.getRating();
        System.out.println("data passed from user: " + user_id);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        //  int doctorcount=0;
//Creating the Statement object
        try {
            Statement ps = con.createStatement();


//Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM USERDATA WHERE USER_ID= " + user_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            //  ResultSet rs1=ps.executeQuery("SELECT COUNT(*) FROM COUNSELOR WHERE COUNSELLOR_ID= "+counselor_id);
            // rs1.next();
            // doctorcount=rs1.getInt(1);
            //  System.out.println("doctor count found : "+doctorcount);
        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        Feedback.listresponse.Builder response = Feedback.listresponse.newBuilder();

        if (usercount > 0) {
            try {
                Statement stmt = con.createStatement();
                //Retrieving the data
                ResultSet rs = stmt.executeQuery("select REVIEW,RATING from review where user_id=" + user_id);


                int count = 0;
                while (rs.next()) {
                    String review = rs.getString(1);
                    int rating = rs.getInt(2);
                    Feedback.reviewobject.Builder build = Feedback.reviewobject.newBuilder();
                    build.setReviewmessage(review).setRatinggiven(rating).build();
                    System.out.println(build.getRatinggiven());
                    System.out.println(build.getReviewmessage());
                    response.addReviewarray(count, build);
                    count++;


                }
            } catch (Exception e) {
                System.out.println(e);
            }

            response.setSuccessfailure("User id present").build();
            // response.setResponseCode(0).build();

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } else {
            //  Feedback.listresponse.Builder response=Feedback.listresponse.newBuilder();
            response.setSuccessfailure("User id not present").build();
            // response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateReview(Feedback.updatereview request, StreamObserver<APIResponse> responseObserver) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int user_id = request.getUserId();
        int review_id = request.getReviewId();
        String newreview = request.getNewReview();
        //  int counselor_id =request.getCounselorId();
        // String review = request.getReview();
        //int rating = request.getRating();
        System.out.println("data passed from user: " + user_id);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        // int doctorcount=0;
        int reviewcount = 0;
        int review_by_user = 0;

        //Creating the Statement object
        try {
            Statement ps = con.createStatement();


            //Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM USERDATA WHERE USER_ID= " + user_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            ResultSet rs1 = ps.executeQuery("SELECT COUNT(*) FROM REVIEW WHERE REVIEW_ID= " + review_id);
            rs1.next();
            reviewcount = rs1.getInt(1);
            System.out.println("review count count found : " + reviewcount);
            ResultSet rs2 = ps.executeQuery("SELECT COUNT(*) FROM REVIEW WHERE REVIEW_ID= " + review_id + " and user_id=" + user_id);
            rs2.next();
            review_by_user = rs2.getInt(1);
            System.out.println("review count count found : " + review_by_user);

        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        int result = 0;
        if (usercount > 0) {
            if (reviewcount > 0) {
                if (review_by_user > 0) {
                    try {
                        Statement ps = con.createStatement();


                        //Retrieving the result
                        String sql = "UPDATE REVIEW SET REVIEW='" + newreview + "' where review_id= " + review_id;
                        System.out.println("sql getting passed is:  " + sql);
                        PreparedStatement P = con.prepareStatement(sql);
                        result = P.executeUpdate();


                    } catch (Exception e) {
                        System.out.println("Error occured" + e);
                    }

                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    if (result != 0) {
                        response.setResponseMessage("review updated successfully").build();
                        response.setResponseCode(202).build();
                    } else {
                        response.setResponseMessage("Your review not updated successfully").build();
                        response.setResponseCode(0).build();
                    }
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                } else {
                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    response.setResponseMessage("The review id you are passing is not submitted by the user id being passed!!!!!").build();
                    response.setResponseCode(0).build();
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                }

            } else {
                Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                response.setResponseMessage("Review id is not present!!!!!").build();
                response.setResponseCode(0).build();
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }

        } else {
            Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
            response.setResponseMessage("user id is not present!!!!!").build();
            response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteReview(Feedback.deletereview request, StreamObserver<APIResponse> responseObserver) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int user_id = request.getUserId();
        int review_id = request.getReviewId();
        //  int counselor_id =request.getCounselorId();
        // String review = request.getReview();
        //int rating = request.getRating();
        System.out.println("data passed from user: " + user_id);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        // int doctorcount=0;
        int reviewcount = 0;
        int review_by_user = 0;

        //Creating the Statement object
        try {
            Statement ps = con.createStatement();


            //Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM USERDATA WHERE USER_ID= " + user_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            ResultSet rs1 = ps.executeQuery("SELECT COUNT(*) FROM REVIEW WHERE REVIEW_ID= " + review_id);
            rs1.next();
            reviewcount = rs1.getInt(1);
            System.out.println("review count count found : " + reviewcount);
            ResultSet rs2 = ps.executeQuery("SELECT COUNT(*) FROM REVIEW WHERE REVIEW_ID= " + review_id + " and user_id=" + user_id);
            rs2.next();
            review_by_user = rs2.getInt(1);
            System.out.println("review count count found : " + review_by_user);

        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        int result = 0;
        if (usercount > 0) {
            if (reviewcount > 0) {
                if (review_by_user > 0) {
                    try {
                        Statement ps = con.createStatement();


                        //Retrieving the result
                        String sql = "DELETE FROM REVIEW WHERE REVIEW_ID= " + review_id;
                        PreparedStatement P = con.prepareStatement(sql);
                        result = P.executeUpdate();


                    } catch (Exception e) {
                        System.out.println("Error occured" + e);
                    }

                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    if (result != 0) {
                        response.setResponseMessage("review deleted successfully").build();
                        response.setResponseCode(202).build();
                    } else {
                        response.setResponseMessage("Your review not deleted successfully").build();
                        response.setResponseCode(0).build();
                    }
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                } else {
                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    response.setResponseMessage("The review id you are passing is not submitted by the user id being passed!!!!!").build();
                    response.setResponseCode(0).build();
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                }

            } else {
                Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                response.setResponseMessage("Review id is not present!!!!!").build();
                response.setResponseCode(0).build();
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }

        } else {
            Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
            response.setResponseMessage("user id is not present!!!!!").build();
            response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void reviewOnly(review request, StreamObserver<APIResponse> responseObserver) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int user_id = request.getUserId();
        int counselor_id = request.getCounselorId();
        String review = request.getReview();
        //int rating = request.getRating();
        System.out.println("data passed from user: " + user_id + "  " + counselor_id + "  " + review);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        int doctorcount = 0;
        //Creating the Statement object
        try {
            Statement ps = con.createStatement();


            //Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM USERDATA WHERE USER_ID= " + user_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            ResultSet rs1 = ps.executeQuery("SELECT COUNT(*) FROM COUNSELOR WHERE COUNSELOR_ID= " + counselor_id);
            rs1.next();
            doctorcount = rs1.getInt(1);
            System.out.println("doctor count found : " + doctorcount);
        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        if (usercount > 0) {
            if (doctorcount > 0) {
                String sql = "insert into review (counselor_id, user_id,review) values(?,?,?)";
                int result = 0;
                try {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, counselor_id);
                    ps.setInt(2, user_id);
                    ps.setString(3, review);
                    //  ps.setInt(4,rating);
                    result = ps.executeUpdate();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                if (result != 0) {
                    response.setResponseMessage("Your review submitted successfully").build();
                    response.setResponseCode(202).build();
                } else {
                    response.setResponseMessage("Your review not submitted successfully").build();
                    response.setResponseCode(0).build();
                }
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            } else {
                Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                response.setResponseMessage("Doctor id is not present !! For which you are giving review ,please give correct id").build();
                response.setResponseCode(0).build();
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }


        } else {
            Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
            response.setResponseMessage("user id is not present!!!!!").build();
            response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }


    }

    @Override
    public void reviewAndRate(reviewandrate request, StreamObserver<APIResponse> responseObserver) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GoConsult", "postgres", "akanksha");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int user_id = request.getUserId();
        int counselor_id = request.getCounselorId();
        String review = request.getReview();
        int rating = request.getRating();
        System.out.println("data passed from user: " + user_id + "  " + counselor_id + "  " + review);

        System.out.println("Checking iff user id present in db  ");
        int usercount = 0;
        int doctorcount = 0;
//Creating the Statement object
        try {
            Statement ps = con.createStatement();


//Retrieving the result
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) FROM USERDATA WHERE USER_ID= " + user_id);
            rs.next();
            usercount = rs.getInt(1);
            System.out.println(rs.toString());
            System.out.println("user found:  " + usercount);
            ResultSet rs1 = ps.executeQuery("SELECT COUNT(*) FROM COUNSELOR WHERE COUNSELOR_ID= " + counselor_id);
            rs1.next();
            doctorcount = rs1.getInt(1);
            System.out.println("doctor count found : " + doctorcount);
        } catch (Exception e) {
            System.out.println("Error occured" + e);
        }
        if (usercount > 0) {
            if (doctorcount > 0) {
                if (rating < 1 || rating > 5) {
                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    response.setResponseMessage("Rating should be from 1-5").build();
                    response.setResponseCode(0).build();
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                } else {
                    String sql = "insert into review (counselor_id, user_id,review,rating) values(?,?,?,?)";
                    int result = 0;
                    try {
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, counselor_id);
                        ps.setInt(2, user_id);
                        ps.setString(3, review);
                        ps.setInt(4, rating);
                        result = ps.executeUpdate();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                    if (result != 0) {
                        response.setResponseMessage("Your review submitted successfully").build();
                        response.setResponseCode(202).build();
                    } else {
                        response.setResponseMessage("Your review not submitted successfully").build();
                        response.setResponseCode(0).build();
                    }
                    responseObserver.onNext(response.build());
                    responseObserver.onCompleted();
                }
            } else {
                Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
                response.setResponseMessage("Doctor id is not present !! For which you are giving review ,please give correct id").build();
                response.setResponseCode(0).build();
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }


        } else {
            Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();
            response.setResponseMessage("user id is not present!!!!!").build();
            response.setResponseCode(0).build();
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }


    }


}
