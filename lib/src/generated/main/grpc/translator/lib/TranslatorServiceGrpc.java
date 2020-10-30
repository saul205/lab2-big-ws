package translator.lib;

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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: Translator.proto")
public final class TranslatorServiceGrpc {

  private TranslatorServiceGrpc() {}

  public static final String SERVICE_NAME = "TranslatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<translator.lib.TranslatorProto.TranslationRequest,
      translator.lib.TranslatorProto.TranslationReply> getTranslateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Translate",
      requestType = translator.lib.TranslatorProto.TranslationRequest.class,
      responseType = translator.lib.TranslatorProto.TranslationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<translator.lib.TranslatorProto.TranslationRequest,
      translator.lib.TranslatorProto.TranslationReply> getTranslateMethod() {
    io.grpc.MethodDescriptor<translator.lib.TranslatorProto.TranslationRequest, translator.lib.TranslatorProto.TranslationReply> getTranslateMethod;
    if ((getTranslateMethod = TranslatorServiceGrpc.getTranslateMethod) == null) {
      synchronized (TranslatorServiceGrpc.class) {
        if ((getTranslateMethod = TranslatorServiceGrpc.getTranslateMethod) == null) {
          TranslatorServiceGrpc.getTranslateMethod = getTranslateMethod =
              io.grpc.MethodDescriptor.<translator.lib.TranslatorProto.TranslationRequest, translator.lib.TranslatorProto.TranslationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Translate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  translator.lib.TranslatorProto.TranslationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  translator.lib.TranslatorProto.TranslationReply.getDefaultInstance()))
              .setSchemaDescriptor(new TranslatorServiceMethodDescriptorSupplier("Translate"))
              .build();
        }
      }
    }
    return getTranslateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceStub>() {
        @java.lang.Override
        public TranslatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslatorServiceStub(channel, callOptions);
        }
      };
    return TranslatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceBlockingStub>() {
        @java.lang.Override
        public TranslatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslatorServiceBlockingStub(channel, callOptions);
        }
      };
    return TranslatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslatorServiceFutureStub>() {
        @java.lang.Override
        public TranslatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslatorServiceFutureStub(channel, callOptions);
        }
      };
    return TranslatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class TranslatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void translate(translator.lib.TranslatorProto.TranslationRequest request,
        io.grpc.stub.StreamObserver<translator.lib.TranslatorProto.TranslationReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTranslateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTranslateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                translator.lib.TranslatorProto.TranslationRequest,
                translator.lib.TranslatorProto.TranslationReply>(
                  this, METHODID_TRANSLATE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TranslatorServiceStub extends io.grpc.stub.AbstractAsyncStub<TranslatorServiceStub> {
    private TranslatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void translate(translator.lib.TranslatorProto.TranslationRequest request,
        io.grpc.stub.StreamObserver<translator.lib.TranslatorProto.TranslationReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TranslatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TranslatorServiceBlockingStub> {
    private TranslatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public translator.lib.TranslatorProto.TranslationReply translate(translator.lib.TranslatorProto.TranslationRequest request) {
      return blockingUnaryCall(
          getChannel(), getTranslateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TranslatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TranslatorServiceFutureStub> {
    private TranslatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<translator.lib.TranslatorProto.TranslationReply> translate(
        translator.lib.TranslatorProto.TranslationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TranslatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TranslatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSLATE:
          serviceImpl.translate((translator.lib.TranslatorProto.TranslationRequest) request,
              (io.grpc.stub.StreamObserver<translator.lib.TranslatorProto.TranslationReply>) responseObserver);
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

  private static abstract class TranslatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return translator.lib.TranslatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslatorService");
    }
  }

  private static final class TranslatorServiceFileDescriptorSupplier
      extends TranslatorServiceBaseDescriptorSupplier {
    TranslatorServiceFileDescriptorSupplier() {}
  }

  private static final class TranslatorServiceMethodDescriptorSupplier
      extends TranslatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TranslatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TranslatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslatorServiceFileDescriptorSupplier())
              .addMethod(getTranslateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
