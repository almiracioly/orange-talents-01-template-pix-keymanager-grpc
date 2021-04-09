package br.com.zup.edu.shared.exception

import br.com.zup.edu.shared.filter.ExceptionHandler
import io.grpc.Status
import java.lang.Exception
import javax.inject.Singleton

@Singleton
class PixKeyNotFoundExceptionHandler : ExceptionHandler<PixKeyNotFoundException> {
    override fun handle(e: PixKeyNotFoundException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.NOT_FOUND
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is PixKeyNotFoundException
    }
}