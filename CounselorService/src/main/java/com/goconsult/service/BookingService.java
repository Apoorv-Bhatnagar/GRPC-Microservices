package com.goconsult.service;

import com.goconsult.grpc.BookingServiceGrpc;
import com.goconsult.grpc.Counselor;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.stream.Collectors;

public class BookingService extends BookingServiceGrpc.BookingServiceImplBase {


    //functionality  in Booking service:8085
    @Override
    public void viewBookedSlots(Counselor.Date request, StreamObserver<Counselor.userSlotArr> responseObserver) {

        Counselor.userSlotArr.Builder response=Counselor.userSlotArr.newBuilder();


        List<Counselor.UserSlot> allBooking=DbHelper.viewBookedSlotForCounselorHelper(DbHelper.UID);

        List<Counselor.UserSlot> bookingOnDate=null;

       if(request.getDate().trim().length()==0){
        if(allBooking.isEmpty()){
            response.setMessage("No Bookings");
            System.out.println("No Bookings");
        }else{
            response.addAllSlotArr(allBooking).setMessage("Total number of Bookings: "+allBooking.size());
        }
       }else{
           bookingOnDate=allBooking.stream().filter(e->e.getDate().equals(request.getDate().trim())).collect(Collectors.toList());
           if(bookingOnDate.isEmpty()){
               response.setMessage("No Bookings on :"+request.getDate());
           }else{
               response.addAllSlotArr(bookingOnDate).setMessage("Total Booking on "+request.getDate()+" :"+bookingOnDate.size());

           }
       }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}
