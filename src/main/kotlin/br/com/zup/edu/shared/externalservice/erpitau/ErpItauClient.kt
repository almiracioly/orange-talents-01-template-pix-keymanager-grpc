package br.com.zup.edu.shared.externalservice.erpitau

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client
import java.util.*

@Client("http://localhost:9091/api/v1")
interface ErpItauClient {

    @Get("/clientes/{ownerId}/contas{?tipo}")
    fun getCustomerByIdAndAccountType(
        @PathVariable ownerId: String,
        @QueryValue(value = "tipo") accountType: String
    ): HttpResponse<AccountInfoResponse>

}
