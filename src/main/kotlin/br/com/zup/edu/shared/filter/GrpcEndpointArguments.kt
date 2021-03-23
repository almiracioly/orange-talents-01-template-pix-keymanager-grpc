package br.com.zup.edu.shared.filter

import io.grpc.BindableService
import io.grpc.stub.StreamObserver
import io.micronaut.aop.MethodInvocationContext

class GrpcEndpointArguments(val context: MethodInvocationContext<BindableService, Any?>) {
    fun response(): StreamObserver<Any>? {
        val arguments = context.arguments

        for (a in arguments) {
            if (a.type is StreamObserver<*>) {
                return a as StreamObserver<Any>
            }
        }

        return null
    }

}
