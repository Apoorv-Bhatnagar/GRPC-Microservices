package com.stackroute.CapstoneUser;

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
    comments = "Source: User.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.userDetails,
      com.stackroute.CapstoneUser.User.APIResponse> getUserUpdationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userUpdation",
      requestType = com.stackroute.CapstoneUser.User.userDetails.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.userDetails,
      com.stackroute.CapstoneUser.User.APIResponse> getUserUpdationMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.userDetails, com.stackroute.CapstoneUser.User.APIResponse> getUserUpdationMethod;
    if ((getUserUpdationMethod = userServiceGrpc.getUserUpdationMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserUpdationMethod = userServiceGrpc.getUserUpdationMethod) == null) {
          userServiceGrpc.getUserUpdationMethod = getUserUpdationMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.userDetails, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userUpdation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.userDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userUpdation"))
                  .build();
          }
        }
     }
     return getUserUpdationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.userDetailsView> getUserDetailViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userDetailView",
      requestType = com.stackroute.CapstoneUser.User.APIInput.class,
      responseType = com.stackroute.CapstoneUser.User.userDetailsView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.userDetailsView> getUserDetailViewMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.userDetailsView> getUserDetailViewMethod;
    if ((getUserDetailViewMethod = userServiceGrpc.getUserDetailViewMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserDetailViewMethod = userServiceGrpc.getUserDetailViewMethod) == null) {
          userServiceGrpc.getUserDetailViewMethod = getUserDetailViewMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.userDetailsView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userDetailView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.userDetailsView.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userDetailView"))
                  .build();
          }
        }
     }
     return getUserDetailViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.APIResponse> getUserDetailDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userDetailDelete",
      requestType = com.stackroute.CapstoneUser.User.APIInput.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.APIResponse> getUserDetailDeleteMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.APIResponse> getUserDetailDeleteMethod;
    if ((getUserDetailDeleteMethod = userServiceGrpc.getUserDetailDeleteMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserDetailDeleteMethod = userServiceGrpc.getUserDetailDeleteMethod) == null) {
          userServiceGrpc.getUserDetailDeleteMethod = getUserDetailDeleteMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userDetailDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userDetailDelete"))
                  .build();
          }
        }
     }
     return getUserDetailDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.bookingInput,
      com.stackroute.CapstoneUser.User.APIResponse> getBookingChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookingChannel",
      requestType = com.stackroute.CapstoneUser.User.bookingInput.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.bookingInput,
      com.stackroute.CapstoneUser.User.APIResponse> getBookingChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.bookingInput, com.stackroute.CapstoneUser.User.APIResponse> getBookingChannelMethod;
    if ((getBookingChannelMethod = userServiceGrpc.getBookingChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getBookingChannelMethod = userServiceGrpc.getBookingChannelMethod) == null) {
          userServiceGrpc.getBookingChannelMethod = getBookingChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.bookingInput, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "bookingChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.bookingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("bookingChannel"))
                  .build();
          }
        }
     }
     return getBookingChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.cancelInput,
      com.stackroute.CapstoneUser.User.APIResponse> getCancelBookingChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelBookingChannel",
      requestType = com.stackroute.CapstoneUser.User.cancelInput.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.cancelInput,
      com.stackroute.CapstoneUser.User.APIResponse> getCancelBookingChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.cancelInput, com.stackroute.CapstoneUser.User.APIResponse> getCancelBookingChannelMethod;
    if ((getCancelBookingChannelMethod = userServiceGrpc.getCancelBookingChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getCancelBookingChannelMethod = userServiceGrpc.getCancelBookingChannelMethod) == null) {
          userServiceGrpc.getCancelBookingChannelMethod = getCancelBookingChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.cancelInput, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "cancelBookingChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.cancelInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("cancelBookingChannel"))
                  .build();
          }
        }
     }
     return getCancelBookingChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.rescheduleInput,
      com.stackroute.CapstoneUser.User.APIResponse> getRescheduleBookingChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rescheduleBookingChannel",
      requestType = com.stackroute.CapstoneUser.User.rescheduleInput.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.rescheduleInput,
      com.stackroute.CapstoneUser.User.APIResponse> getRescheduleBookingChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.rescheduleInput, com.stackroute.CapstoneUser.User.APIResponse> getRescheduleBookingChannelMethod;
    if ((getRescheduleBookingChannelMethod = userServiceGrpc.getRescheduleBookingChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getRescheduleBookingChannelMethod = userServiceGrpc.getRescheduleBookingChannelMethod) == null) {
          userServiceGrpc.getRescheduleBookingChannelMethod = getRescheduleBookingChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.rescheduleInput, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "rescheduleBookingChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.rescheduleInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("rescheduleBookingChannel"))
                  .build();
          }
        }
     }
     return getRescheduleBookingChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.patientRequest,
      com.stackroute.CapstoneUser.User.APIResponse2> getGetPatientAppointmentsChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatientAppointmentsChannel",
      requestType = com.stackroute.CapstoneUser.User.patientRequest.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.patientRequest,
      com.stackroute.CapstoneUser.User.APIResponse2> getGetPatientAppointmentsChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.patientRequest, com.stackroute.CapstoneUser.User.APIResponse2> getGetPatientAppointmentsChannelMethod;
    if ((getGetPatientAppointmentsChannelMethod = userServiceGrpc.getGetPatientAppointmentsChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getGetPatientAppointmentsChannelMethod = userServiceGrpc.getGetPatientAppointmentsChannelMethod) == null) {
          userServiceGrpc.getGetPatientAppointmentsChannelMethod = getGetPatientAppointmentsChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.patientRequest, com.stackroute.CapstoneUser.User.APIResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "getPatientAppointmentsChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.patientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse2.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("getPatientAppointmentsChannel"))
                  .build();
          }
        }
     }
     return getGetPatientAppointmentsChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.searchResponse> getSearchAllChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchAllChannel",
      requestType = com.stackroute.CapstoneUser.User.APIInput.class,
      responseType = com.stackroute.CapstoneUser.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput,
      com.stackroute.CapstoneUser.User.searchResponse> getSearchAllChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.searchResponse> getSearchAllChannelMethod;
    if ((getSearchAllChannelMethod = userServiceGrpc.getSearchAllChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSearchAllChannelMethod = userServiceGrpc.getSearchAllChannelMethod) == null) {
          userServiceGrpc.getSearchAllChannelMethod = getSearchAllChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.APIInput, com.stackroute.CapstoneUser.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "searchAllChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("searchAllChannel"))
                  .build();
          }
        }
     }
     return getSearchAllChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.searchRequest,
      com.stackroute.CapstoneUser.User.searchResponse> getSearchBySpecificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchBySpecificationChannel",
      requestType = com.stackroute.CapstoneUser.User.searchRequest.class,
      responseType = com.stackroute.CapstoneUser.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.searchRequest,
      com.stackroute.CapstoneUser.User.searchResponse> getSearchBySpecificationChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.searchRequest, com.stackroute.CapstoneUser.User.searchResponse> getSearchBySpecificationChannelMethod;
    if ((getSearchBySpecificationChannelMethod = userServiceGrpc.getSearchBySpecificationChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSearchBySpecificationChannelMethod = userServiceGrpc.getSearchBySpecificationChannelMethod) == null) {
          userServiceGrpc.getSearchBySpecificationChannelMethod = getSearchBySpecificationChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.searchRequest, com.stackroute.CapstoneUser.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "searchBySpecificationChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("searchBySpecificationChannel"))
                  .build();
          }
        }
     }
     return getSearchBySpecificationChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.review,
      com.stackroute.CapstoneUser.User.APIResponse> getReviewOnlyChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reviewOnlyChannel",
      requestType = com.stackroute.CapstoneUser.User.review.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.review,
      com.stackroute.CapstoneUser.User.APIResponse> getReviewOnlyChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.review, com.stackroute.CapstoneUser.User.APIResponse> getReviewOnlyChannelMethod;
    if ((getReviewOnlyChannelMethod = userServiceGrpc.getReviewOnlyChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getReviewOnlyChannelMethod = userServiceGrpc.getReviewOnlyChannelMethod) == null) {
          userServiceGrpc.getReviewOnlyChannelMethod = getReviewOnlyChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.review, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "reviewOnlyChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.review.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("reviewOnlyChannel"))
                  .build();
          }
        }
     }
     return getReviewOnlyChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.reviewandrate,
      com.stackroute.CapstoneUser.User.APIResponse> getReviewAndRateChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reviewAndRateChannel",
      requestType = com.stackroute.CapstoneUser.User.reviewandrate.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.reviewandrate,
      com.stackroute.CapstoneUser.User.APIResponse> getReviewAndRateChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.reviewandrate, com.stackroute.CapstoneUser.User.APIResponse> getReviewAndRateChannelMethod;
    if ((getReviewAndRateChannelMethod = userServiceGrpc.getReviewAndRateChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getReviewAndRateChannelMethod = userServiceGrpc.getReviewAndRateChannelMethod) == null) {
          userServiceGrpc.getReviewAndRateChannelMethod = getReviewAndRateChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.reviewandrate, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "reviewAndRateChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.reviewandrate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("reviewAndRateChannel"))
                  .build();
          }
        }
     }
     return getReviewAndRateChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.deletereview,
      com.stackroute.CapstoneUser.User.APIResponse> getDeleteReviewChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReviewChannel",
      requestType = com.stackroute.CapstoneUser.User.deletereview.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.deletereview,
      com.stackroute.CapstoneUser.User.APIResponse> getDeleteReviewChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.deletereview, com.stackroute.CapstoneUser.User.APIResponse> getDeleteReviewChannelMethod;
    if ((getDeleteReviewChannelMethod = userServiceGrpc.getDeleteReviewChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getDeleteReviewChannelMethod = userServiceGrpc.getDeleteReviewChannelMethod) == null) {
          userServiceGrpc.getDeleteReviewChannelMethod = getDeleteReviewChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.deletereview, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "deleteReviewChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.deletereview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("deleteReviewChannel"))
                  .build();
          }
        }
     }
     return getDeleteReviewChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.updatereview,
      com.stackroute.CapstoneUser.User.APIResponse> getUpdateReviewChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateReviewChannel",
      requestType = com.stackroute.CapstoneUser.User.updatereview.class,
      responseType = com.stackroute.CapstoneUser.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.updatereview,
      com.stackroute.CapstoneUser.User.APIResponse> getUpdateReviewChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.updatereview, com.stackroute.CapstoneUser.User.APIResponse> getUpdateReviewChannelMethod;
    if ((getUpdateReviewChannelMethod = userServiceGrpc.getUpdateReviewChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUpdateReviewChannelMethod = userServiceGrpc.getUpdateReviewChannelMethod) == null) {
          userServiceGrpc.getUpdateReviewChannelMethod = getUpdateReviewChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.updatereview, com.stackroute.CapstoneUser.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "updateReviewChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.updatereview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("updateReviewChannel"))
                  .build();
          }
        }
     }
     return getUpdateReviewChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.getfeedbackbyid,
      com.stackroute.CapstoneUser.User.listresponse> getGetAllFeedbackByIdChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedbackByIdChannel",
      requestType = com.stackroute.CapstoneUser.User.getfeedbackbyid.class,
      responseType = com.stackroute.CapstoneUser.User.listresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.getfeedbackbyid,
      com.stackroute.CapstoneUser.User.listresponse> getGetAllFeedbackByIdChannelMethod() {
    io.grpc.MethodDescriptor<com.stackroute.CapstoneUser.User.getfeedbackbyid, com.stackroute.CapstoneUser.User.listresponse> getGetAllFeedbackByIdChannelMethod;
    if ((getGetAllFeedbackByIdChannelMethod = userServiceGrpc.getGetAllFeedbackByIdChannelMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getGetAllFeedbackByIdChannelMethod = userServiceGrpc.getGetAllFeedbackByIdChannelMethod) == null) {
          userServiceGrpc.getGetAllFeedbackByIdChannelMethod = getGetAllFeedbackByIdChannelMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.CapstoneUser.User.getfeedbackbyid, com.stackroute.CapstoneUser.User.listresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "getAllFeedbackByIdChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.getfeedbackbyid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.CapstoneUser.User.listresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("getAllFeedbackByIdChannel"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackByIdChannelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userServiceStub newStub(io.grpc.Channel channel) {
    return new userServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void userUpdation(com.stackroute.CapstoneUser.User.userDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserUpdationMethod(), responseObserver);
    }

    /**
     */
    public void userDetailView(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.userDetailsView> responseObserver) {
      asyncUnimplementedUnaryCall(getUserDetailViewMethod(), responseObserver);
    }

    /**
     */
    public void userDetailDelete(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserDetailDeleteMethod(), responseObserver);
    }

    /**
     */
    public void bookingChannel(com.stackroute.CapstoneUser.User.bookingInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookingChannelMethod(), responseObserver);
    }

    /**
     */
    public void cancelBookingChannel(com.stackroute.CapstoneUser.User.cancelInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBookingChannelMethod(), responseObserver);
    }

    /**
     */
    public void rescheduleBookingChannel(com.stackroute.CapstoneUser.User.rescheduleInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRescheduleBookingChannelMethod(), responseObserver);
    }

    /**
     */
    public void getPatientAppointmentsChannel(com.stackroute.CapstoneUser.User.patientRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse2> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientAppointmentsChannelMethod(), responseObserver);
    }

    /**
     */
    public void searchAllChannel(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAllChannelMethod(), responseObserver);
    }

    /**
     */
    public void searchBySpecificationChannel(com.stackroute.CapstoneUser.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchBySpecificationChannelMethod(), responseObserver);
    }

    /**
     */
    public void reviewOnlyChannel(com.stackroute.CapstoneUser.User.review request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReviewOnlyChannelMethod(), responseObserver);
    }

    /**
     */
    public void reviewAndRateChannel(com.stackroute.CapstoneUser.User.reviewandrate request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReviewAndRateChannelMethod(), responseObserver);
    }

    /**
     */
    public void deleteReviewChannel(com.stackroute.CapstoneUser.User.deletereview request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReviewChannelMethod(), responseObserver);
    }

    /**
     */
    public void updateReviewChannel(com.stackroute.CapstoneUser.User.updatereview request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReviewChannelMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedbackByIdChannel(com.stackroute.CapstoneUser.User.getfeedbackbyid request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.listresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackByIdChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserUpdationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.userDetails,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_USER_UPDATION)))
          .addMethod(
            getUserDetailViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.APIInput,
                com.stackroute.CapstoneUser.User.userDetailsView>(
                  this, METHODID_USER_DETAIL_VIEW)))
          .addMethod(
            getUserDetailDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.APIInput,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_USER_DETAIL_DELETE)))
          .addMethod(
            getBookingChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.bookingInput,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_BOOKING_CHANNEL)))
          .addMethod(
            getCancelBookingChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.cancelInput,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_CANCEL_BOOKING_CHANNEL)))
          .addMethod(
            getRescheduleBookingChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.rescheduleInput,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_RESCHEDULE_BOOKING_CHANNEL)))
          .addMethod(
            getGetPatientAppointmentsChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.patientRequest,
                com.stackroute.CapstoneUser.User.APIResponse2>(
                  this, METHODID_GET_PATIENT_APPOINTMENTS_CHANNEL)))
          .addMethod(
            getSearchAllChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.APIInput,
                com.stackroute.CapstoneUser.User.searchResponse>(
                  this, METHODID_SEARCH_ALL_CHANNEL)))
          .addMethod(
            getSearchBySpecificationChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.searchRequest,
                com.stackroute.CapstoneUser.User.searchResponse>(
                  this, METHODID_SEARCH_BY_SPECIFICATION_CHANNEL)))
          .addMethod(
            getReviewOnlyChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.review,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_REVIEW_ONLY_CHANNEL)))
          .addMethod(
            getReviewAndRateChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.reviewandrate,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_REVIEW_AND_RATE_CHANNEL)))
          .addMethod(
            getDeleteReviewChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.deletereview,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_DELETE_REVIEW_CHANNEL)))
          .addMethod(
            getUpdateReviewChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.updatereview,
                com.stackroute.CapstoneUser.User.APIResponse>(
                  this, METHODID_UPDATE_REVIEW_CHANNEL)))
          .addMethod(
            getGetAllFeedbackByIdChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.CapstoneUser.User.getfeedbackbyid,
                com.stackroute.CapstoneUser.User.listresponse>(
                  this, METHODID_GET_ALL_FEEDBACK_BY_ID_CHANNEL)))
          .build();
    }
  }

  /**
   */
  public static final class userServiceStub extends io.grpc.stub.AbstractStub<userServiceStub> {
    private userServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     */
    public void userUpdation(com.stackroute.CapstoneUser.User.userDetails request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserUpdationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userDetailView(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.userDetailsView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserDetailViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userDetailDelete(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserDetailDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookingChannel(com.stackroute.CapstoneUser.User.bookingInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookingChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBookingChannel(com.stackroute.CapstoneUser.User.cancelInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBookingChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rescheduleBookingChannel(com.stackroute.CapstoneUser.User.rescheduleInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescheduleBookingChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatientAppointmentsChannel(com.stackroute.CapstoneUser.User.patientRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientAppointmentsChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchAllChannel(com.stackroute.CapstoneUser.User.APIInput request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAllChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchBySpecificationChannel(com.stackroute.CapstoneUser.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchBySpecificationChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewOnlyChannel(com.stackroute.CapstoneUser.User.review request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReviewOnlyChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reviewAndRateChannel(com.stackroute.CapstoneUser.User.reviewandrate request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReviewAndRateChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReviewChannel(com.stackroute.CapstoneUser.User.deletereview request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReviewChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReviewChannel(com.stackroute.CapstoneUser.User.updatereview request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReviewChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedbackByIdChannel(com.stackroute.CapstoneUser.User.getfeedbackbyid request,
        io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.listresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackByIdChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userServiceBlockingStub extends io.grpc.stub.AbstractStub<userServiceBlockingStub> {
    private userServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse userUpdation(com.stackroute.CapstoneUser.User.userDetails request) {
      return blockingUnaryCall(
          getChannel(), getUserUpdationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.userDetailsView userDetailView(com.stackroute.CapstoneUser.User.APIInput request) {
      return blockingUnaryCall(
          getChannel(), getUserDetailViewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse userDetailDelete(com.stackroute.CapstoneUser.User.APIInput request) {
      return blockingUnaryCall(
          getChannel(), getUserDetailDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse bookingChannel(com.stackroute.CapstoneUser.User.bookingInput request) {
      return blockingUnaryCall(
          getChannel(), getBookingChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse cancelBookingChannel(com.stackroute.CapstoneUser.User.cancelInput request) {
      return blockingUnaryCall(
          getChannel(), getCancelBookingChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse rescheduleBookingChannel(com.stackroute.CapstoneUser.User.rescheduleInput request) {
      return blockingUnaryCall(
          getChannel(), getRescheduleBookingChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse2 getPatientAppointmentsChannel(com.stackroute.CapstoneUser.User.patientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientAppointmentsChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.searchResponse searchAllChannel(com.stackroute.CapstoneUser.User.APIInput request) {
      return blockingUnaryCall(
          getChannel(), getSearchAllChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.searchResponse searchBySpecificationChannel(com.stackroute.CapstoneUser.User.searchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchBySpecificationChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse reviewOnlyChannel(com.stackroute.CapstoneUser.User.review request) {
      return blockingUnaryCall(
          getChannel(), getReviewOnlyChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse reviewAndRateChannel(com.stackroute.CapstoneUser.User.reviewandrate request) {
      return blockingUnaryCall(
          getChannel(), getReviewAndRateChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse deleteReviewChannel(com.stackroute.CapstoneUser.User.deletereview request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReviewChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.APIResponse updateReviewChannel(com.stackroute.CapstoneUser.User.updatereview request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReviewChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.CapstoneUser.User.listresponse getAllFeedbackByIdChannel(com.stackroute.CapstoneUser.User.getfeedbackbyid request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackByIdChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userServiceFutureStub extends io.grpc.stub.AbstractStub<userServiceFutureStub> {
    private userServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> userUpdation(
        com.stackroute.CapstoneUser.User.userDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getUserUpdationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.userDetailsView> userDetailView(
        com.stackroute.CapstoneUser.User.APIInput request) {
      return futureUnaryCall(
          getChannel().newCall(getUserDetailViewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> userDetailDelete(
        com.stackroute.CapstoneUser.User.APIInput request) {
      return futureUnaryCall(
          getChannel().newCall(getUserDetailDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> bookingChannel(
        com.stackroute.CapstoneUser.User.bookingInput request) {
      return futureUnaryCall(
          getChannel().newCall(getBookingChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> cancelBookingChannel(
        com.stackroute.CapstoneUser.User.cancelInput request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBookingChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> rescheduleBookingChannel(
        com.stackroute.CapstoneUser.User.rescheduleInput request) {
      return futureUnaryCall(
          getChannel().newCall(getRescheduleBookingChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse2> getPatientAppointmentsChannel(
        com.stackroute.CapstoneUser.User.patientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientAppointmentsChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.searchResponse> searchAllChannel(
        com.stackroute.CapstoneUser.User.APIInput request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAllChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.searchResponse> searchBySpecificationChannel(
        com.stackroute.CapstoneUser.User.searchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchBySpecificationChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> reviewOnlyChannel(
        com.stackroute.CapstoneUser.User.review request) {
      return futureUnaryCall(
          getChannel().newCall(getReviewOnlyChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> reviewAndRateChannel(
        com.stackroute.CapstoneUser.User.reviewandrate request) {
      return futureUnaryCall(
          getChannel().newCall(getReviewAndRateChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> deleteReviewChannel(
        com.stackroute.CapstoneUser.User.deletereview request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReviewChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.APIResponse> updateReviewChannel(
        com.stackroute.CapstoneUser.User.updatereview request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReviewChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.CapstoneUser.User.listresponse> getAllFeedbackByIdChannel(
        com.stackroute.CapstoneUser.User.getfeedbackbyid request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackByIdChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_UPDATION = 0;
  private static final int METHODID_USER_DETAIL_VIEW = 1;
  private static final int METHODID_USER_DETAIL_DELETE = 2;
  private static final int METHODID_BOOKING_CHANNEL = 3;
  private static final int METHODID_CANCEL_BOOKING_CHANNEL = 4;
  private static final int METHODID_RESCHEDULE_BOOKING_CHANNEL = 5;
  private static final int METHODID_GET_PATIENT_APPOINTMENTS_CHANNEL = 6;
  private static final int METHODID_SEARCH_ALL_CHANNEL = 7;
  private static final int METHODID_SEARCH_BY_SPECIFICATION_CHANNEL = 8;
  private static final int METHODID_REVIEW_ONLY_CHANNEL = 9;
  private static final int METHODID_REVIEW_AND_RATE_CHANNEL = 10;
  private static final int METHODID_DELETE_REVIEW_CHANNEL = 11;
  private static final int METHODID_UPDATE_REVIEW_CHANNEL = 12;
  private static final int METHODID_GET_ALL_FEEDBACK_BY_ID_CHANNEL = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_UPDATION:
          serviceImpl.userUpdation((com.stackroute.CapstoneUser.User.userDetails) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_USER_DETAIL_VIEW:
          serviceImpl.userDetailView((com.stackroute.CapstoneUser.User.APIInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.userDetailsView>) responseObserver);
          break;
        case METHODID_USER_DETAIL_DELETE:
          serviceImpl.userDetailDelete((com.stackroute.CapstoneUser.User.APIInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_BOOKING_CHANNEL:
          serviceImpl.bookingChannel((com.stackroute.CapstoneUser.User.bookingInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING_CHANNEL:
          serviceImpl.cancelBookingChannel((com.stackroute.CapstoneUser.User.cancelInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_RESCHEDULE_BOOKING_CHANNEL:
          serviceImpl.rescheduleBookingChannel((com.stackroute.CapstoneUser.User.rescheduleInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT_APPOINTMENTS_CHANNEL:
          serviceImpl.getPatientAppointmentsChannel((com.stackroute.CapstoneUser.User.patientRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse2>) responseObserver);
          break;
        case METHODID_SEARCH_ALL_CHANNEL:
          serviceImpl.searchAllChannel((com.stackroute.CapstoneUser.User.APIInput) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_SPECIFICATION_CHANNEL:
          serviceImpl.searchBySpecificationChannel((com.stackroute.CapstoneUser.User.searchRequest) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.searchResponse>) responseObserver);
          break;
        case METHODID_REVIEW_ONLY_CHANNEL:
          serviceImpl.reviewOnlyChannel((com.stackroute.CapstoneUser.User.review) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_REVIEW_AND_RATE_CHANNEL:
          serviceImpl.reviewAndRateChannel((com.stackroute.CapstoneUser.User.reviewandrate) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_REVIEW_CHANNEL:
          serviceImpl.deleteReviewChannel((com.stackroute.CapstoneUser.User.deletereview) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REVIEW_CHANNEL:
          serviceImpl.updateReviewChannel((com.stackroute.CapstoneUser.User.updatereview) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK_BY_ID_CHANNEL:
          serviceImpl.getAllFeedbackByIdChannel((com.stackroute.CapstoneUser.User.getfeedbackbyid) request,
              (io.grpc.stub.StreamObserver<com.stackroute.CapstoneUser.User.listresponse>) responseObserver);
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

  private static abstract class userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.CapstoneUser.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userService");
    }
  }

  private static final class userServiceFileDescriptorSupplier
      extends userServiceBaseDescriptorSupplier {
    userServiceFileDescriptorSupplier() {}
  }

  private static final class userServiceMethodDescriptorSupplier
      extends userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (userServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userServiceFileDescriptorSupplier())
              .addMethod(getUserUpdationMethod())
              .addMethod(getUserDetailViewMethod())
              .addMethod(getUserDetailDeleteMethod())
              .addMethod(getBookingChannelMethod())
              .addMethod(getCancelBookingChannelMethod())
              .addMethod(getRescheduleBookingChannelMethod())
              .addMethod(getGetPatientAppointmentsChannelMethod())
              .addMethod(getSearchAllChannelMethod())
              .addMethod(getSearchBySpecificationChannelMethod())
              .addMethod(getReviewOnlyChannelMethod())
              .addMethod(getReviewAndRateChannelMethod())
              .addMethod(getDeleteReviewChannelMethod())
              .addMethod(getUpdateReviewChannelMethod())
              .addMethod(getGetAllFeedbackByIdChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
