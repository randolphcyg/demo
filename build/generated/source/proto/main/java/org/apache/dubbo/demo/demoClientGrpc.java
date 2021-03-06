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
 * rpc 客户端接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: demo.proto")
public final class demoClientGrpc {

  private demoClientGrpc() {}

  public static final String SERVICE_NAME = "demopb.demoClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloReq,
      org.apache.dubbo.demo.HelloResp> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = org.apache.dubbo.demo.HelloReq.class,
      responseType = org.apache.dubbo.demo.HelloResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloReq,
      org.apache.dubbo.demo.HelloResp> getSayHelloMethod() {
    io.grpc.MethodDescriptor<org.apache.dubbo.demo.HelloReq, org.apache.dubbo.demo.HelloResp> getSayHelloMethod;
    if ((getSayHelloMethod = demoClientGrpc.getSayHelloMethod) == null) {
      synchronized (demoClientGrpc.class) {
        if ((getSayHelloMethod = demoClientGrpc.getSayHelloMethod) == null) {
          demoClientGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<org.apache.dubbo.demo.HelloReq, org.apache.dubbo.demo.HelloResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.demo.HelloReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.demo.HelloResp.getDefaultInstance()))
              .setSchemaDescriptor(new demoClientMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static demoClientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoClientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoClientStub>() {
        @java.lang.Override
        public demoClientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoClientStub(channel, callOptions);
        }
      };
    return demoClientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static demoClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoClientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoClientBlockingStub>() {
        @java.lang.Override
        public demoClientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoClientBlockingStub(channel, callOptions);
        }
      };
    return demoClientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static demoClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoClientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoClientFutureStub>() {
        @java.lang.Override
        public demoClientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoClientFutureStub(channel, callOptions);
        }
      };
    return demoClientFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * rpc 客户端接口
   * </pre>
   */
  public static abstract class demoClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(org.apache.dubbo.demo.HelloReq request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.dubbo.demo.HelloReq,
                org.apache.dubbo.demo.HelloResp>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * rpc 客户端接口
   * </pre>
   */
  public static final class demoClientStub extends io.grpc.stub.AbstractAsyncStub<demoClientStub> {
    private demoClientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoClientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoClientStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(org.apache.dubbo.demo.HelloReq request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * rpc 客户端接口
   * </pre>
   */
  public static final class demoClientBlockingStub extends io.grpc.stub.AbstractBlockingStub<demoClientBlockingStub> {
    private demoClientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoClientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.dubbo.demo.HelloResp sayHello(org.apache.dubbo.demo.HelloReq request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * rpc 客户端接口
   * </pre>
   */
  public static final class demoClientFutureStub extends io.grpc.stub.AbstractFutureStub<demoClientFutureStub> {
    private demoClientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoClientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloResp> sayHello(
        org.apache.dubbo.demo.HelloReq request) {
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
    private final demoClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(demoClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((org.apache.dubbo.demo.HelloReq) request,
              (io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp>) responseObserver);
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

  private static abstract class demoClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    demoClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.dubbo.demo.demoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("demoClient");
    }
  }

  private static final class demoClientFileDescriptorSupplier
      extends demoClientBaseDescriptorSupplier {
    demoClientFileDescriptorSupplier() {}
  }

  private static final class demoClientMethodDescriptorSupplier
      extends demoClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    demoClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (demoClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new demoClientFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
