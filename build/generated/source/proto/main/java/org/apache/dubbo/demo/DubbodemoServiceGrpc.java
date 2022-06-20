
    package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static org.apache.dubbo.demo.demoServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: demo.proto")
public final class DubbodemoServiceGrpc {
private DubbodemoServiceGrpc() {}

public static class DubbodemoServiceStub implements IdemoService {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected demoServiceGrpc.demoServiceBlockingStub blockingStub;
protected demoServiceGrpc.demoServiceFutureStub futureStub;
protected demoServiceGrpc.demoServiceStub stub;

public DubbodemoServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = demoServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = demoServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = demoServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public org.apache.dubbo.demo.HelloReply sayHello(org.apache.dubbo.demo.HelloRequest request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloReply> sayHelloAsync(org.apache.dubbo.demo.HelloRequest request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public void sayHello(org.apache.dubbo.demo.HelloRequest request, io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request, responseObserver);
    }

}

public static DubbodemoServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubbodemoServiceStub(channel, callOptions, url, referenceConfig);
}

public interface IdemoService {
    default public org.apache.dubbo.demo.HelloReply sayHello(org.apache.dubbo.demo.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloReply> sayHelloAsync(org.apache.dubbo.demo.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void sayHello(org.apache.dubbo.demo.HelloRequest request, io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply> responseObserver);

}

    /**
     * <pre>
     *  The demo service definition.
     * </pre>
     */
public static abstract class demoServiceImplBase implements io.grpc.BindableService, IdemoService {

private IdemoService proxiedImpl;

public final void setProxiedImpl(IdemoService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final org.apache.dubbo.demo.HelloReply sayHello(org.apache.dubbo.demo.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloReply> sayHelloAsync(org.apache.dubbo.demo.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void sayHello(org.apache.dubbo.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply> responseObserver) {
        asyncUnimplementedUnaryCall(org.apache.dubbo.demo.demoServiceGrpc.getSayHelloMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    org.apache.dubbo.demo.demoServiceGrpc.getSayHelloMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    org.apache.dubbo.demo.HelloRequest,
    org.apache.dubbo.demo.HelloReply>(
    proxiedImpl, METHODID_SAY_HELLO)))
.build();
}
}
    private static final int METHODID_SAY_HELLO = 0;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IdemoService serviceImpl;
private final int methodId;

MethodHandlers(IdemoService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAY_HELLO:
            serviceImpl.sayHello((org.apache.dubbo.demo.HelloRequest) request,
            (io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloReply>) responseObserver);
            break;
    default:
    throw new java.lang.AssertionError();
    }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new java.lang.AssertionError();
            }
            }
            }

            }
