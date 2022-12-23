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
    comments = "Source: Slots.proto")
public final class SearchAvailableSlotsGrpc {

  private SearchAvailableSlotsGrpc() {}

  public static final String SERVICE_NAME = "SearchAvailableSlots";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.Empty,
      com.goconsult.grpc.Slots.searchResponse> getSearchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchAll",
      requestType = com.goconsult.grpc.Slots.Empty.class,
      responseType = com.goconsult.grpc.Slots.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.Empty,
      com.goconsult.grpc.Slots.searchResponse> getSearchAllMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.Empty, com.goconsult.grpc.Slots.searchResponse> getSearchAllMethod;
    if ((getSearchAllMethod = SearchAvailableSlotsGrpc.getSearchAllMethod) == null) {
      synchronized (SearchAvailableSlotsGrpc.class) {
        if ((getSearchAllMethod = SearchAvailableSlotsGrpc.getSearchAllMethod) == null) {
          SearchAvailableSlotsGrpc.getSearchAllMethod = getSearchAllMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Slots.Empty, com.goconsult.grpc.Slots.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SearchAvailableSlots", "searchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Slots.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Slots.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchAvailableSlotsMethodDescriptorSupplier("searchAll"))
                  .build();
          }
        }
     }
     return getSearchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.searchRequest,
      com.goconsult.grpc.Slots.searchResponse> getSearchBySpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchBySpecification",
      requestType = com.goconsult.grpc.Slots.searchRequest.class,
      responseType = com.goconsult.grpc.Slots.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.searchRequest,
      com.goconsult.grpc.Slots.searchResponse> getSearchBySpecificationMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Slots.searchRequest, com.goconsult.grpc.Slots.searchResponse> getSearchBySpecificationMethod;
    if ((getSearchBySpecificationMethod = SearchAvailableSlotsGrpc.getSearchBySpecificationMethod) == null) {
      synchronized (SearchAvailableSlotsGrpc.class) {
        if ((getSearchBySpecificationMethod = SearchAvailableSlotsGrpc.getSearchBySpecificationMethod) == null) {
          SearchAvailableSlotsGrpc.getSearchBySpecificationMethod = getSearchBySpecificationMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Slots.searchRequest, com.goconsult.grpc.Slots.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SearchAvailableSlots", "searchBySpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Slots.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Slots.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchAvailableSlotsMethodDescriptorSupplier("searchBySpecification"))
                  .build();
          }
        }
     }
     return getSearchBySpecificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchAvailableSlotsStub newStub(io.grpc.Channel channel) {
    return new SearchAvailableSlotsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchAvailableSlotsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchAvailableSlotsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchAvailableSlotsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchAvailableSlotsFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchAvailableSlotsImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchAll(com.goconsult.grpc.Slots.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchAllMethod(), responseObserver);
    }

    /**
     */
    public void searchBySpecification(com.goconsult.grpc.Slots.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchBySpecificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Slots.Empty,
                com.goconsult.grpc.Slots.searchResponse>(
                  this, METHODID_SEARCH_ALL)))
          .addMethod(
            getSearchBySpecificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Slots.searchRequest,
                com.goconsult.grpc.Slots.searchResponse>(
                  this, METHODID_SEARCH_BY_SPECIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class SearchAvailableSlotsStub extends io.grpc.stub.AbstractStub<SearchAvailableSlotsStub> {
    private SearchAvailableSlotsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchAvailableSlotsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchAvailableSlotsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchAvailableSlotsStub(channel, callOptions);
    }

    /**
     */
    public void searchAll(com.goconsult.grpc.Slots.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchBySpecification(com.goconsult.grpc.Slots.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchBySpecificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchAvailableSlotsBlockingStub extends io.grpc.stub.AbstractStub<SearchAvailableSlotsBlockingStub> {
    private SearchAvailableSlotsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchAvailableSlotsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchAvailableSlotsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchAvailableSlotsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Slots.searchResponse searchAll(com.goconsult.grpc.Slots.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSearchAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Slots.searchResponse searchBySpecification(com.goconsult.grpc.Slots.searchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchBySpecificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchAvailableSlotsFutureStub extends io.grpc.stub.AbstractStub<SearchAvailableSlotsFutureStub> {
    private SearchAvailableSlotsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchAvailableSlotsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchAvailableSlotsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchAvailableSlotsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Slots.searchResponse> searchAll(
        com.goconsult.grpc.Slots.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Slots.searchResponse> searchBySpecification(
        com.goconsult.grpc.Slots.searchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchBySpecificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_ALL = 0;
  private static final int METHODID_SEARCH_BY_SPECIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchAvailableSlotsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchAvailableSlotsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_ALL:
          serviceImpl.searchAll((com.goconsult.grpc.Slots.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_SPECIFICATION:
          serviceImpl.searchBySpecification((com.goconsult.grpc.Slots.searchRequest) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Slots.searchResponse>) responseObserver);
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

  private static abstract class SearchAvailableSlotsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchAvailableSlotsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Slots.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchAvailableSlots");
    }
  }

  private static final class SearchAvailableSlotsFileDescriptorSupplier
      extends SearchAvailableSlotsBaseDescriptorSupplier {
    SearchAvailableSlotsFileDescriptorSupplier() {}
  }

  private static final class SearchAvailableSlotsMethodDescriptorSupplier
      extends SearchAvailableSlotsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchAvailableSlotsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchAvailableSlotsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchAvailableSlotsFileDescriptorSupplier())
              .addMethod(getSearchAllMethod())
              .addMethod(getSearchBySpecificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
