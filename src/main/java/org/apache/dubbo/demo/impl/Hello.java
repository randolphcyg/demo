package org.apache.dubbo.demo.impl;

import io.grpc.stub.StreamObserver;
import org.apache.dubbo.demo.DubbodemoClientGrpc;
import org.apache.dubbo.demo.HelloReq;
import org.apache.dubbo.demo.HelloResp;

public class Hello extends DubbodemoClientGrpc.demoClientImplBase {
    @Override
    public void sayHello(HelloReq request, StreamObserver<HelloResp> responseObserver) {
        System.out.println("获取输入值： " + request.getName());
        System.out.println("执行的线程是：" + Thread.currentThread().getName());

        HelloResp reply = HelloResp.newBuilder().setMessage("返回值：" + request.getName() + " from dubbo3").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}