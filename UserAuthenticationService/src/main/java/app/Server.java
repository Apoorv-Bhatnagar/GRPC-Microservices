package app;

import authentication.AuthService;
import io.grpc.ServerBuilder;
import registration.Registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        io.grpc.Server server = ServerBuilder.forPort(8080).addService(new AuthService()).addService(new Registration()).build().start();

        System.out.println("Authentication Service started on port number:" + server.getPort());
        server.awaitTermination();
    }

    public static Connection connect() {
        String url = "jdbc:postgresql://localhost:5432/GoConsult";
        String mySQLUname = "postgres";
        String mySQLpass = "akanksha";
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, mySQLUname, mySQLpass);
            System.out.println("Connection established successfully");
            return conn;
        } catch (SQLException e) {
            System.out.println("SQL Exception caught");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
