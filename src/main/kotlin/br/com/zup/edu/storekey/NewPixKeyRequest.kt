package br.com.zup.edu.storekey

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

@Introspected
data class NewPixKeyRequest(
    @field:NotBlank val ownerId: String,
    @field:NotBlank val value: String,
    @field:Min(0) @Max(3) val keyType: Int,
    @field:Min(0) @Max(1) val accountType: Int
)