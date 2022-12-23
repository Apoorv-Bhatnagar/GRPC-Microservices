package authentication;

import app.Server;
import com.gl.goConsult.Notification;
import com.gl.goConsult.notificationGrpc;
import com.stackroute.grpc.AuthServiceGrpc;
import com.stackroute.grpc.AuthServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {
    Map<String, Integer> map = new HashMap<>();
    int otpResponse;

    @Override
    public void login(AuthServiceOuterClass.request request, StreamObserver<AuthServiceOuterClass.response> responseObserver) {
        JWTGenerator jwt = new JWTGenerator();
        System.out.println("Inside login method!!!!!");
        AuthServiceOuterClass.response.Builder response = AuthServiceOuterClass.response.newBuilder();

        Connection connection = Server.connect();
        String sqlData = "select email from userdata where email= ? and password=? union all select email from counselor where email=? and password=?";
        try {
            PreparedStatement psData = connection.prepareStatement(sqlData);
            psData.setString(1, request.getName());
            psData.setString(2, request.getPassword());
            psData.setString(3, request.getName());
            psData.setString(4, request.getPassword());
            ResultSet rs = psData.executeQuery();
            if (rs.next()) {
                System.out.println("login successful");
                response.setMessage("Successfully logged in").setResponseCode(123).setJwtResponse(jwt.generateJWT(request)).build();
            } else {
                response.setMessage("user doesnt exist");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void forgetPassword(AuthServiceOuterClass.forgetPasswordRequest request, StreamObserver<AuthServiceOuterClass.forgetPasswordResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8083).usePlaintext().build();
        Notification.otpMessage otpMessage = Notification.otpMessage.newBuilder().setEmail(request.getEmail())
                .setSubject("OTP for Password Reset- GoConsult")

                .build();
        notificationGrpc.notificationBlockingStub blockingStub = notificationGrpc.newBlockingStub(channel);
        AuthServiceOuterClass.forgetPasswordResponse.Builder response = AuthServiceOuterClass.forgetPasswordResponse.newBuilder();
        String sqlData = "select email from userdata where email= ? union all select email from counselor where email=?";
        Connection connection = Server.connect();
        try {
            PreparedStatement psData = connection.prepareStatement(sqlData);
            psData.setString(1, request.getEmail());
            psData.setString(2, request.getEmail());
            ResultSet rs = psData.executeQuery();
            if (rs.next()) {
                System.out.println("user exist");
                otpResponse = blockingStub.sendOtp(otpMessage).getResponseCode();
                System.out.println(otpResponse);
                map.put(request.getEmail(), otpResponse);

                response.setMessage("OTp send successfully-  " + otpResponse);
            } else {
                System.out.println("email doesnt exist");
                response.setMessage("User doesn't exist");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void resetPassword(AuthServiceOuterClass.resetPasswordRequest request, StreamObserver<AuthServiceOuterClass.resetPasswordResponse> responseObserver) {
        AuthServiceOuterClass.resetPasswordResponse.Builder builder = AuthServiceOuterClass.resetPasswordResponse.newBuilder();

        if (request.getOtp() == otpResponse) {
            System.out.println("HIIII");
            String key = findKey(map, otpResponse);
            System.out.println(key);
            Connection connection = Server.connect();
            try {
                PreparedStatement ps1 = connection.prepareStatement("BEGIN TRANSACTION;\n" +
                        "\n" +
                        "UPDATE userdata\n" +
                        "SET password= ? \n" +
                        "WHERE email = ?;\n" +
                        "UPDATE counselor\n" +
                        "SET password=? \n" +
                        "WHERE email = ?;\n" +
                        "\n" +
                        "COMMIT;");
                ps1.setString(1, request.getPassword());
                ps1.setString(2, key);
                ps1.setString(3, request.getPassword());
                ps1.setString(4, key);
                ps1.executeUpdate();
                System.out.println("password updated");
                builder.setResponseMessage("Password Updated Successfully");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            builder.setResponseMessage("Invalid OTP");
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    private String findKey(Map<String, Integer> map, Integer value) {
        return map
                .entrySet()
                .stream()
                .filter(e -> Objects.equals(e.getValue(), value))
                .map(Map.Entry::getKey).findAny().get();
    }
}