package com.stackroute.feedback;

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
    comments = "Source: feedback.proto")
public final class feedbackGrpc {

  private feedbackGrpc() {}

  public static final String SERVICE_NAME = "feedback";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.review,
      com.stackroute.feedback.Feedback.APIResponse> getReviewOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reviewOnly",
      requestType = com.stackroute.feedback.Feedback.review.class,
      responseType = com.stackroute.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.review,
      com.stackroute.feedback.Feedback.APIResponse> getReviewOnlyMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.review, com.stackroute.feedback.Feedback.APIResponse> getReviewOnlyMethod;
    if ((getReviewOnlyMethod = feedbackGrpc.getReviewOnlyMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getReviewOnlyMethod = feedbackGrpc.getReviewOnlyMethod) == null) {
          feedbackGrpc.getReviewOnlyMethod = getReviewOnlyMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.review, com.stackroute.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "reviewOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.review.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("reviewOnly"))
                  .build();
          }
        }
     }
     return getReviewOnlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.reviewandrate,
      com.stackroute.feedback.Feedback.APIResponse> getReviewAndRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reviewAndRate",
      requestType = com.stackroute.feedback.Feedback.reviewandrate.class,
      responseType = com.stackroute.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.reviewandrate,
      com.stackroute.feedback.Feedback.APIResponse> getReviewAndRateMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.reviewandrate, com.stackroute.feedback.Feedback.APIResponse> getReviewAndRateMethod;
    if ((getReviewAndRateMethod = feedbackGrpc.getReviewAndRateMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getReviewAndRateMethod = feedbackGrpc.getReviewAndRateMethod) == null) {
          feedbackGrpc.getReviewAndRateMethod = getReviewAndRateMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.reviewandrate, com.stackroute.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "reviewAndRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.reviewandrate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("reviewAndRate"))
                  .build();
          }
        }
     }
     return getReviewAndRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.deletereview,
      com.stackroute.feedback.Feedback.APIResponse> getDeleteReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReview",
      requestType = com.stackroute.feedback.Feedback.deletereview.class,
      responseType = com.stackroute.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.deletereview,
      com.stackroute.feedback.Feedback.APIResponse> getDeleteReviewMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.deletereview, com.stackroute.feedback.Feedback.APIResponse> getDeleteReviewMethod;
    if ((getDeleteReviewMethod = feedbackGrpc.getDeleteReviewMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getDeleteReviewMethod = feedbackGrpc.getDeleteReviewMethod) == null) {
          feedbackGrpc.getDeleteReviewMethod = getDeleteReviewMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.deletereview, com.stackroute.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "deleteReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.deletereview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("deleteReview"))
                  .build();
          }
        }
     }
     return getDeleteReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.updatereview,
      com.stackroute.feedback.Feedback.APIResponse> getUpdateReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateReview",
      requestType = com.stackroute.feedback.Feedback.updatereview.class,
      responseType = com.stackroute.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.updatereview,
      com.stackroute.feedback.Feedback.APIResponse> getUpdateReviewMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.updatereview, com.stackroute.feedback.Feedback.APIResponse> getUpdateReviewMethod;
    if ((getUpdateReviewMethod = feedbackGrpc.getUpdateReviewMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getUpdateReviewMethod = feedbackGrpc.getUpdateReviewMethod) == null) {
          feedbackGrpc.getUpdateReviewMethod = getUpdateReviewMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.updatereview, com.stackroute.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "updateReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.updatereview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("updateReview"))
                  .build();
          }
        }
     }
     return getUpdateReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbyid,
      com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedbackById",
      requestType = com.stackroute.feedback.Feedback.getfeedbackbyid.class,
      responseType = com.stackroute.feedback.Feedback.listresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbyid,
      com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbyid, com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackByIdMethod;
    if ((getGetAllFeedbackByIdMethod = feedbackGrpc.getGetAllFeedbackByIdMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getGetAllFeedbackByIdMethod = feedbackGrpc.getGetAllFeedbackByIdMethod) == null) {
          feedbackGrpc.getGetAllFeedbackByIdMethod = getGetAllFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.getfeedbackbyid, com.stackroute.feedback.Feedback.listresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "getAllFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.getfeedbackbyid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.listresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("getAllFeedbackById"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbycounselorid,
      com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackForCounselorByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedbackForCounselorById",
      requestType = com.stackroute.feedback.Feedback.getfeedbackbycounselorid.class,
      responseType = com.stackroute.feedback.Feedback.listresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbycounselorid,
      com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackForCounselorByIdMethod() {
    io.grpc.MethodDescriptor<com.stackroute.feedback.Feedback.getfeedbackbycounselorid, com.stackroute.feedback.Feedback.listresponse> getGetAllFeedbackForCounselorByIdMethod;
    if ((getGetAllFeedbackForCounselorByIdMethod = feedbackGrpc.getGetAllFeedbackForCounselorByIdMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getGetAllFeedbackForCounselorByIdMethod = feedbackGrpc.getGetAllFeedbackForCounselorByIdMethod) == null) {
          feedbackGrpc.getGetAllFeedbackForCounselorByIdMethod = getGetAllFeedbackForCounselorByIdMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.feedback.Feedback.getfeedbackbycounselorid, com.stackroute.feedback.Feedback.listresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "getAllFeedbackForCounselorById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.getfeedbackbycounselorid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.feedback.Feedback.listresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("getAllFeedbackForCounselorById"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackForCounselorByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static feedbackStub newStub(io.grpc.Channel channel) {
    return new feedbackStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static feedbackBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new feedbackBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static feedbackFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new feedbackFutureStub(channel);
  }

  /**
   */
  public static abstract class feedbackImplBase implements io.grpc.BindableService {

    /**
     */
    public void reviewOnly(com.stackroute.feedback.Feedback.review request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReviewOnlyMethod(), responseObserver);
    }

    /**
     */
    public void reviewAndRate(com.stackroute.feedback.Feedback.reviewandrate request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReviewAndRateMethod(), responseObserver);
    }

    /**
     */
    public void deleteReview(com.stackroute.feedback.Feedback.deletereview request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReviewMethod(), responseObserver);
    }

    /**
     */
    public void updateReview(com.stackroute.feedback.Feedback.updatereview request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReviewMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedbackById(com.stackroute.feedback.Feedback.getfeedbackbyid request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedbackForCounselorById(com.stackroute.feedback.Feedback.getfeedbackbycounselorid request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackForCounselorByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReviewOnlyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.review,
                com.stackroute.feedback.Feedback.APIResponse>(
                  this, METHODID_REVIEW_ONLY)))
          .addMethod(
            getReviewAndRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.reviewandrate,
                com.stackroute.feedback.Feedback.APIResponse>(
                  this, METHODID_REVIEW_AND_RATE)))
          .addMethod(
            getDeleteReviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.deletereview,
                com.stackroute.feedback.Feedback.APIResponse>(
                  this, METHODID_DELETE_REVIEW)))
          .addMethod(
            getUpdateReviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.updatereview,
                com.stackroute.feedback.Feedback.APIResponse>(
                  this, METHODID_UPDATE_REVIEW)))
          .addMethod(
            getGetAllFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.getfeedbackbyid,
                com.stackroute.feedback.Feedback.listresponse>(
                  this, METHODID_GET_ALL_FEEDBACK_BY_ID)))
          .addMethod(
            getGetAllFeedbackForCounselorByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.feedback.Feedback.getfeedbackbycounselorid,
                com.stackroute.feedback.Feedback.listresponse>(
                  this, METHODID_GET_ALL_FEEDBACK_FOR_COUNSELOR_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class feedbackStub extends io.grpc.stub.AbstractStub<feedbackStub> {
    private feedbackStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackStub(channel, callOptions);
    }

    /**
     */
    public void reviewOnly(com.stackroute.feedback.Feedback.review request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReviewOnlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewAndRate(com.stackroute.feedback.Feedback.reviewandrate request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReviewAndRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReview(com.stackroute.feedback.Feedback.deletereview request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReview(com.stackroute.feedback.Feedback.updatereview request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedbackById(com.stackroute.feedback.Feedback.getfeedbackbyid request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedbackForCounselorById(com.stackroute.feedback.Feedback.getfeedbackbycounselorid request,
        io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackForCounselorByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class feedbackBlockingStub extends io.grpc.stub.AbstractStub<feedbackBlockingStub> {
    private feedbackBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.APIResponse reviewOnly(com.stackroute.feedback.Feedback.review request) {
      return blockingUnaryCall(
          getChannel(), getReviewOnlyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.APIResponse reviewAndRate(com.stackroute.feedback.Feedback.reviewandrate request) {
      return blockingUnaryCall(
          getChannel(), getReviewAndRateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.APIResponse deleteReview(com.stackroute.feedback.Feedback.deletereview request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.APIResponse updateReview(com.stackroute.feedback.Feedback.updatereview request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.listresponse getAllFeedbackById(com.stackroute.feedback.Feedback.getfeedbackbyid request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.feedback.Feedback.listresponse getAllFeedbackForCounselorById(com.stackroute.feedback.Feedback.getfeedbackbycounselorid request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackForCounselorByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class feedbackFutureStub extends io.grpc.stub.AbstractStub<feedbackFutureStub> {
    private feedbackFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.APIResponse> reviewOnly(
        com.stackroute.feedback.Feedback.review request) {
      return futureUnaryCall(
          getChannel().newCall(getReviewOnlyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.APIResponse> reviewAndRate(
        com.stackroute.feedback.Feedback.reviewandrate request) {
      return futureUnaryCall(
          getChannel().newCall(getReviewAndRateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.APIResponse> deleteReview(
        com.stackroute.feedback.Feedback.deletereview request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.APIResponse> updateReview(
        com.stackroute.feedback.Feedback.updatereview request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.listresponse> getAllFeedbackById(
        com.stackroute.feedback.Feedback.getfeedbackbyid request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.feedback.Feedback.listresponse> getAllFeedbackForCounselorById(
        com.stackroute.feedback.Feedback.getfeedbackbycounselorid request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackForCounselorByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REVIEW_ONLY = 0;
  private static final int METHODID_REVIEW_AND_RATE = 1;
  private static final int METHODID_DELETE_REVIEW = 2;
  private static final int METHODID_UPDATE_REVIEW = 3;
  private static final int METHODID_GET_ALL_FEEDBACK_BY_ID = 4;
  private static final int METHODID_GET_ALL_FEEDBACK_FOR_COUNSELOR_BY_ID = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final feedbackImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(feedbackImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVIEW_ONLY:
          serviceImpl.reviewOnly((com.stackroute.feedback.Feedback.review) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_REVIEW_AND_RATE:
          serviceImpl.reviewAndRate((com.stackroute.feedback.Feedback.reviewandrate) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_REVIEW:
          serviceImpl.deleteReview((com.stackroute.feedback.Feedback.deletereview) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REVIEW:
          serviceImpl.updateReview((com.stackroute.feedback.Feedback.updatereview) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK_BY_ID:
          serviceImpl.getAllFeedbackById((com.stackroute.feedback.Feedback.getfeedbackbyid) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK_FOR_COUNSELOR_BY_ID:
          serviceImpl.getAllFeedbackForCounselorById((com.stackroute.feedback.Feedback.getfeedbackbycounselorid) request,
              (io.grpc.stub.StreamObserver<com.stackroute.feedback.Feedback.listresponse>) responseObserver);
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

  private static abstract class feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    feedbackBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.feedback.Feedback.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("feedback");
    }
  }

  private static final class feedbackFileDescriptorSupplier
      extends feedbackBaseDescriptorSupplier {
    feedbackFileDescriptorSupplier() {}
  }

  private static final class feedbackMethodDescriptorSupplier
      extends feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    feedbackMethodDescriptorSupplier(String methodName) {
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
      synchronized (feedbackGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new feedbackFileDescriptorSupplier())
              .addMethod(getReviewOnlyMethod())
              .addMethod(getReviewAndRateMethod())
              .addMethod(getDeleteReviewMethod())
              .addMethod(getUpdateReviewMethod())
              .addMethod(getGetAllFeedbackByIdMethod())
              .addMethod(getGetAllFeedbackForCounselorByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
