package br.com.zup.edu.showkeydetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/edu/showkeydetail/ShowPixKeyDetailEndpoint;", "Lbr/com/zup/edu/KeyManagerShowPixKeyDetailGrpc$KeyManagerShowPixKeyDetailImplBase;", "validator", "Lio/micronaut/validation/validator/Validator;", "repository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "(Lio/micronaut/validation/validator/Validator;Lbr/com/zup/edu/storekey/PixKeyRepository;Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;)V", "showDetail", "", "request", "Lbr/com/zup/edu/GetPixKeyDetailRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/GetPixKeyDetailResponse;", "key-manager-grpc"})
@javax.inject.Singleton()
public final class ShowPixKeyDetailEndpoint extends br.com.zup.edu.KeyManagerShowPixKeyDetailGrpc.KeyManagerShowPixKeyDetailImplBase {
    private final io.micronaut.validation.validator.Validator validator = null;
    private final br.com.zup.edu.storekey.PixKeyRepository repository = null;
    private final br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient = null;
    
    @java.lang.Override()
    public void showDetail(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.GetPixKeyDetailRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.edu.GetPixKeyDetailResponse> responseObserver) {
    }
    
    public ShowPixKeyDetailEndpoint(@org.jetbrains.annotations.NotNull()
    io.micronaut.validation.validator.Validator validator, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient) {
        super();
    }
}