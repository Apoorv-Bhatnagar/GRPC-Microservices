import com.goconsult.interceptor.serverInterceptor;
import com.goconsult.service.BookingService;
import com.goconsult.service.FeedbackService;
import com.goconsult.service.ProfileService;
import com.goconsult.service.SlotService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.println("in Counselor Service");
        io.grpc.Server server= ServerBuilder.forPort(8081).addService(new ProfileService()).addService(new SlotService()).addService(new BookingService()).addService(new FeedbackService())
                .intercept(new serverInterceptor()).build();
        server.start();
        System.out.println("Counselor Server started on:"+server.getPort());

        server.awaitTermination();

    }
}
