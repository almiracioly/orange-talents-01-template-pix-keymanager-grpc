package br.com.zup.edu.storekey

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.*

@Introspected
data class NewPixKeyRequest(
    @field:NotBlank val ownerId: UUID?,
    @field:NotBlank @field:Size(max = 77) val value: String?,
    @field:NotNull val keyType: AllowedKeyType?,
    @field:NotNull val accountType: AllowedAccountType?
) {
    fun toModel(associatedAccount: Account) : PixKey {
        return PixKey(
        value = getKeyValue(value!!),
            ownerId = ownerId!!,
            keyType = AllowedKeyType.valueOf(keyType!!.name),
            accountType = AllowedAccountType.valueOf(accountType!!.name),
            associatedAccount
        )
    }

    private fun getKeyValue(value: String): String {
        return with(keyType!!) {
            if (this == AllowedKeyType.RANDOM) UUID.randomUUID().toString() else value
        }
    }
}