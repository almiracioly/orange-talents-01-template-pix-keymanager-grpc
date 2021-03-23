package br.com.zup.edu.storekey

import br.com.zup.edu.KeyManagerGrpcServiceGrpc
import br.com.zup.edu.StoreKeyRequest
import br.com.zup.edu.StoreKeyResponse
import br.com.zup.edu.shared.customannotation.errorhandler.ErrorHandler
import io.grpc.stub.StreamObserver
import javax.inject.Singleton


@ErrorHandler
@Singleton
open class StoreKeyEndpoint(private val service: StoreKeyDomainService) :
    KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase() {

    open override fun storeKey(request: StoreKeyRequest?, responseObserver: StreamObserver<StoreKeyResponse>?) {
        val newPixKeyRequest: NewPixKeyRequest = request!!.toModel()

        val storedKey = service.store(newPixKeyRequest)

        val fakeResponse = StoreKeyResponse
            .newBuilder()
            .setPixId(storedKey.id.toString())
            .build()
        with(responseObserver!!) {
            onNext(fakeResponse)
            onCompleted()
        }


    }
}