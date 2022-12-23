import java.io.IOException;

import Services.UserService;
import Services.userInterceptor;
import io.grpc.ServerBuilder;

public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Starting a GRPC server!!");
		io.grpc.Server server = ServerBuilder.forPort(8082).addService(new UserService()).intercept(new userInterceptor()).build();
		server.start();
		System.out.println("User Service started on port number:: " + server.getPort());
		server.awaitTermination();

	}
}
