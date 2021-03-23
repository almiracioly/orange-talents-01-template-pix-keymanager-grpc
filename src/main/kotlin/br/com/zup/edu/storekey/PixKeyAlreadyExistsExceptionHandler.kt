package br.com.zup.edu.storekey

import br.com.zup.edu.shared.filter.ExceptionHandler
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class PixKeyAlreadyExistsExceptionHandler : ExceptionHandler<PixKeyAlreadyExistsException> {
    override fun handle(e: PixKeyAlreadyExistsException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.ALREADY_EXISTS
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is PixKeyAlreadyExistsException
    }

}