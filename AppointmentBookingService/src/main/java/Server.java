import com.globallogic.Services.BookingService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Starting a GRPC server!!!");
        io.grpc.Server server = ServerBuilder.forPort(8085).addService(new BookingService()).build();

        server.start();
        System.out.println("Appointment Booking Service started on port number:"+ server.getPort());
        server.awaitTermination();

    }
}
