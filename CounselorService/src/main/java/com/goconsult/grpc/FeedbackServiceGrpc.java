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
public final class FeedbackServiceGrpc {

  private FeedbackServiceGrpc() {}

  public static final String SERVICE_NAME = "FeedbackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.feedbackResponse> getGetAllFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedback",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.feedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.feedbackResponse> getGetAllFeedbackMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.feedbackResponse> getGetAllFeedbackMethod;
    if ((getGetAllFeedbackMethod = FeedbackServiceGrpc.getGetAllFeedbackMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getGetAllFeedbackMethod = FeedbackServiceGrpc.getGetAllFeedbackMethod) == null) {
          FeedbackServiceGrpc.getGetAllFeedbackMethod = getGetAllFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.feedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FeedbackService", "getAllFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.feedbackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("getAllFeedback"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedbackServiceStub newStub(io.grpc.Channel channel) {
    return new FeedbackServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedbackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FeedbackServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedbackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FeedbackServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FeedbackServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *from Feedback Service
     * </pre>
     */
    public void getAllFeedback(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.feedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.feedbackResponse>(
                  this, METHODID_GET_ALL_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class FeedbackServiceStub extends io.grpc.stub.AbstractStub<FeedbackServiceStub> {
    private FeedbackServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *from Feedback Service
     * </pre>
     */
    public void getAllFeedback(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.feedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FeedbackServiceBlockingStub extends io.grpc.stub.AbstractStub<FeedbackServiceBlockingStub> {
    private FeedbackServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *from Feedback Service
     * </pre>
     */
    public com.goconsult.grpc.Counselor.feedbackResponse getAllFeedback(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FeedbackServiceFutureStub extends io.grpc.stub.AbstractStub<FeedbackServiceFutureStub> {
    private FeedbackServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FeedbackServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FeedbackServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *from Feedback Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.feedbackResponse> getAllFeedback(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_FEEDBACK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedbackServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedbackServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_FEEDBACK:
          serviceImpl.getAllFeedback((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.feedbackResponse>) responseObserver);
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

  private static abstract class FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedbackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Counselor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedbackService");
    }
  }

  private static final class FeedbackServiceFileDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier {
    FeedbackServiceFileDescriptorSupplier() {}
  }

  private static final class FeedbackServiceMethodDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedbackServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedbackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedbackServiceFileDescriptorSupplier())
              .addMethod(getGetAllFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
