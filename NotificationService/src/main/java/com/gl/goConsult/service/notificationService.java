package com.gl.goConsult.service;

import com.gl.goConsult.Notification;
import com.gl.goConsult.notificationGrpc;
import io.grpc.stub.StreamObserver;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class notificationService extends notificationGrpc.notificationImplBase {
    @Override
    public void registerNotification(Notification.notificationMessage request, StreamObserver<Notification.APIResponse> responseObserver) {
        Notification.APIResponse.Builder response = Notification.APIResponse.newBuilder();

        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "goconsult77@gmail.com";
        String recipient = request.getEmail();
        String sub = request.getSubject();
        String msg = request.getMessage();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                System.out.println("Password authentication is successfully");

                return new PasswordAuthentication("goconsult77@gmail.com", "rogrlkwvexlcfkrt");
            }
        });

        MimeMessage mimeMessage = new MimeMessage(session);

        try {
            mimeMessage.setFrom(from);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            mimeMessage.setSubject(sub);
            mimeMessage.setText(msg);

            Transport.send(mimeMessage);

            System.out.println("Message sent successfully");

            response.setResponseMessage("Message sent Successfully").setResponseCode(200);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void sendOtp(Notification.otpMessage request, StreamObserver<Notification.APIResponse> responseObserver) {

        int len = 4;
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++) {
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        int otpNumber = Integer.parseInt(new String(otp));

        Notification.APIResponse.Builder response = Notification.APIResponse.newBuilder();


        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "goconsult77@gmail.com";
        String recipient = request.getEmail();
        String sub = request.getSubject();
        String msg = String.format("Dear %s, %n%nYou have requested for a new password to log into GoConsult website. %n" +
                "Enter the following OTP to proceed.%nOTP- %d %n%n%nWarm Regards, %nGoConsult Team", recipient, otpNumber);
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                System.out.println("Password authentication is successfully");

                return new PasswordAuthentication("goconsult77@gmail.com", "lrepdcgnmqhecavn");
//              rprnulnzcpzjzvik
            }
        });

        session.setDebug(true);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom(from);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            mimeMessage.setSubject(sub);
            mimeMessage.setText(msg);

            Transport.send(mimeMessage);
            System.out.println("OTP sent successfully");

            response.setResponseMessage("Otp sent successfully");
            response.setResponseCode(otpNumber);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }
}
