package br.com.zup.edu.shared.externalservice.bcb

import br.com.zup.edu.storekey.Account
import br.com.zup.edu.storekey.AllowedAccountType
import br.com.zup.edu.storekey.PixKey

class CreatePixKeyRequest(pixKey: PixKey) {
    val keyType = pixKey.keyType
    val key = pixKey.value
    val bankAccount: BcbBankAccountCreatePixKeyRequest = BcbBankAccountCreatePixKeyRequest(
        participant = "60701190",
        type = pixKey.accountType,
        associatedAccount = pixKey.associatedAccount
    )
    val owner = BcbAccountOwnerCreatePixKeyRequest(pixKey.associatedAccount)

    class BcbAccountOwnerCreatePixKeyRequest(associatedAccount: Account) {
        val type = "NATURAL_PERSON"
        val name = associatedAccount.ownerName
        val taxIdNumber = associatedAccount.cpf
    }

    class BcbBankAccountCreatePixKeyRequest(
        val participant: String,
        type: AllowedAccountType,
        associatedAccount: Account
    ) {
        val branch = associatedAccount.agency
        val accountNumber = associatedAccount.accountNumber
        val accountType = BcbAccountType.by(type)
    }

    enum class BcbAccountType(val domainType: AllowedAccountType) {
        CACC(AllowedAccountType.CHECKING),
        SACC(AllowedAccountType.SAVING);

        companion object {
            private val mapping = BcbAccountType.values().associateBy(BcbAccountType::domainType)

            fun by(domainType: AllowedAccountType): BcbAccountType {
                return mapping[domainType] ?: throw IllegalArgumentException("Invalid Bcb Account Type")
            }
        }
    }
}