package br.com.zup.edu.shared.filter

import br.com.zup.edu.shared.customannotation.errorhandler.ErrorHandler
import br.com.zup.edu.storekey.AccountOwnerNotFoundException
import br.com.zup.edu.storekey.PixKeyAlreadyExistsException
import com.google.rpc.BadRequest
import com.google.rpc.Code
import io.grpc.BindableService
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.grpc.protobuf.StatusProto
import io.grpc.stub.StreamObserver
import io.micronaut.aop.InterceptorBean
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import org.slf4j.LoggerFactory
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException
import javax.inject.Singleton
import javax.validation.ConstraintViolationException

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

            /*
            val statusError = when (e) {
                is IllegalArgumentException -> Status.INVALID_ARGUMENT.withDescription(e.message).asRuntimeException()
                is IllegalStateException -> Status.FAILED_PRECONDITION.withDescription(e.message).asRuntimeException()
                is ConstraintViolationException -> handleConstraintValidationException(e)
                is PixKeyAlreadyExistsException -> Status.ALREADY_EXISTS.withDescription(e.message).asRuntimeException()
                is AccountOwnerNotFoundException -> Status.NOT_FOUND.withDescription(e.message).asRuntimeException()
                else -> Status.UNKNOWN.withDescription("Unexpected error happened").asRuntimeException()
            }
             */
            val handler = resolver.resolve(e)
            val statusError = handler.handle(e)

            val responseObserver = context.parameterValues[1] as StreamObserver<*>
            responseObserver.onError(statusError.asRuntimeException())

            return null

        }
    }

    private fun handleConstraintValidationException(e: ConstraintViolationException): StatusRuntimeException {
        val badRequest = BadRequest.newBuilder()
            .addAllFieldViolations(e.constraintViolations.map {
                BadRequest.FieldViolation.newBuilder()
                    .setField(it.propertyPath.last().name)
                    .setDescription(it.message)
                    .build()
            })
            .build()

        val statusProto = com.google.rpc.Status.newBuilder()
            .setCode(Code.INVALID_ARGUMENT_VALUE)
            .setMessage("request with invalid parameters")
            .addDetails(com.google.protobuf.Any.pack(badRequest))
            .build()

        return StatusProto.toStatusRuntimeException(statusProto)
    }

}