package br.com.zup.edu.shared.externalservice.bcb

data class CreatePixKeyResponse(
    val keyType: String,
    val key: String,
    val bankAccount: BcbBankAccountResponse,
    val owner: BcbOwnerResponse
)