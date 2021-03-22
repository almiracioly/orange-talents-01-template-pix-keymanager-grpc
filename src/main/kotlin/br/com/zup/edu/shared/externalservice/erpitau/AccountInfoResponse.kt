package br.com.zup.edu.shared.externalservice.erpitau

import br.com.zup.edu.storekey.Account
import com.fasterxml.jackson.annotation.JsonProperty

data class AccountInfoResponse(
    @JsonProperty("tipo") val type: AccountTypeResponse,
    @JsonProperty("instituicao") val institution: InstitutionResponse,
    @JsonProperty("agencia") val agency: String,
    @JsonProperty("numero") val accountNumber: String,
    @JsonProperty("titular") val owner: OwnerResponse
) {
    fun toModel(): Account {
        return Account(ownerName = owner.name, cpf = owner.cpf, agency = agency, accountNumber = accountNumber)
    }

}

data class OwnerResponse(
    val id: String,
    @JsonProperty("nome") val name: String,
    val cpf: String
) {

}

data class InstitutionResponse(
    @JsonProperty("nome") val name: String,
    val ispb: String
) {

}

enum class AccountTypeResponse {
    CONTA_POUPANCA, CONTA_CORRENTE
}
