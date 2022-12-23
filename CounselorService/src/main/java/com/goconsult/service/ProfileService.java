package com.goconsult.service;

import com.goconsult.grpc.Counselor;
import com.goconsult.grpc.ProfileServiceGrpc;
import com.google.protobuf.UnknownFieldSet;
import io.grpc.stub.StreamObserver;


public class ProfileService extends ProfileServiceGrpc.ProfileServiceImplBase  {



    @Override
    public void viewProfile(Counselor.Empty request, StreamObserver<Counselor.counselor> responseObserver) {

        Counselor.counselor.Builder response=Counselor.counselor.newBuilder();
        Counselor.counselor.Builder temp =DbHelper.viewProfileHelper();
        if(temp==null)
        {
            System.out.println(response.setUnknownFields(UnknownFieldSet.newBuilder().build()));
            response.clear();

        }
       else {
           response=temp;
       }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    @Override
    public void updateProfile(Counselor.counselor request, StreamObserver<Counselor.responseMessage> responseObserver) {

        Counselor.responseMessage.Builder response=Counselor.responseMessage.newBuilder();

        String message=DbHelper.updateProfileHelper(request);

           if(message.contains("success")){
              response.setMessage("Details updated for Id: "+DbHelper.UID);
              response.setResponseCode(200);
                 }
           else if(message.equals("1")){
               response.setMessage("Counselor Details saved successfully");
               response.setResponseCode(200);
           }
            else{
                  response.setMessage(message);
                  response.setResponseCode(400);
                }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    @Override
    public void updatePassword(Counselor.updatePasswordDetail request, StreamObserver<Counselor.responseMessage> responseObserver) {

        Counselor.responseMessage.Builder response=Counselor.responseMessage.newBuilder();

        String message=DbHelper.updatePasswordHelper(request);
        if(message.equals("success")){
         response.setMessage("Password Updated");
         response.setResponseCode(200);
        }
        else{
            response.setMessage(message);
            response.setResponseCode(400);
        }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }




}

