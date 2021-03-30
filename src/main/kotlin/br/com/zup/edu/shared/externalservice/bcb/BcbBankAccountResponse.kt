package br.com.zup.edu.shared.externalservice.bcb

data class BcbBankAccountResponse(
    val participant: String,
    val branch: String,
    val accountNumber: String,
    val accountType: String
)