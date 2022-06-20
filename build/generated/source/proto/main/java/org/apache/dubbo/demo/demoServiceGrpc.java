package org.apache.dubbo.demo;

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
 * The demo service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: demo.proto")
public final class demoServiceGrpc {

  private demoServiceGrpc() {}

  public static final String SERVICE_NAME = "demo.demoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloRequest,
      org.apache.dubbo.demo.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.apache.dubbo.demo.HelloRequest.class,
      responseType = org.apache.dubbo.demo.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloRequest,
      org.apache.dubbo.demo.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloRequest, org.apache.dubbo.demo.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = demoServiceGrpc.getSayHelloMethod) == null) {
      synchronized (demoServiceGrpc.class) {
        if ((getSayHelloMethod = demoServiceGrpc.getSayHelloMethod) == null) {
          demoServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.apache.dubbo.demo.HelloRequest, org.apache.dubbo.demo.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.demo.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.demo.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new demoServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static demoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceStub>() {
        @java.lang.Override
        public demoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceStub(channel, callOptions);
        }
      };
    return demoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static demoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceBlockingStub>() {
        @java.lang.Override
        public demoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceBlockingStub(channel, callOptions);
        }
      };
    return demoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static demoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceFutureStub>() {
        @java.lang.Override
        public demoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceFutureStub(channel, callOptions);
        }
      };
    return demoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static abstract class demoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(org.apache.dubbo.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.dubbo.demo.HelloRequest,
                org.apache.dubbo.demo.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class demoServiceStub extends io.grpc.stub.AbstractAsyncStub<demoServiceStub> {
    private demoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(org.apache.dubbo.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class demoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<demoServiceBlockingStub> {
    private demoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.dubbo.demo.HelloReply sayHello(org.apache.dubbo.demo.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The demo service definition.
   * </pre>
   */
  public static final class demoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<demoServiceFutureStub> {
    private demoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloReply> sayHello(
        org.apache.dubbo.demo.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final demoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(demoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.apache.dubbo.demo.HelloRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply>) responseObserver);
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

  private static abstract class demoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    demoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.dubbo.demo.demoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("demoService");
    }
  }

  private static final class demoServiceFileDescriptorSupplier
      extends demoServiceBaseDescriptorSupplier {
    demoServiceFileDescriptorSupplier() {}
  }

  private static final class demoServiceMethodDescriptorSupplier
      extends demoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    demoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (demoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new demoServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
