package br.com.zup.edu.removekey

import br.com.zup.edu.KeyManagerRemovePixKeyGrpc
import br.com.zup.edu.RemoveKeyRequest
import br.com.zup.edu.RemoveKeyResponse
import br.com.zup.edu.storekey.PixKeyRepository
import io.grpc.Status
import io.grpc.stub.StreamObserver
import io.micronaut.validation.validator.Validator
import java.util.*
import javax.inject.Singleton

@Singleton
class RemoveKeyService(
    private val beanValidator: Validator,
    private val pixKeyRepository: PixKeyRepository
) : KeyManagerRemovePixKeyGrpc.KeyManagerRemovePixKeyImplBase() {

    override fun removeKey(request: RemoveKeyRequest?, responseObserver: StreamObserver<RemoveKeyResponse>?) {
        val removeKeyRequestDataScope = RemoveKeyRequestDataScope(
            request!!.pixId,
            UUID.fromString(request.ownerId)
        )

        if (!isRequestValid(removeKeyRequestDataScope)) {
            responseObserver?.onError(
                Status
                    .INVALID_ARGUMENT
                    .withDescription("Campos mal formatados")
                    .asRuntimeException()
            )
            return
        }

        val possiblePixKey = pixKeyRepository.findById(UUID.fromString(request.pixId))
        if (possiblePixKey.isEmpty) {
            responseObserver?.onError(
                Status
                    .NOT_FOUND
                    .withDescription("Chave inexistente")
                    .asRuntimeException()
            )
            return
        }

        val foundPixKey = possiblePixKey.get()
        if (foundPixKey.ownerId != UUID.fromString(request.ownerId)) {
            responseObserver?.onError(
                Status
                    .PERMISSION_DENIED
                    .withDescription("Operacão restrita ao dono da chave")
                    .asRuntimeException()
            )
            return
        }


        pixKeyRepository.delete(foundPixKey)

        with(responseObserver!!) {
            onNext(
                RemoveKeyResponse.newBuilder()
                    .setMessage("Chave Pix removida com sucesso!")
                    .build()
            )
            onCompleted()
        }

    }

    private fun isRequestValid(removeKeyRequestDataScope: RemoveKeyRequestDataScope) =
        beanValidator.validate(
            removeKeyRequestDataScope
        ).size == 0
}