package org.apache.dubbo.demo.impl;

import io.grpc.stub.StreamObserver;
import org.apache.dubbo.demo.DubbodemoServiceGrpc;
import org.apache.dubbo.demo.HelloReply;
import org.apache.dubbo.demo.HelloRequest;

public class Hello extends DubbodemoServiceGrpc.demoServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("Executing thread is " + Thread.currentThread().getName());
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}