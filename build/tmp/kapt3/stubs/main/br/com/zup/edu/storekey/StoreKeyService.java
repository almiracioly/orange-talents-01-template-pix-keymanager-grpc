package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000fH\u0002J8\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u001b\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/edu/storekey/StoreKeyService;", "Lbr/com/zup/edu/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceImplBase;", "pixKeyRepository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "beanValidator", "Lio/micronaut/validation/validator/Validator;", "(Lbr/com/zup/edu/storekey/PixKeyRepository;Lio/micronaut/validation/validator/Validator;)V", "buildUniqueUUIDValue", "", "isRequestValid", "", "request", "Lbr/com/zup/edu/storekey/NewPixKeyRequest;", "isValueValidToItsType", "receivedRequest", "Lbr/com/zup/edu/StoreKeyRequest;", "pixDomainObjectByRequest", "Lbr/com/zup/edu/storekey/PixKey;", "sendErrorMessageAndFinish", "", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/StoreKeyResponse;", "errorStatus", "Lio/grpc/Status;", "withDescription", "augmentDescription", "storeKey", "key-manager-grpc"})
@javax.inject.Singleton()
public final class StoreKeyService extends br.com.zup.edu.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase {
    private final br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository = null;
    private final io.micronaut.validation.validator.Validator beanValidator = null;
    
    @java.lang.Override()
    public void storeKey(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.StoreKeyRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.edu.StoreKeyResponse> responseObserver) {
    }
    
    private final boolean isRequestValid(br.com.zup.edu.storekey.NewPixKeyRequest request) {
        return false;
    }
    
    private final boolean isValueValidToItsType(br.com.zup.edu.StoreKeyRequest receivedRequest) {
        return false;
    }
    
    private final void sendErrorMessageAndFinish(io.grpc.stub.StreamObserver<br.com.zup.edu.StoreKeyResponse> responseObserver, io.grpc.Status errorStatus, java.lang.String withDescription, java.lang.String augmentDescription) {
    }
    
    private final br.com.zup.edu.storekey.PixKey pixDomainObjectByRequest(br.com.zup.edu.StoreKeyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String buildUniqueUUIDValue() {
        return null;
    }
    
    public StoreKeyService(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository, @org.jetbrains.annotations.NotNull()
    io.micronaut.validation.validator.Validator beanValidator) {
        super();
    }
}