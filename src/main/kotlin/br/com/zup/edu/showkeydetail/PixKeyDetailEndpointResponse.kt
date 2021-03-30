package br.com.zup.edu.showkeydetail

import br.com.zup.edu.BankAccountType
import br.com.zup.edu.GetPixKeyDetailResponse
import br.com.zup.edu.KeyType
import com.google.protobuf.Timestamp
import java.time.LocalDateTime
import java.time.ZoneOffset

class PixKeyDetailEndpointResponse() {
    fun of(pixKeyInfo: PixKeyInfo): GetPixKeyDetailResponse {
        return GetPixKeyDetailResponse
            .newBuilder()
            .setPixId(pixKeyInfo.pixId.toString() ?: "")
            .setKeyType(KeyType.valueOf(pixKeyInfo.type.name))
            .setKeyValue(pixKeyInfo.keyValue)
            .setOwner(getProtoOwnerInfoFrom(pixKeyInfo))
            .setAccount(getAccountInfoFrom(pixKeyInfo))
            .setCreatedAt(protobufTimestampOf(pixKeyInfo.createdAt))
            .build()
    }

    private fun protobufTimestampOf(createdAt: LocalDateTime): Timestamp {
        val instant = createdAt.toInstant(ZoneOffset.UTC)
        return Timestamp
            .newBuilder()
            .setSeconds(instant.epochSecond)
            .setNanos(instant.nano)
            .build()
    }

    private fun getAccountInfoFrom(pixKeyInfo: PixKeyInfo): GetPixKeyDetailResponse.AccountInfo {
        return GetPixKeyDetailResponse.AccountInfo
            .newBuilder()
            .setInstitution("")
            .setAgencyName(pixKeyInfo.account.agency)
            .setAccountNumber(pixKeyInfo.account.accountNumber)
            .setAccountType(bcbAccountTypeOf(pixKeyInfo.accountType))
            .build()
    }

    private fun bcbAccountTypeOf(accountType: String): BankAccountType {
        return when (accountType) {
            "CACC" -> BankAccountType.CHECKING
            else -> BankAccountType.SAVING
        }
    }

    private fun getProtoOwnerInfoFrom(pixKeyInfo: PixKeyInfo): GetPixKeyDetailResponse.OwnerInfo {
        return GetPixKeyDetailResponse.OwnerInfo
            .newBuilder()
            .setName(pixKeyInfo.account.ownerName)
            .setCpf(pixKeyInfo.account.cpf)
            .build()
    }

}
