import com.stackroute.service.FeedbackService;
import io.grpc.Server;
import java.io.IOException;
import io.grpc.ServerBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting a GRPC server!!!");
        Server server = ServerBuilder.forPort(8086).addService(new FeedbackService()).build();

        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Feedback Service started on port number:" + server.getPort());
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
