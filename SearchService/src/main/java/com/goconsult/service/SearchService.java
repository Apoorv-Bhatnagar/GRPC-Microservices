package com.goconsult.service;

import com.goconsult.grpc.SearchAvailableSlotsGrpc;
import com.goconsult.grpc.Slots;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class SearchService extends SearchAvailableSlotsGrpc.SearchAvailableSlotsImplBase {


    @Override
    public void searchAll(Slots.Empty request, StreamObserver<Slots.searchResponse> responseObserver) {
        List<Slots.Slot> res=DataBase.searchAllAvailableSlotFromDb();

        Slots.searchResponse.Builder response=Slots.searchResponse.newBuilder();

        if(res.isEmpty())
        {
            System.out.println("No slot");
        }
        else {
            response.addAllSlotArr(res);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


    @Override
    public void searchBySpecification(Slots.searchRequest request, StreamObserver<Slots.searchResponse> responseObserver) {

        List<Slots.Slot> result=new ArrayList<>();
        Slots.searchResponse.Builder response=Slots.searchResponse.newBuilder();

        List<Slots.Slot> allSlot=DataBase.searchAllAvailableSlotFromDb();

        String searchBy=request.getSearchBy();
        String value=request.getValue();
        
        if(searchBy.trim().equalsIgnoreCase("date")){
          for(Slots.Slot slot:allSlot){
              if(slot.getDate().equals(value)){
              result.add(slot);
              }
          }
        }
        else  if(searchBy.trim().equalsIgnoreCase("specialization")){
            for(Slots.Slot slot:allSlot){
                if(slot.getSpecialization().equals(value)){
                    result.add(slot);
                }
            }
        } else if (searchBy.trim().equalsIgnoreCase("fees")) {
            for(Slots.Slot slot:allSlot){
                if(slot.getFees()>=request.getLowerLimit() && slot.getFees()<=request.getUpperLimit()){
                    result.add(slot);
                }
            }
        }

        if(result.isEmpty())
        {
            System.out.println("No slot");
        }
        else {
            response.addAllSlotArr(result);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
