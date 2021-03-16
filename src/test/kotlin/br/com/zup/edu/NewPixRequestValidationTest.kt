package br.com.zup.edu

import br.com.zup.edu.storekey.NewPixKeyRequest
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.validation.validator.Validator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class NewPixRequestValidationTest {
    @Inject
    lateinit var validator: Validator

    @Test
    fun `criacao invalida de request deve ser barrada`(){
        val request = NewPixKeyRequest("", "some-pix-key-value", 0, 0)
        val constraintViolations = validator.validate(request)

        assertEquals(1, constraintViolations.size)
    }
}