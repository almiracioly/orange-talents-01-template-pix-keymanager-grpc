package br.com.zup.edu

import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@Singleton
class HelloService : KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase() {

    override fun send(request: KeyManagerGrpcRequest?, responseObserver: StreamObserver<KeyManagerGrpcReply>?) {
        val requestAsObject = KeyManagerGrpcRequest.newBuilder().mergeFrom(request)
        val receivedName = requestAsObject.name

        val response = KeyManagerGrpcReply
            .newBuilder()
            .setMessage("Hello, $receivedName")
            .build()

        with (responseObserver!!) {
            onNext(response)
            onCompleted()
        }
    }
}