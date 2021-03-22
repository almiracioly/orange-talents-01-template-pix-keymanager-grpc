package br.com.zup.edu.storekey

import javax.persistence.Embeddable

@Embeddable
class Account(
    val ownerName: String,
    val cpf: String,
    val agency: String,
    val accountNumber: String
)
