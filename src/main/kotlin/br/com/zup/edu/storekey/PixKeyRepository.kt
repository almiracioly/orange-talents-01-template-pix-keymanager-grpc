package br.com.zup.edu.storekey

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface PixKeyRepository : JpaRepository<PixKey, UUID> {
    fun existsByValue(uniqueValue: String): Boolean
    fun findByValue(keyValue: String): Optional<PixKey>
    fun findAllByOwnerId(ownerId: UUID): List<PixKey>
    fun existsByOwnerId(ownerId: UUID): Boolean
}
