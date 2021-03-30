package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/edu/storekey/StoreKeyEndpoint;", "Lbr/com/zup/edu/KeyManagerGrpcServiceGrpc$KeyManagerGrpcServiceImplBase;", "service", "Lbr/com/zup/edu/storekey/StoreKeyDomainService;", "(Lbr/com/zup/edu/storekey/StoreKeyDomainService;)V", "storeKey", "", "request", "Lbr/com/zup/edu/StoreKeyRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/StoreKeyResponse;", "key-manager-grpc"})
@javax.inject.Singleton()
public final class StoreKeyEndpoint extends br.com.zup.edu.KeyManagerGrpcServiceGrpc.KeyManagerGrpcServiceImplBase {
    private final br.com.zup.edu.storekey.StoreKeyDomainService service = null;
    
    @java.lang.Override()
    public void storeKey(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.StoreKeyRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.edu.StoreKeyResponse> responseObserver) {
    }
    
    public StoreKeyEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.StoreKeyDomainService service) {
        super();
    }
}