package br.com.zup.edu.shared.externalservice.bcb

import br.com.zup.edu.KeyType
import br.com.zup.edu.showkeydetail.PixKeyInfo
import br.com.zup.edu.storekey.Account
import br.com.zup.edu.storekey.AllowedKeyType
import java.time.LocalDateTime

data class PixKeyDetailsResponse(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BcbBankAccountResponse,
    val owner: BcbOwnerResponse,
    val createdAt: LocalDateTime
) {
    fun toModel(): PixKeyInfo {
        return PixKeyInfo(
            type = AllowedKeyType.valueOf(keyType.name),
            keyValue = key,
            accountType = bankAccount.accountType,
            account = Account(
                ownerName = owner.name,
                cpf = owner.taxIdNumber,
                agency = bankAccount.branch,
                accountNumber = bankAccount.accountNumber
            )
        )
    }

}
