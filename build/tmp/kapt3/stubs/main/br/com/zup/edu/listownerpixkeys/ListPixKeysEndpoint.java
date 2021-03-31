package br.com.zup.edu.listownerpixkeys;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/edu/listownerpixkeys/ListPixKeysEndpoint;", "Lbr/com/zup/edu/KeyManagerListPixKeysGrpc$KeyManagerListPixKeysImplBase;", "pixKeyRepository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "(Lbr/com/zup/edu/storekey/PixKeyRepository;)V", "getAllPixKeys", "", "request", "Lbr/com/zup/edu/GetAllPixKeysRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/edu/GetAllPixKeysResponse;", "resumedPixKeyInfoOf", "Lbr/com/zup/edu/ResumedPixKeyInfo;", "pixKey", "Lbr/com/zup/edu/storekey/PixKey;", "key-manager-grpc"})
@javax.inject.Singleton()
public final class ListPixKeysEndpoint extends br.com.zup.edu.KeyManagerListPixKeysGrpc.KeyManagerListPixKeysImplBase {
    private final br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository = null;
    
    @java.lang.Override()
    public void getAllPixKeys(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.GetAllPixKeysRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.edu.GetAllPixKeysResponse> responseObserver) {
    }
    
    private final br.com.zup.edu.ResumedPixKeyInfo resumedPixKeyInfoOf(br.com.zup.edu.storekey.PixKey pixKey) {
        return null;
    }
    
    public ListPixKeysEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository) {
        super();
    }
}