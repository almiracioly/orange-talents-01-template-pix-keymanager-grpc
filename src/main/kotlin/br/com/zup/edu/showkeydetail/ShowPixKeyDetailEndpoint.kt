package br.com.zup.edu.showkeydetail

import br.com.zup.edu.GetPixKeyDetailRequest
import br.com.zup.edu.GetPixKeyDetailResponse
import br.com.zup.edu.KeyManagerShowPixKeyDetailGrpc
import br.com.zup.edu.shared.customannotation.errorhandler.ErrorHandler
import br.com.zup.edu.shared.externalservice.bcb.BcbClient
import br.com.zup.edu.storekey.PixKeyRepository
import io.grpc.stub.StreamObserver
import io.micronaut.validation.validator.Validator
import javax.inject.Singleton

@ErrorHandler
@Singleton
 class ShowPixKeyDetailEndpoint(
    private val validator: Validator,
    private val repository: PixKeyRepository,
    private val bcbClient: BcbClient
) : KeyManagerShowPixKeyDetailGrpc.KeyManagerShowPixKeyDetailImplBase() {

     override fun showDetail(
        request: GetPixKeyDetailRequest?,
        responseObserver: StreamObserver<GetPixKeyDetailResponse>?
    ) {

        val filter = request!!.toModel(validator)
        val pixKeyInfo = filter.filter(repository, bcbClient)

        responseObserver!!.onNext(PixKeyDetailEndpointResponse().of(pixKeyInfo))
        responseObserver.onCompleted()

    }
}

