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
public final class KeyManagerRemovePixKeyGrpc {

  private KeyManagerRemovePixKeyGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeyManagerRemovePixKey";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.RemoveKeyRequest,
      br.com.zup.edu.RemoveKeyResponse> getRemoveKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeKey",
      requestType = br.com.zup.edu.RemoveKeyRequest.class,
      responseType = br.com.zup.edu.RemoveKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.RemoveKeyRequest,
      br.com.zup.edu.RemoveKeyResponse> getRemoveKeyMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.RemoveKeyRequest, br.com.zup.edu.RemoveKeyResponse> getRemoveKeyMethod;
    if ((getRemoveKeyMethod = KeyManagerRemovePixKeyGrpc.getRemoveKeyMethod) == null) {
      synchronized (KeyManagerRemovePixKeyGrpc.class) {
        if ((getRemoveKeyMethod = KeyManagerRemovePixKeyGrpc.getRemoveKeyMethod) == null) {
          KeyManagerRemovePixKeyGrpc.getRemoveKeyMethod = getRemoveKeyMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.RemoveKeyRequest, br.com.zup.edu.RemoveKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.RemoveKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.RemoveKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerRemovePixKeyMethodDescriptorSupplier("removeKey"))
              .build();
        }
      }
    }
    return getRemoveKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerRemovePixKeyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyStub>() {
        @java.lang.Override
        public KeyManagerRemovePixKeyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerRemovePixKeyStub(channel, callOptions);
        }
      };
    return KeyManagerRemovePixKeyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerRemovePixKeyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyBlockingStub>() {
        @java.lang.Override
        public KeyManagerRemovePixKeyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerRemovePixKeyBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerRemovePixKeyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerRemovePixKeyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerRemovePixKeyFutureStub>() {
        @java.lang.Override
        public KeyManagerRemovePixKeyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerRemovePixKeyFutureStub(channel, callOptions);
        }
      };
    return KeyManagerRemovePixKeyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerRemovePixKeyImplBase implements io.grpc.BindableService {

    /**
     */
    public void removeKey(br.com.zup.edu.RemoveKeyRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveKeyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.RemoveKeyRequest,
                br.com.zup.edu.RemoveKeyResponse>(
                  this, METHODID_REMOVE_KEY)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerRemovePixKeyStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerRemovePixKeyStub> {
    private KeyManagerRemovePixKeyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerRemovePixKeyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerRemovePixKeyStub(channel, callOptions);
    }

    /**
     */
    public void removeKey(br.com.zup.edu.RemoveKeyRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveKeyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerRemovePixKeyBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerRemovePixKeyBlockingStub> {
    private KeyManagerRemovePixKeyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerRemovePixKeyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerRemovePixKeyBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.RemoveKeyResponse removeKey(br.com.zup.edu.RemoveKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerRemovePixKeyFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerRemovePixKeyFutureStub> {
    private KeyManagerRemovePixKeyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerRemovePixKeyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerRemovePixKeyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.RemoveKeyResponse> removeKey(
        br.com.zup.edu.RemoveKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_KEY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerRemovePixKeyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerRemovePixKeyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_KEY:
          serviceImpl.removeKey((br.com.zup.edu.RemoveKeyRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveKeyResponse>) responseObserver);
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

  private static abstract class KeyManagerRemovePixKeyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerRemovePixKeyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerRemovePixKey");
    }
  }

  private static final class KeyManagerRemovePixKeyFileDescriptorSupplier
      extends KeyManagerRemovePixKeyBaseDescriptorSupplier {
    KeyManagerRemovePixKeyFileDescriptorSupplier() {}
  }

  private static final class KeyManagerRemovePixKeyMethodDescriptorSupplier
      extends KeyManagerRemovePixKeyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerRemovePixKeyMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerRemovePixKeyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerRemovePixKeyFileDescriptorSupplier())
              .addMethod(getRemoveKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
