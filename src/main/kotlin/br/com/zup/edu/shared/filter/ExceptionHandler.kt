package br.com.zup.edu.shared.filter

import io.grpc.*
import java.lang.Exception

interface ExceptionHandler<E : Exception> {

    fun handle(e: E): StatusWithDetails

    fun supports(e: Exception): Boolean

    data class StatusWithDetails(
        val status: Status,
        val metaData: Metadata = Metadata(),
    ) {

        constructor(se: StatusRuntimeException) : this(se.status, se.trailers!!)
        // constructor(sp: com.google.rpc.Status) : this(Status)

        fun asRuntimeException(): StatusRuntimeException {
            return status.asRuntimeException(metaData)
        }

    }

}
