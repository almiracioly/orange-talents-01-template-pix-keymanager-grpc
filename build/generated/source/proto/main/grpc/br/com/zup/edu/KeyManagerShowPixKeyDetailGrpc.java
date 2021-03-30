package br.com.zup.edu;

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
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: keyManagerGrpc.proto")
public final class KeyManagerShowPixKeyDetailGrpc {

  private KeyManagerShowPixKeyDetailGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeyManagerShowPixKeyDetail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.GetPixKeyDetailRequest,
      br.com.zup.edu.GetPixKeyDetailResponse> getShowDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showDetail",
      requestType = br.com.zup.edu.GetPixKeyDetailRequest.class,
      responseType = br.com.zup.edu.GetPixKeyDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.GetPixKeyDetailRequest,
      br.com.zup.edu.GetPixKeyDetailResponse> getShowDetailMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.GetPixKeyDetailRequest, br.com.zup.edu.GetPixKeyDetailResponse> getShowDetailMethod;
    if ((getShowDetailMethod = KeyManagerShowPixKeyDetailGrpc.getShowDetailMethod) == null) {
      synchronized (KeyManagerShowPixKeyDetailGrpc.class) {
        if ((getShowDetailMethod = KeyManagerShowPixKeyDetailGrpc.getShowDetailMethod) == null) {
          KeyManagerShowPixKeyDetailGrpc.getShowDetailMethod = getShowDetailMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.GetPixKeyDetailRequest, br.com.zup.edu.GetPixKeyDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.GetPixKeyDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.GetPixKeyDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerShowPixKeyDetailMethodDescriptorSupplier("showDetail"))
              .build();
        }
      }
    }
    return getShowDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerShowPixKeyDetailStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailStub>() {
        @java.lang.Override
        public KeyManagerShowPixKeyDetailStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerShowPixKeyDetailStub(channel, callOptions);
        }
      };
    return KeyManagerShowPixKeyDetailStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerShowPixKeyDetailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailBlockingStub>() {
        @java.lang.Override
        public KeyManagerShowPixKeyDetailBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerShowPixKeyDetailBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerShowPixKeyDetailBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerShowPixKeyDetailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerShowPixKeyDetailFutureStub>() {
        @java.lang.Override
        public KeyManagerShowPixKeyDetailFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerShowPixKeyDetailFutureStub(channel, callOptions);
        }
      };
    return KeyManagerShowPixKeyDetailFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerShowPixKeyDetailImplBase implements io.grpc.BindableService {

    /**
     */
    public void showDetail(br.com.zup.edu.GetPixKeyDetailRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.GetPixKeyDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.GetPixKeyDetailRequest,
                br.com.zup.edu.GetPixKeyDetailResponse>(
                  this, METHODID_SHOW_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerShowPixKeyDetailStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerShowPixKeyDetailStub> {
    private KeyManagerShowPixKeyDetailStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerShowPixKeyDetailStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerShowPixKeyDetailStub(channel, callOptions);
    }

    /**
     */
    public void showDetail(br.com.zup.edu.GetPixKeyDetailRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.GetPixKeyDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerShowPixKeyDetailBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerShowPixKeyDetailBlockingStub> {
    private KeyManagerShowPixKeyDetailBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerShowPixKeyDetailBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerShowPixKeyDetailBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.GetPixKeyDetailResponse showDetail(br.com.zup.edu.GetPixKeyDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerShowPixKeyDetailFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerShowPixKeyDetailFutureStub> {
    private KeyManagerShowPixKeyDetailFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerShowPixKeyDetailFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerShowPixKeyDetailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.GetPixKeyDetailResponse> showDetail(
        br.com.zup.edu.GetPixKeyDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_DETAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerShowPixKeyDetailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerShowPixKeyDetailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_DETAIL:
          serviceImpl.showDetail((br.com.zup.edu.GetPixKeyDetailRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.GetPixKeyDetailResponse>) responseObserver);
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

  private static abstract class KeyManagerShowPixKeyDetailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerShowPixKeyDetailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerShowPixKeyDetail");
    }
  }

  private static final class KeyManagerShowPixKeyDetailFileDescriptorSupplier
      extends KeyManagerShowPixKeyDetailBaseDescriptorSupplier {
    KeyManagerShowPixKeyDetailFileDescriptorSupplier() {}
  }

  private static final class KeyManagerShowPixKeyDetailMethodDescriptorSupplier
      extends KeyManagerShowPixKeyDetailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerShowPixKeyDetailMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerShowPixKeyDetailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerShowPixKeyDetailFileDescriptorSupplier())
              .addMethod(getShowDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
