package br.com.zup.edu.storekey

import br.com.zup.edu.KeyManagerGrpcServiceGrpc
import br.com.zup.edu.StoreKeyRequest
import br.com.zup.edu.StoreKeyResponse
import io.grpc.Status
import io.grpc.stub.StreamObserver
import javax.inject.Singleton


@Singleton
class StoreKeyEndpoint(private val service: StoreKeyDomainService) :
    KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase() {

    override fun storeKey(request: StoreKeyRequest?, responseObserver: StreamObserver<StoreKeyResponse>?) {
        val newPixKeyRequest: NewPixKeyRequest = request!!.toModel()

        try {
            val storedKey = service.store(newPixKeyRequest)

            val fakeResponse = StoreKeyResponse
                .newBuilder()
                .setPixId(storedKey.id.toString())
                .build()
            with(responseObserver!!) {
                onNext(fakeResponse)
                onCompleted()
            }
        } catch (e: PixKeyAlreadyExists) {
            responseObserver?.onError(
                Status
                    .ALREADY_EXISTS
                    .withDescription(e.message)
                    .asRuntimeException()
            )
            return
        } catch (e: AccountOwnerNotFoundException) {
            responseObserver?.onError(
                Status
                    .NOT_FOUND
                    .withDescription(e.message)
                    .asRuntimeException()
            )
            return
        }


    }
}