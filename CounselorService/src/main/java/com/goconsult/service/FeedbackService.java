package com.goconsult.service;

import com.goconsult.grpc.Counselor;
import com.goconsult.grpc.FeedbackServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class FeedbackService extends FeedbackServiceGrpc.FeedbackServiceImplBase {

    @Override
    public void getAllFeedback(Counselor.Empty request, StreamObserver<Counselor.feedbackResponse> responseObserver) {

        Counselor.feedbackResponse.Builder response=Counselor.feedbackResponse.newBuilder();

        List<Counselor.Feedback> list=DbHelper.getAllFeedbackHelper(DbHelper.UID);

        if(list.isEmpty()){
            response.setMessage("No Feedbacks");
            System.out.println("No Feedbacks");
        }else{
            response.addAllFeedbackArr(list);
            response.setMessage("Total number of Feedbacks: "+list.size());
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }
}
