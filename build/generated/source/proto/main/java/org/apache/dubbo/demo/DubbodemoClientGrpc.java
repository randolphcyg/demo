
    package org.apache.dubbo.demo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.ReferenceConfigBase;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static org.apache.dubbo.demo.demoClientGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.Generated(
value = "by DubboGrpc generator",
comments = "Source: demo.proto")
public final class DubbodemoClientGrpc {
private DubbodemoClientGrpc() {}

public static class DubbodemoClientStub implements IdemoClient {

protected URL url;
protected ReferenceConfigBase<?> referenceConfig;

protected demoClientGrpc.demoClientBlockingStub blockingStub;
protected demoClientGrpc.demoClientFutureStub futureStub;
protected demoClientGrpc.demoClientStub stub;

public DubbodemoClientStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
this.url = url;
this.referenceConfig = referenceConfig;

blockingStub = demoClientGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = demoClientGrpc.newFutureStub(channel).build(channel, callOptions);
stub = demoClientGrpc.newStub(channel).build(channel, callOptions);
}

    public org.apache.dubbo.demo.HelloResp sayHello(org.apache.dubbo.demo.HelloReq request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloResp> sayHelloAsync(org.apache.dubbo.demo.HelloReq request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request);
    }

    public void sayHello(org.apache.dubbo.demo.HelloReq request, io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .sayHello(request, responseObserver);
    }

}

public static DubbodemoClientStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url, ReferenceConfigBase<?> referenceConfig) {
return new DubbodemoClientStub(channel, callOptions, url, referenceConfig);
}

public interface IdemoClient {
    default public org.apache.dubbo.demo.HelloResp sayHello(org.apache.dubbo.demo.HelloReq request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloResp> sayHelloAsync(org.apache.dubbo.demo.HelloReq request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void sayHello(org.apache.dubbo.demo.HelloReq request, io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp> responseObserver);

}

    /**
     * <pre>
     *  rpc 客户端接口
     * </pre>
     */
public static abstract class demoClientImplBase implements io.grpc.BindableService, IdemoClient {

private IdemoClient proxiedImpl;

public final void setProxiedImpl(IdemoClient proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final org.apache.dubbo.demo.HelloResp sayHello(org.apache.dubbo.demo.HelloReq request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.demo.HelloResp> sayHelloAsync(org.apache.dubbo.demo.HelloReq request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void sayHello(org.apache.dubbo.demo.HelloReq request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp> responseObserver) {
        asyncUnimplementedUnaryCall(org.apache.dubbo.demo.demoClientGrpc.getSayHelloMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    org.apache.dubbo.demo.demoClientGrpc.getSayHelloMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    org.apache.dubbo.demo.HelloReq,
    org.apache.dubbo.demo.HelloResp>(
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
private final IdemoClient serviceImpl;
private final int methodId;

MethodHandlers(IdemoClient serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAY_HELLO:
            serviceImpl.sayHello((org.apache.dubbo.demo.HelloReq) request,
            (io.grpc.stub.StreamObserver<org.apache.dubbo.demo.HelloResp>) responseObserver);
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
