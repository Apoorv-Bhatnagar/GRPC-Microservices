package com.goconsult.grpc;

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
    comments = "Source: Counselor.proto")
public final class ProfileServiceGrpc {

  private ProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "ProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.counselor> getViewProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewProfile",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.counselor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.counselor> getViewProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.counselor> getViewProfileMethod;
    if ((getViewProfileMethod = ProfileServiceGrpc.getViewProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getViewProfileMethod = ProfileServiceGrpc.getViewProfileMethod) == null) {
          ProfileServiceGrpc.getViewProfileMethod = getViewProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.counselor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProfileService", "viewProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.counselor.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("viewProfile"))
                  .build();
          }
        }
     }
     return getViewProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProfile",
      requestType = com.goconsult.grpc.Counselor.counselor.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = ProfileServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getUpdateProfileMethod = ProfileServiceGrpc.getUpdateProfileMethod) == null) {
          ProfileServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProfileService", "updateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.counselor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("updateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassword",
      requestType = com.goconsult.grpc.Counselor.updatePasswordDetail.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail, com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = ProfileServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getUpdatePasswordMethod = ProfileServiceGrpc.getUpdatePasswordMethod) == null) {
          ProfileServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.updatePasswordDetail, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProfileService", "updatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.updatePasswordDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("updatePassword"))
                  .build();
          }
        }
     }
     return getUpdatePasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileServiceStub newStub(io.grpc.Channel channel) {
    return new ProfileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProfileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProfileServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProfileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void viewProfile(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor> responseObserver) {
      asyncUnimplementedUnaryCall(getViewProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getViewProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.counselor>(
                  this, METHODID_VIEW_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.counselor,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getUpdatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.updatePasswordDetail,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class ProfileServiceStub extends io.grpc.stub.AbstractStub<ProfileServiceStub> {
    private ProfileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void viewProfile(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProfileServiceBlockingStub extends io.grpc.stub.AbstractStub<ProfileServiceBlockingStub> {
    private ProfileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.counselor viewProfile(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updateProfile(com.goconsult.grpc.Counselor.counselor request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProfileServiceFutureStub extends io.grpc.stub.AbstractStub<ProfileServiceFutureStub> {
    private ProfileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.counselor> viewProfile(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updateProfile(
        com.goconsult.grpc.Counselor.counselor request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updatePassword(
        com.goconsult.grpc.Counselor.updatePasswordDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_PROFILE = 0;
  private static final int METHODID_UPDATE_PROFILE = 1;
  private static final int METHODID_UPDATE_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIEW_PROFILE:
          serviceImpl.viewProfile((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.goconsult.grpc.Counselor.counselor) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((com.goconsult.grpc.Counselor.updatePasswordDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
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

  private static abstract class ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Counselor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfileService");
    }
  }

  private static final class ProfileServiceFileDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier {
    ProfileServiceFileDescriptorSupplier() {}
  }

  private static final class ProfileServiceMethodDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProfileServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfileServiceFileDescriptorSupplier())
              .addMethod(getViewProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getUpdatePasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
