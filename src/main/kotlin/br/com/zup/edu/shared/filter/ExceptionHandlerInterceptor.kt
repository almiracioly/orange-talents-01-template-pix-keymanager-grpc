package br.com.zup.edu.shared.filter

import br.com.zup.edu.shared.customannotation.errorhandler.ErrorHandler
import io.grpc.BindableService
import io.grpc.stub.StreamObserver
import io.micronaut.aop.InterceptorBean
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
@InterceptorBean(ErrorHandler::class)
class ExceptionHandlerInterceptor(private val resolver: ExceptionHandlerResolver) :
    MethodInterceptor<BindableService, Any?> {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun intercept(context: MethodInvocationContext<BindableService, Any?>): Any? {
        try {
            return context.proceed()
        } catch (e: Exception) {
            logger.error("Handling ${e.javaClass.name} while processing ${context.targetMethod} call")

            val handler = resolver.resolve(e)
            val status = handler.handle(e)

            val responseObserver = context.parameterValues[1] as StreamObserver<*>
            responseObserver.onError(status.asRuntimeException())

            return null

        }
    }

}