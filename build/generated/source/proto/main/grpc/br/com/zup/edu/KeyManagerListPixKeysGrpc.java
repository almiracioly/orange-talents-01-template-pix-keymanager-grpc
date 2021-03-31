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
public final class KeyManagerListPixKeysGrpc {

  private KeyManagerListPixKeysGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeyManagerListPixKeys";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.GetAllPixKeysRequest,
      br.com.zup.edu.GetAllPixKeysResponse> getGetAllPixKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPixKeys",
      requestType = br.com.zup.edu.GetAllPixKeysRequest.class,
      responseType = br.com.zup.edu.GetAllPixKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.GetAllPixKeysRequest,
      br.com.zup.edu.GetAllPixKeysResponse> getGetAllPixKeysMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.GetAllPixKeysRequest, br.com.zup.edu.GetAllPixKeysResponse> getGetAllPixKeysMethod;
    if ((getGetAllPixKeysMethod = KeyManagerListPixKeysGrpc.getGetAllPixKeysMethod) == null) {
      synchronized (KeyManagerListPixKeysGrpc.class) {
        if ((getGetAllPixKeysMethod = KeyManagerListPixKeysGrpc.getGetAllPixKeysMethod) == null) {
          KeyManagerListPixKeysGrpc.getGetAllPixKeysMethod = getGetAllPixKeysMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.GetAllPixKeysRequest, br.com.zup.edu.GetAllPixKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllPixKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.GetAllPixKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.GetAllPixKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyManagerListPixKeysMethodDescriptorSupplier("getAllPixKeys"))
              .build();
        }
      }
    }
    return getGetAllPixKeysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyManagerListPixKeysStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysStub>() {
        @java.lang.Override
        public KeyManagerListPixKeysStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListPixKeysStub(channel, callOptions);
        }
      };
    return KeyManagerListPixKeysStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyManagerListPixKeysBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysBlockingStub>() {
        @java.lang.Override
        public KeyManagerListPixKeysBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListPixKeysBlockingStub(channel, callOptions);
        }
      };
    return KeyManagerListPixKeysBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyManagerListPixKeysFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyManagerListPixKeysFutureStub>() {
        @java.lang.Override
        public KeyManagerListPixKeysFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyManagerListPixKeysFutureStub(channel, callOptions);
        }
      };
    return KeyManagerListPixKeysFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyManagerListPixKeysImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllPixKeys(br.com.zup.edu.GetAllPixKeysRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.GetAllPixKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPixKeysMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllPixKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.GetAllPixKeysRequest,
                br.com.zup.edu.GetAllPixKeysResponse>(
                  this, METHODID_GET_ALL_PIX_KEYS)))
          .build();
    }
  }

  /**
   */
  public static final class KeyManagerListPixKeysStub extends io.grpc.stub.AbstractAsyncStub<KeyManagerListPixKeysStub> {
    private KeyManagerListPixKeysStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListPixKeysStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListPixKeysStub(channel, callOptions);
    }

    /**
     */
    public void getAllPixKeys(br.com.zup.edu.GetAllPixKeysRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.GetAllPixKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPixKeysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyManagerListPixKeysBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyManagerListPixKeysBlockingStub> {
    private KeyManagerListPixKeysBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListPixKeysBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListPixKeysBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.GetAllPixKeysResponse getAllPixKeys(br.com.zup.edu.GetAllPixKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPixKeysMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyManagerListPixKeysFutureStub extends io.grpc.stub.AbstractFutureStub<KeyManagerListPixKeysFutureStub> {
    private KeyManagerListPixKeysFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyManagerListPixKeysFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyManagerListPixKeysFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.GetAllPixKeysResponse> getAllPixKeys(
        br.com.zup.edu.GetAllPixKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPixKeysMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PIX_KEYS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyManagerListPixKeysImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyManagerListPixKeysImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PIX_KEYS:
          serviceImpl.getAllPixKeys((br.com.zup.edu.GetAllPixKeysRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.GetAllPixKeysResponse>) responseObserver);
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

  private static abstract class KeyManagerListPixKeysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyManagerListPixKeysBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyManagerListPixKeys");
    }
  }

  private static final class KeyManagerListPixKeysFileDescriptorSupplier
      extends KeyManagerListPixKeysBaseDescriptorSupplier {
    KeyManagerListPixKeysFileDescriptorSupplier() {}
  }

  private static final class KeyManagerListPixKeysMethodDescriptorSupplier
      extends KeyManagerListPixKeysBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyManagerListPixKeysMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyManagerListPixKeysGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyManagerListPixKeysFileDescriptorSupplier())
              .addMethod(getGetAllPixKeysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
