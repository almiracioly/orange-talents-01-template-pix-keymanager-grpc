package br.com.zup.edu.storekey

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "pix_keys")
class PixKey(
    value: String,
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    val ownerId: UUID,
    val keyType: AllowedKeyType,
    val accountType: AllowedAccountType,
    @Embedded
    val associatedAccount: Account,
) {
    var value = value
        private set

    val createdAd: LocalDateTime = LocalDateTime.now()

    fun update(newKeyValue: String) {
        value = newKeyValue
    }

    fun belongsTo(ownerIdAsUuid: UUID): Boolean {
        return this.ownerId == ownerIdAsUuid
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    val id: UUID? = null

}
