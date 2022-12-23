package com.goconsult;

import com.goconsult.service.SearchService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("in Search Service");
        io.grpc.Server server= ServerBuilder.forPort(8084).addService(new SearchService()).build();
        server.start();
        System.out.println("Search Service started on port number::"+server.getPort());

        server.awaitTermination();

    }
}
