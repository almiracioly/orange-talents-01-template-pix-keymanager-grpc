package br.com.zup.edu.storekey

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "pix_keys")
class PixKey(
    val value: String,
    val ownerId: UUID,
    val keyType: AllowedKeyType,
    val accountType: AllowedAccountType,
    @Embedded
    val associatedAccount: Account,
) {
    @Id
    @GeneratedValue
    val id: UUID? = null

}
