package br.com.zup.edu.showkeydetail

import br.com.zup.edu.GetPixKeyDetailRequest
import br.com.zup.edu.GetPixKeyDetailRequest.FilterCase.*
import io.micronaut.validation.validator.Validator
import javax.validation.ConstraintViolationException

fun GetPixKeyDetailRequest.toModel(validator: Validator): PixKeyFilterCriteria {
    val filter = when(filterCase) {
        PIXID -> pixId.let {
            PixKeyFilterCriteria.ByPixId(ownerId = it.ownerId, pixId = it.pixId)
        }
        KEYVALUE -> PixKeyFilterCriteria.ByKey(keyValue)
        FILTER_NOT_SET -> PixKeyFilterCriteria.Invalid()
    }

    val violations = validator.validate(filter)
    if(violations.isNotEmpty())
        throw ConstraintViolationException(violations);

    return filter
}
