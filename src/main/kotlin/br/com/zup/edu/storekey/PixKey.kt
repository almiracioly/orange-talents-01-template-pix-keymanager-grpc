package br.com.zup.edu.storekey

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "pix_keys")
class PixKey(
    value: String,
    val ownerId: UUID,
    val keyType: AllowedKeyType,
    val accountType: AllowedAccountType,
    @Embedded
    val associatedAccount: Account,
) {
    var value = value
        private set

    fun update(newKeyValue: String) {
        value = newKeyValue
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    val id: UUID? = null

}
