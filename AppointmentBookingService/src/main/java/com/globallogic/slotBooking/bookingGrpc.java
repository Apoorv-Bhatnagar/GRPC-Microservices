package com.globallogic.slotBooking;

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
    comments = "Source: Booking.proto")
public final class bookingGrpc {

  private bookingGrpc() {}

  public static final String SERVICE_NAME = "booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.bookingInput,
      com.globallogic.slotBooking.Booking.APIResponse> getBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "booking",
      requestType = com.globallogic.slotBooking.Booking.bookingInput.class,
      responseType = com.globallogic.slotBooking.Booking.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.bookingInput,
      com.globallogic.slotBooking.Booking.APIResponse> getBookingMethod() {
    io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.bookingInput, com.globallogic.slotBooking.Booking.APIResponse> getBookingMethod;
    if ((getBookingMethod = bookingGrpc.getBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getBookingMethod = bookingGrpc.getBookingMethod) == null) {
          bookingGrpc.getBookingMethod = getBookingMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.slotBooking.Booking.bookingInput, com.globallogic.slotBooking.Booking.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "booking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.bookingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("booking"))
                  .build();
          }
        }
     }
     return getBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.cancelInput,
      com.globallogic.slotBooking.Booking.APIResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelBooking",
      requestType = com.globallogic.slotBooking.Booking.cancelInput.class,
      responseType = com.globallogic.slotBooking.Booking.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.cancelInput,
      com.globallogic.slotBooking.Booking.APIResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.cancelInput, com.globallogic.slotBooking.Booking.APIResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = bookingGrpc.getCancelBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getCancelBookingMethod = bookingGrpc.getCancelBookingMethod) == null) {
          bookingGrpc.getCancelBookingMethod = getCancelBookingMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.slotBooking.Booking.cancelInput, com.globallogic.slotBooking.Booking.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "cancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.cancelInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("cancelBooking"))
                  .build();
          }
        }
     }
     return getCancelBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.rescheduleInput,
      com.globallogic.slotBooking.Booking.APIResponse> getRescheduleBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rescheduleBooking",
      requestType = com.globallogic.slotBooking.Booking.rescheduleInput.class,
      responseType = com.globallogic.slotBooking.Booking.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.rescheduleInput,
      com.globallogic.slotBooking.Booking.APIResponse> getRescheduleBookingMethod() {
    io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.rescheduleInput, com.globallogic.slotBooking.Booking.APIResponse> getRescheduleBookingMethod;
    if ((getRescheduleBookingMethod = bookingGrpc.getRescheduleBookingMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getRescheduleBookingMethod = bookingGrpc.getRescheduleBookingMethod) == null) {
          bookingGrpc.getRescheduleBookingMethod = getRescheduleBookingMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.slotBooking.Booking.rescheduleInput, com.globallogic.slotBooking.Booking.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "rescheduleBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.rescheduleInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("rescheduleBooking"))
                  .build();
          }
        }
     }
     return getRescheduleBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.request,
      com.globallogic.slotBooking.Booking.APIResponse1> getGetdataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getdata",
      requestType = com.globallogic.slotBooking.Booking.request.class,
      responseType = com.globallogic.slotBooking.Booking.APIResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.request,
      com.globallogic.slotBooking.Booking.APIResponse1> getGetdataMethod() {
    io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.request, com.globallogic.slotBooking.Booking.APIResponse1> getGetdataMethod;
    if ((getGetdataMethod = bookingGrpc.getGetdataMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getGetdataMethod = bookingGrpc.getGetdataMethod) == null) {
          bookingGrpc.getGetdataMethod = getGetdataMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.slotBooking.Booking.request, com.globallogic.slotBooking.Booking.APIResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "getdata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.APIResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("getdata"))
                  .build();
          }
        }
     }
     return getGetdataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.patientRequest,
      com.globallogic.slotBooking.Booking.APIResponse2> getGetPatientAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatientAppointments",
      requestType = com.globallogic.slotBooking.Booking.patientRequest.class,
      responseType = com.globallogic.slotBooking.Booking.APIResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.patientRequest,
      com.globallogic.slotBooking.Booking.APIResponse2> getGetPatientAppointmentsMethod() {
    io.grpc.MethodDescriptor<com.globallogic.slotBooking.Booking.patientRequest, com.globallogic.slotBooking.Booking.APIResponse2> getGetPatientAppointmentsMethod;
    if ((getGetPatientAppointmentsMethod = bookingGrpc.getGetPatientAppointmentsMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getGetPatientAppointmentsMethod = bookingGrpc.getGetPatientAppointmentsMethod) == null) {
          bookingGrpc.getGetPatientAppointmentsMethod = getGetPatientAppointmentsMethod = 
              io.grpc.MethodDescriptor.<com.globallogic.slotBooking.Booking.patientRequest, com.globallogic.slotBooking.Booking.APIResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "getPatientAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.patientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.globallogic.slotBooking.Booking.APIResponse2.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("getPatientAppointments"))
                  .build();
          }
        }
     }
     return getGetPatientAppointmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookingStub newStub(io.grpc.Channel channel) {
    return new bookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookingFutureStub(channel);
  }

  /**
   */
  public static abstract class bookingImplBase implements io.grpc.BindableService {

    /**
     */
    public void booking(com.globallogic.slotBooking.Booking.bookingInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookingMethod(), responseObserver);
    }

    /**
     */
    public void cancelBooking(com.globallogic.slotBooking.Booking.cancelInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }

    /**
     */
    public void rescheduleBooking(com.globallogic.slotBooking.Booking.rescheduleInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRescheduleBookingMethod(), responseObserver);
    }

    /**
     */
    public void getdata(com.globallogic.slotBooking.Booking.request request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getGetdataMethod(), responseObserver);
    }

    /**
     */
    public void getPatientAppointments(com.globallogic.slotBooking.Booking.patientRequest request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse2> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientAppointmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.slotBooking.Booking.bookingInput,
                com.globallogic.slotBooking.Booking.APIResponse>(
                  this, METHODID_BOOKING)))
          .addMethod(
            getCancelBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.slotBooking.Booking.cancelInput,
                com.globallogic.slotBooking.Booking.APIResponse>(
                  this, METHODID_CANCEL_BOOKING)))
          .addMethod(
            getRescheduleBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.slotBooking.Booking.rescheduleInput,
                com.globallogic.slotBooking.Booking.APIResponse>(
                  this, METHODID_RESCHEDULE_BOOKING)))
          .addMethod(
            getGetdataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.slotBooking.Booking.request,
                com.globallogic.slotBooking.Booking.APIResponse1>(
                  this, METHODID_GETDATA)))
          .addMethod(
            getGetPatientAppointmentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.globallogic.slotBooking.Booking.patientRequest,
                com.globallogic.slotBooking.Booking.APIResponse2>(
                  this, METHODID_GET_PATIENT_APPOINTMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class bookingStub extends io.grpc.stub.AbstractStub<bookingStub> {
    private bookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStub(channel, callOptions);
    }

    /**
     */
    public void booking(com.globallogic.slotBooking.Booking.bookingInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBooking(com.globallogic.slotBooking.Booking.cancelInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rescheduleBooking(com.globallogic.slotBooking.Booking.rescheduleInput request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getdata(com.globallogic.slotBooking.Booking.request request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetdataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatientAppointments(com.globallogic.slotBooking.Booking.patientRequest request,
        io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bookingBlockingStub extends io.grpc.stub.AbstractStub<bookingBlockingStub> {
    private bookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.globallogic.slotBooking.Booking.APIResponse booking(com.globallogic.slotBooking.Booking.bookingInput request) {
      return blockingUnaryCall(
          getChannel(), getBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.globallogic.slotBooking.Booking.APIResponse cancelBooking(com.globallogic.slotBooking.Booking.cancelInput request) {
      return blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.globallogic.slotBooking.Booking.APIResponse rescheduleBooking(com.globallogic.slotBooking.Booking.rescheduleInput request) {
      return blockingUnaryCall(
          getChannel(), getRescheduleBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.globallogic.slotBooking.Booking.APIResponse1 getdata(com.globallogic.slotBooking.Booking.request request) {
      return blockingUnaryCall(
          getChannel(), getGetdataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.globallogic.slotBooking.Booking.APIResponse2 getPatientAppointments(com.globallogic.slotBooking.Booking.patientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientAppointmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bookingFutureStub extends io.grpc.stub.AbstractStub<bookingFutureStub> {
    private bookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.slotBooking.Booking.APIResponse> booking(
        com.globallogic.slotBooking.Booking.bookingInput request) {
      return futureUnaryCall(
          getChannel().newCall(getBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.slotBooking.Booking.APIResponse> cancelBooking(
        com.globallogic.slotBooking.Booking.cancelInput request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.slotBooking.Booking.APIResponse> rescheduleBooking(
        com.globallogic.slotBooking.Booking.rescheduleInput request) {
      return futureUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.slotBooking.Booking.APIResponse1> getdata(
        com.globallogic.slotBooking.Booking.request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetdataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.globallogic.slotBooking.Booking.APIResponse2> getPatientAppointments(
        com.globallogic.slotBooking.Booking.patientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientAppointmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOKING = 0;
  private static final int METHODID_CANCEL_BOOKING = 1;
  private static final int METHODID_RESCHEDULE_BOOKING = 2;
  private static final int METHODID_GETDATA = 3;
  private static final int METHODID_GET_PATIENT_APPOINTMENTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOKING:
          serviceImpl.booking((com.globallogic.slotBooking.Booking.bookingInput) request,
              (io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((com.globallogic.slotBooking.Booking.cancelInput) request,
              (io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse>) responseObserver);
          break;
        case METHODID_RESCHEDULE_BOOKING:
          serviceImpl.rescheduleBooking((com.globallogic.slotBooking.Booking.rescheduleInput) request,
              (io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse>) responseObserver);
          break;
        case METHODID_GETDATA:
          serviceImpl.getdata((com.globallogic.slotBooking.Booking.request) request,
              (io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse1>) responseObserver);
          break;
        case METHODID_GET_PATIENT_APPOINTMENTS:
          serviceImpl.getPatientAppointments((com.globallogic.slotBooking.Booking.patientRequest) request,
              (io.grpc.stub.StreamObserver<com.globallogic.slotBooking.Booking.APIResponse2>) responseObserver);
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

  private static abstract class bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.globallogic.slotBooking.Booking.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("booking");
    }
  }

  private static final class bookingFileDescriptorSupplier
      extends bookingBaseDescriptorSupplier {
    bookingFileDescriptorSupplier() {}
  }

  private static final class bookingMethodDescriptorSupplier
      extends bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookingFileDescriptorSupplier())
              .addMethod(getBookingMethod())
              .addMethod(getCancelBookingMethod())
              .addMethod(getRescheduleBookingMethod())
              .addMethod(getGetdataMethod())
              .addMethod(getGetPatientAppointmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
