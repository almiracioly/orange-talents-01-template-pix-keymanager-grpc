package br.com.zup.edu.shared.externalservice.bcb

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:8082/api/v1/pix/keys")
interface BcbClient {
    @Post
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    fun store(@Body request: CreatePixKeyRequest): HttpResponse<CreatePixKeyResponse>

    @Delete("/{key}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    fun remove(@PathVariable key: String, @Body request: DeletePixKeyRequest): HttpResponse<DeletePixKeyResponse>

    @Get("/{key}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    fun findByKey(@PathVariable("key") keyValue: String): HttpResponse<PixKeyDetailsResponse>
}