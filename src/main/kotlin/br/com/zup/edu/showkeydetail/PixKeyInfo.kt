package br.com.zup.edu.showkeydetail

import br.com.zup.edu.storekey.Account
import br.com.zup.edu.storekey.AllowedAccountType
import br.com.zup.edu.storekey.AllowedKeyType
import br.com.zup.edu.storekey.PixKey
import java.time.LocalDateTime
import java.util.*

data class PixKeyInfo(
    val pixId: UUID? = null,
    val ownerId: UUID? = null,
    val type: AllowedKeyType,
    val keyValue: String,
    //val accountType: AllowedAccountType,
    val accountType: String,
    val account: Account,
    val createdAt: LocalDateTime = LocalDateTime.now()
    ) {

    companion object {
        fun of(pixKey: PixKey): PixKeyInfo {
            return PixKeyInfo(
                pixId = pixKey.id,
                ownerId = pixKey.ownerId,
                type = pixKey.keyType,
                keyValue = pixKey.value,
                accountType = pixKey.accountType.name,
                account = pixKey.associatedAccount,
                createdAt =  pixKey.createdAd
            )
        }
    }

}
