package br.com.zup.edu.removekey

import com.sun.istack.NotNull
import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive

@Introspected
data class RemoveKeyRequestDataScope(
    @field:NotNull @field:Positive val pixKeyId: String?,
    @field:NotBlank val ownerId: UUID?
)
