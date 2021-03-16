package br.com.zup.edu.storekey

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface PixKeyRepository : JpaRepository<PixKey, Long> {
    fun existsByOwnerId(ownerId: String): Boolean
    fun existsByValue(uniqueValue: String): Boolean

}
