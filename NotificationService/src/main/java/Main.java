import com.gl.goConsult.service.notificationService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        io.grpc.Server server = ServerBuilder.forPort(8083).addService(new notificationService()).build();
        server.start();
        System.out.println("Notification Service started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}
