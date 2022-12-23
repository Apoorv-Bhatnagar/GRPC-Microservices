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
    comments = "Source: userRegistration.proto")
public final class registrationGrpc {

  private registrationGrpc() {}

  public static final String SERVICE_NAME = "registration";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.grpc.UserRegistration.request,
      com.stackroute.grpc.UserRegistration.response> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.stackroute.grpc.UserRegistration.request.class,
      responseType = com.stackroute.grpc.UserRegistration.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.grpc.UserRegistration.request,
      com.stackroute.grpc.UserRegistration.response> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.stackroute.grpc.UserRegistration.request, com.stackroute.grpc.UserRegistration.response> getRegisterMethod;
    if ((getRegisterMethod = registrationGrpc.getRegisterMethod) == null) {
      synchronized (registrationGrpc.class) {
        if ((getRegisterMethod = registrationGrpc.getRegisterMethod) == null) {
          registrationGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.grpc.UserRegistration.request, com.stackroute.grpc.UserRegistration.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.UserRegistration.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.grpc.UserRegistration.response.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static registrationStub newStub(io.grpc.Channel channel) {
    return new registrationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static registrationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new registrationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static registrationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new registrationFutureStub(channel);
  }

  /**
   */
  public static abstract class registrationImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.stackroute.grpc.UserRegistration.request request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.UserRegistration.response> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.grpc.UserRegistration.request,
                com.stackroute.grpc.UserRegistration.response>(
                  this, METHODID_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class registrationStub extends io.grpc.stub.AbstractStub<registrationStub> {
    private registrationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationStub(channel, callOptions);
    }

    /**
     */
    public void register(com.stackroute.grpc.UserRegistration.request request,
        io.grpc.stub.StreamObserver<com.stackroute.grpc.UserRegistration.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class registrationBlockingStub extends io.grpc.stub.AbstractStub<registrationBlockingStub> {
    private registrationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.grpc.UserRegistration.response register(com.stackroute.grpc.UserRegistration.request request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class registrationFutureStub extends io.grpc.stub.AbstractStub<registrationFutureStub> {
    private registrationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.grpc.UserRegistration.response> register(
        com.stackroute.grpc.UserRegistration.request request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final registrationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(registrationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.stackroute.grpc.UserRegistration.request) request,
              (io.grpc.stub.StreamObserver<com.stackroute.grpc.UserRegistration.response>) responseObserver);
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

  private static abstract class registrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    registrationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.grpc.UserRegistration.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("registration");
    }
  }

  private static final class registrationFileDescriptorSupplier
      extends registrationBaseDescriptorSupplier {
    registrationFileDescriptorSupplier() {}
  }

  private static final class registrationMethodDescriptorSupplier
      extends registrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    registrationMethodDescriptorSupplier(String methodName) {
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
      synchronized (registrationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new registrationFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
