package br.com.zup.edu.shared.externalservice.bcb

data class CreatePixKeyResponse(
    val keyType: String,
    val key: String,
    val bankAccount: BcbBankAccountCreatePixKeyResponse,
    val owner: BcbOwnerCreatePixKeyResponse
) {
    data class BcbBankAccountCreatePixKeyResponse(
        val participant: String,
        val branch: String,
        val accountNumber: String,
        val accountType: String
    )

    data class BcbOwnerCreatePixKeyResponse(
        val type: String,
        val name: String,
        val taxIdNumber: String
    )

}