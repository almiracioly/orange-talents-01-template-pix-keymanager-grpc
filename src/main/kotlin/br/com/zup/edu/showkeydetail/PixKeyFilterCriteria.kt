package br.com.zup.edu.showkeydetail

import br.com.zup.edu.shared.exception.PixKeyNotFoundException
import br.com.zup.edu.shared.externalservice.bcb.BcbClient
import br.com.zup.edu.storekey.PixKeyRepository
import io.micronaut.core.annotation.Introspected
import io.micronaut.http.HttpStatus
import org.slf4j.LoggerFactory
import java.lang.IllegalArgumentException
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
sealed class PixKeyFilterCriteria {

    abstract fun filter(repository: PixKeyRepository, bcbClient: BcbClient): PixKeyInfo

    @Introspected
    data class ByPixId(
        @field:NotBlank val ownerId: String,
        @field:NotBlank val pixId: String
    ) : PixKeyFilterCriteria() {

        private fun pixIdAsUuid(): UUID = UUID.fromString(pixId)
        private fun ownerIdAsUuid(): UUID = UUID.fromString(ownerId)

        override fun filter(repository: PixKeyRepository, bcbClient: BcbClient): PixKeyInfo {
            return repository
                .findById(pixIdAsUuid())
                .filter { it.belongsTo(ownerIdAsUuid()) }
                .map(PixKeyInfo::of)
                .orElseThrow { PixKeyNotFoundException() }
        }
    }


    @Introspected
    data class ByKey(@field:NotBlank @Size(max = 77) val keyValue: String) : PixKeyFilterCriteria() {

        private val LOGGER = LoggerFactory.getLogger(this::class.java)

        override fun filter(repository: PixKeyRepository, bcbClient: BcbClient): PixKeyInfo {
            return repository
                .findByValue(keyValue)
                .map(PixKeyInfo::of)
                .orElseGet {
                    LOGGER.info("Consultando chave Pix $keyValue no BCB...")

                    val response = bcbClient.findByKey(keyValue)
                    when (response.status) {
                        HttpStatus.OK -> response.body()?.toModel()
                        else -> throw PixKeyNotFoundException()
                    }
                }
        }
    }

    @Introspected
    class Invalid() : PixKeyFilterCriteria() {
        override fun filter(repository: PixKeyRepository, bcbClient: BcbClient): PixKeyInfo {
            throw IllegalArgumentException("Chave Pix inválida ou não informada")
        }
    }


}
