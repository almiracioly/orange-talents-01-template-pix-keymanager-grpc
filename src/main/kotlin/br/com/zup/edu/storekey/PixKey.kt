package br.com.zup.edu.storekey

import javax.persistence.*

@Entity
@Table(name = "pix_keys")
class PixKey(val value: String, val ownerId: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
