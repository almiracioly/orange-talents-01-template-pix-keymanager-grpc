package br.com.zup.edu.removekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/edu/removekey/RemoveKeyService;", "Lbr/com/zup/edu/KeyManagerRemovePixKeyGrpc$KeyManagerRemovePixKeyImplBase;", "beanValidator", "Lio/micronaut/validation/validator/Validator;", "pixKeyRepository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "(Lio/micronaut/validation/validator/Validator;Lbr/com/zup/edu/storekey/PixKeyRepository;)V", "isRequestValid", "", "removeKeyRequestDataScope", "Lbr/com/zup/edu/removekey/RemoveKeyRequestDataScope;", "removeKey", "", "request", "Lbr/com/zup/edu/RemoveKeyRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/RemoveKeyResponse;", "key-manager-grpc"})
@javax.inject.Singleton()
public final class RemoveKeyService extends br.com.zup.edu.KeyManagerRemovePixKeyGrpc.KeyManagerRemovePixKeyImplBase {
    private final io.micronaut.validation.validator.Validator beanValidator = null;
    private final br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository = null;
    
    @java.lang.Override()
    public void removeKey(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.RemoveKeyRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveKeyResponse> responseObserver) {
    }
    
    private final boolean isRequestValid(br.com.zup.edu.removekey.RemoveKeyRequestDataScope removeKeyRequestDataScope) {
        return false;
    }
    
    public RemoveKeyService(@org.jetbrains.annotations.NotNull()
    io.micronaut.validation.validator.Validator beanValidator, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository) {
        super();
    }
}