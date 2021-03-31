package br.com.zup.edu.listownerpixkeys

import br.com.zup.edu.GetAllPixKeysRequest
import br.com.zup.edu.GetAllPixKeysResponse
import br.com.zup.edu.KeyManagerListPixKeysGrpc
import br.com.zup.edu.ResumedPixKeyInfo
import br.com.zup.edu.storekey.AccountOwnerNotFoundException
import br.com.zup.edu.storekey.PixKey
import br.com.zup.edu.storekey.PixKeyRepository
import io.grpc.stub.StreamObserver
import java.util.*
import javax.inject.Singleton

@Singleton
class ListPixKeysEndpoint(private val pixKeyRepository: PixKeyRepository) :
    KeyManagerListPixKeysGrpc.KeyManagerListPixKeysImplBase() {

    override fun getAllPixKeys(
        request: GetAllPixKeysRequest?,
        responseObserver: StreamObserver<GetAllPixKeysResponse>?
    ) {

        if (request!!.ownerId.isNullOrBlank())
            throw IllegalArgumentException("ID do cliente invalido ou nulo")

        val ownerId = UUID.fromString(request.ownerId)
        if (!pixKeyRepository.existsByOwnerId(ownerId))
            throw AccountOwnerNotFoundException("Cliente não cadastrado")

        val allOwnerPixKeys = pixKeyRepository
            .findAllByOwnerId(ownerId)
            .map { resumedPixKeyInfoOf(it) }


        with(responseObserver!!) {
            onNext(
                GetAllPixKeysResponse
                    .newBuilder()
                    .addAllPixKeys(allOwnerPixKeys)
                    .build()
            )
            onCompleted()
        }
    }

    private fun resumedPixKeyInfoOf(pixKey: PixKey): ResumedPixKeyInfo {
        return ResumedPixKeyInfo
            .newBuilder()
            .setPixId(pixKey.id.toString())
            .setKeyValue(pixKey.value)
            .setOwnerId(pixKey.ownerId.toString())
            .build()
    }
}