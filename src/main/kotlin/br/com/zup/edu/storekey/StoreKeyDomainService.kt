package br.com.zup.edu.storekey

import br.com.zup.edu.shared.externalservice.bcb.BcbClient
import br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest
import br.com.zup.edu.shared.externalservice.erpitau.ErpItauClient
import io.micronaut.http.HttpStatus
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class StoreKeyDomainService(
    private val erpItauClient: ErpItauClient,
    private val pixKeyRepository: PixKeyRepository,
    private val bcbClient: BcbClient
) {
    @Transactional
    open fun store(newPixKeyRequest: NewPixKeyRequest): PixKey {
        if (pixKeyRepository.existsByValue(newPixKeyRequest.value!!))
            throw PixKeyAlreadyExistsException("Key ${newPixKeyRequest.value} already exists")

        val erpItauResponse = erpItauClient.getCustomerByIdAndAccountType(
            newPixKeyRequest.ownerId!!.toString(),
            newPixKeyRequest.accountType!!.translated()
        )

        val account = erpItauResponse.body()?.toModel() ?: throw AccountOwnerNotFoundException("Account Owner not found")
        val newPixKey = newPixKeyRequest.toModel(account)
        pixKeyRepository.save(newPixKey)

        val bcbResponse = bcbClient.store(CreatePixKeyRequest(newPixKey))
        if (bcbResponse.status != HttpStatus.CREATED)
            throw IllegalStateException("Erro ao registrar chave Pix ${newPixKey.value} no Banco Central")

        newPixKey.update(bcbResponse.body()!!.key)

        return newPixKey
    }

}
