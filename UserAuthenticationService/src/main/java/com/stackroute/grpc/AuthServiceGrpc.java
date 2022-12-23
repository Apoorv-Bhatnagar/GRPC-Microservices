package com.stackroute.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: auth_service.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.request,
      com.stackroute.grpc.AuthServiceOuterClass.response> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.stackroute.grpc.AuthServiceOuterClass.request.class,
      responseType = com.stackroute.grpc.AuthServiceOuterClass.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.request,
      com.stackroute.grpc.AuthServiceOuterClass.response> getLoginMethod() {
    io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.request, com.stackroute.grpc.AuthServiceOuterClass.response> getLoginMethod;
    if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
          AuthServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.grpc.AuthServiceOuterClass.request, com.stackroute.grpc.AuthServiceOuterClass.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest,
      com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> getForgetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgetPassword",
      requestType = com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest.class,
      responseType = com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest,
      com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> getForgetPasswordMethod() {
    io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest, com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> getForgetPasswordMethod;
    if ((getForgetPasswordMethod = AuthServiceGrpc.getForgetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getForgetPasswordMethod = AuthServiceGrpc.getForgetPasswordMethod) == null) {
          AuthServiceGrpc.getForgetPasswordMethod = getForgetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest, com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "forgetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("forgetPassword"))
                  .build();
          }
        }
     }
     return getForgetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest,
      com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest.class,
      responseType = com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest,
      com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest, com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
          AuthServiceGrpc.getResetPasswordMethod = getResetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest, com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("resetPassword"))
                  .build();
          }
        }
     }
     return getResetPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.stackroute.grpc.AuthServiceOuterClass.request request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void forgetPassword(com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getForgetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void resetPassword(com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.grpc.AuthServiceOuterClass.request,
                com.stackroute.grpc.AuthServiceOuterClass.response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getForgetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest,
                com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse>(
                  this, METHODID_FORGET_PASSWORD)))
          .addMethod(
            getResetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest,
                com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.stackroute.grpc.AuthServiceOuterClass.request request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgetPassword(com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.grpc.AuthServiceOuterClass.response login(com.stackroute.grpc.AuthServiceOuterClass.request request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse forgetPassword(com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getForgetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse resetPassword(com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.grpc.AuthServiceOuterClass.response> login(
        com.stackroute.grpc.AuthServiceOuterClass.request request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse> forgetPassword(
        com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse> resetPassword(
        com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_FORGET_PASSWORD = 1;
  private static final int METHODID_RESET_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.stackroute.grpc.AuthServiceOuterClass.request) request,
              (io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.response>) responseObserver);
          break;
        case METHODID_FORGET_PASSWORD:
          serviceImpl.forgetPassword((com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.forgetPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.stackroute.grpc.AuthServiceOuterClass.resetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.grpc.AuthServiceOuterClass.resetPasswordResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.grpc.AuthServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getForgetPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
