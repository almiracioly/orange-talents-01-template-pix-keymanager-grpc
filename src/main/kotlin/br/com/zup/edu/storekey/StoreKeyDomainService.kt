package br.com.zup.edu.storekey

import br.com.zup.edu.shared.externalservice.erpitau.ErpItauClient
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class StoreKeyDomainService(
    private val erpItauClient: ErpItauClient,
    private val pixKeyRepository: PixKeyRepository
) {
    @Transactional
    open fun store(newPixKeyRequest: NewPixKeyRequest): PixKey {
        if (pixKeyRepository.existsByValue(newPixKeyRequest.value!!))
            throw PixKeyAlreadyExists("Key ${newPixKeyRequest.value} already exists")

        val erpItauResponse = erpItauClient.getCustomerByIdAndAccountType(
            newPixKeyRequest.ownerId!!.toString(),
            newPixKeyRequest.accountType!!.translated()
        )

        val account = erpItauResponse.body()?.toModel() ?: throw AccountOwnerNotFoundException("Account Owner not found")
        val newPixKey = newPixKeyRequest.toModel(account)
        pixKeyRepository.save(newPixKey)

        return newPixKey
    }

}
