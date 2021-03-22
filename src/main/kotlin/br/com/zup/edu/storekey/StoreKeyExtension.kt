package br.com.zup.edu.storekey

import br.com.zup.edu.StoreKeyRequest
import java.util.*

fun StoreKeyRequest.toModel(): NewPixKeyRequest {
    return NewPixKeyRequest(
        UUID.fromString(ownerId),
        value,
        AllowedKeyType.valueOf(keyType.name),
        AllowedAccountType.valueOf(accountType.name)
    )
}