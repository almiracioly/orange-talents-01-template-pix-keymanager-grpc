package br.com.zup.edu.storekey

import br.com.zup.edu.KeyManagerGrpcServiceGrpc
import br.com.zup.edu.KeyType
import br.com.zup.edu.StoreKeyRequest
import br.com.zup.edu.StoreKeyResponse
import io.grpc.Status
import io.grpc.stub.StreamObserver
import io.micronaut.validation.validator.Validator
import java.util.*
import javax.inject.Singleton


@Singleton
class StoreKeyService(private val pixKeyRepository: PixKeyRepository, private val beanValidator: Validator) :
    KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase() {

    override fun storeKey(request: StoreKeyRequest?, responseObserver: StreamObserver<StoreKeyResponse>?) {

        val newPixKeyRequest = NewPixKeyRequest(
            request!!.ownerId,
            request.value,
            request.keyType.number,
            request.accountType.number
        )

        if (!isRequestValid(newPixKeyRequest)
            || !isValueValidToItsType(request)
        ) {
            sendErrorMessageAndFinish(
                responseObserver, Status.INVALID_ARGUMENT,
                "Campos mal formatados",
                "Verifique os valores informados de acordo com o contrato do servico"
            )
            return
        }

        if (pixKeyRepository.existsByValue(request.value)) {
            sendErrorMessageAndFinish(responseObserver, Status.ALREADY_EXISTS)
            return
        }

        val pixKeyPersisted = pixKeyRepository.save(pixDomainObjectByRequest(request!!))
        val response = StoreKeyResponse
            .newBuilder()
            .setPixId(pixKeyPersisted.id.toString())
            .build()

        with(responseObserver!!) {
            onNext(response)
            onCompleted()
        }
    }

    private fun isRequestValid(request: NewPixKeyRequest): Boolean {
        return beanValidator.validate(request).size == 0
    }

    private fun isValueValidToItsType(receivedRequest: StoreKeyRequest) = AllowedKeyType
        .valueOf(receivedRequest.keyType.name)
        .isValid(receivedRequest.value)

    private fun sendErrorMessageAndFinish(
        responseObserver: StreamObserver<StoreKeyResponse>?,
        errorStatus: Status,
        withDescription: String? = null,
        augmentDescription: String? = null
    ) {
        if (withDescription != null) errorStatus.withDescription(withDescription)
        if (augmentDescription != null) errorStatus.augmentDescription(augmentDescription)

        responseObserver?.onError(errorStatus.asRuntimeException())
    }

    private fun pixDomainObjectByRequest(request: StoreKeyRequest): PixKey {
        val value =
            if (request.keyType == KeyType.RANDOM) buildUniqueUUIDValue()
            else request.value

        return PixKey(value, request.ownerId)
    }

    fun buildUniqueUUIDValue(): String {
        var isUnique = false
        var uniqueValue: String?
        do {
            uniqueValue = UUID.randomUUID().toString()
            if (!pixKeyRepository.existsByValue(uniqueValue)) isUnique = true
        } while (!isUnique)

        return uniqueValue!!
    }

}