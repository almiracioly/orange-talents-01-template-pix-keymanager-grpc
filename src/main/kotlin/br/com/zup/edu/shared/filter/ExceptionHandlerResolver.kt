package br.com.zup.edu.shared.filter

import javax.inject.Singleton

@Singleton
class ExceptionHandlerResolver(private val handlers: List<ExceptionHandler<Exception>>) {

    private var defaultHandler: ExceptionHandler<Exception> = DefaultExceptionHandler()

    constructor(handlers: List<ExceptionHandler<Exception>>, defaultHandler: ExceptionHandler<Exception>) : this(
        handlers
    ) {
        this.defaultHandler = defaultHandler
    }

    fun resolve(e: Exception): ExceptionHandler<Exception> {
        val foundHandlers = handlers.filter { h -> h.supports(e) }
        if (foundHandlers.size > 1)
            throw IllegalStateException("Too many handlers supporting the same exception")

        return foundHandlers.firstOrNull() ?: defaultHandler
    }

}
