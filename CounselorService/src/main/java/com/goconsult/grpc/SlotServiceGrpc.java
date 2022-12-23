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
public final class SlotServiceGrpc {

  private SlotServiceGrpc() {}

  public static final String SERVICE_NAME = "SlotService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot,
      com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSlot",
      requestType = com.goconsult.grpc.Counselor.slot.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot,
      com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot, com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod;
    if ((getAddSlotMethod = SlotServiceGrpc.getAddSlotMethod) == null) {
      synchronized (SlotServiceGrpc.class) {
        if ((getAddSlotMethod = SlotServiceGrpc.getAddSlotMethod) == null) {
          SlotServiceGrpc.getAddSlotMethod = getAddSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slot, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SlotService", "addSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new SlotServiceMethodDescriptorSupplier("addSlot"))
                  .build();
          }
        }
     }
     return getAddSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewAllSlot",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.viewSlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod;
    if ((getViewAllSlotMethod = SlotServiceGrpc.getViewAllSlotMethod) == null) {
      synchronized (SlotServiceGrpc.class) {
        if ((getViewAllSlotMethod = SlotServiceGrpc.getViewAllSlotMethod) == null) {
          SlotServiceGrpc.getViewAllSlotMethod = getViewAllSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.viewSlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SlotService", "viewAllSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.viewSlotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SlotServiceMethodDescriptorSupplier("viewAllSlot"))
                  .build();
          }
        }
     }
     return getViewAllSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted,
      com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSlot",
      requestType = com.goconsult.grpc.Counselor.slotIdToBeDeleted.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted,
      com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted, com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod;
    if ((getDeleteSlotMethod = SlotServiceGrpc.getDeleteSlotMethod) == null) {
      synchronized (SlotServiceGrpc.class) {
        if ((getDeleteSlotMethod = SlotServiceGrpc.getDeleteSlotMethod) == null) {
          SlotServiceGrpc.getDeleteSlotMethod = getDeleteSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slotIdToBeDeleted, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SlotService", "deleteSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slotIdToBeDeleted.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new SlotServiceMethodDescriptorSupplier("deleteSlot"))
                  .build();
          }
        }
     }
     return getDeleteSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSlot",
      requestType = com.goconsult.grpc.Counselor.slotDetail.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail, com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod;
    if ((getUpdateSlotMethod = SlotServiceGrpc.getUpdateSlotMethod) == null) {
      synchronized (SlotServiceGrpc.class) {
        if ((getUpdateSlotMethod = SlotServiceGrpc.getUpdateSlotMethod) == null) {
          SlotServiceGrpc.getUpdateSlotMethod = getUpdateSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slotDetail, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SlotService", "updateSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slotDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new SlotServiceMethodDescriptorSupplier("updateSlot"))
                  .build();
          }
        }
     }
     return getUpdateSlotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlotServiceStub newStub(io.grpc.Channel channel) {
    return new SlotServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlotServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SlotServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlotServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SlotServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SlotServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addSlot(com.goconsult.grpc.Counselor.slot request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSlotMethod(), responseObserver);
    }

    /**
     */
    public void viewAllSlot(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewAllSlotMethod(), responseObserver);
    }

    /**
     */
    public void deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSlotMethod(), responseObserver);
    }

    /**
     */
    public void updateSlot(com.goconsult.grpc.Counselor.slotDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSlotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slot,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_ADD_SLOT)))
          .addMethod(
            getViewAllSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.viewSlotResponse>(
                  this, METHODID_VIEW_ALL_SLOT)))
          .addMethod(
            getDeleteSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slotIdToBeDeleted,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_DELETE_SLOT)))
          .addMethod(
            getUpdateSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slotDetail,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_SLOT)))
          .build();
    }
  }

  /**
   */
  public static final class SlotServiceStub extends io.grpc.stub.AbstractStub<SlotServiceStub> {
    private SlotServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlotServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlotServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlotServiceStub(channel, callOptions);
    }

    /**
     */
    public void addSlot(com.goconsult.grpc.Counselor.slot request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewAllSlot(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewAllSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSlot(com.goconsult.grpc.Counselor.slotDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSlotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlotServiceBlockingStub extends io.grpc.stub.AbstractStub<SlotServiceBlockingStub> {
    private SlotServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlotServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlotServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlotServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage addSlot(com.goconsult.grpc.Counselor.slot request) {
      return blockingUnaryCall(
          getChannel(), getAddSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.viewSlotResponse viewAllSlot(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewAllSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updateSlot(com.goconsult.grpc.Counselor.slotDetail request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSlotMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlotServiceFutureStub extends io.grpc.stub.AbstractStub<SlotServiceFutureStub> {
    private SlotServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlotServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlotServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlotServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> addSlot(
        com.goconsult.grpc.Counselor.slot request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.viewSlotResponse> viewAllSlot(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewAllSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> deleteSlot(
        com.goconsult.grpc.Counselor.slotIdToBeDeleted request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updateSlot(
        com.goconsult.grpc.Counselor.slotDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSlotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_SLOT = 0;
  private static final int METHODID_VIEW_ALL_SLOT = 1;
  private static final int METHODID_DELETE_SLOT = 2;
  private static final int METHODID_UPDATE_SLOT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlotServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlotServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_SLOT:
          serviceImpl.addSlot((com.goconsult.grpc.Counselor.slot) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_ALL_SLOT:
          serviceImpl.viewAllSlot((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse>) responseObserver);
          break;
        case METHODID_DELETE_SLOT:
          serviceImpl.deleteSlot((com.goconsult.grpc.Counselor.slotIdToBeDeleted) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_UPDATE_SLOT:
          serviceImpl.updateSlot((com.goconsult.grpc.Counselor.slotDetail) request,
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

  private static abstract class SlotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlotServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Counselor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlotService");
    }
  }

  private static final class SlotServiceFileDescriptorSupplier
      extends SlotServiceBaseDescriptorSupplier {
    SlotServiceFileDescriptorSupplier() {}
  }

  private static final class SlotServiceMethodDescriptorSupplier
      extends SlotServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlotServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlotServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlotServiceFileDescriptorSupplier())
              .addMethod(getAddSlotMethod())
              .addMethod(getViewAllSlotMethod())
              .addMethod(getDeleteSlotMethod())
              .addMethod(getUpdateSlotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
