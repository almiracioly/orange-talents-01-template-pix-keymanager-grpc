package br.com.zup.edu

import br.com.zup.edu.storekey.PixKeyRepository
import br.com.zup.edu.storekey.StoreKeyService
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.validation.validator.Validator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class UniqueUUIDValueGeneratorTest(private val pixKeyRepository: PixKeyRepository) {

    @Inject
    lateinit var validator: Validator

    @Test
    fun `garante a criacao de UUID não existente no banco de dados`(){
        val mocked = StoreKeyService(pixKeyRepository, validator)

        val uniqueValue = mocked.buildUniqueUUIDValue();
        val alreadyExistsInDb = pixKeyRepository.existsByValue(uniqueValue)

        assertEquals(false, alreadyExistsInDb)
    }
}