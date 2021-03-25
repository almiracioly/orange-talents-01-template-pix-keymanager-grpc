package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/storekey/StoreKeyDomainService;", "", "erpItauClient", "Lbr/com/zup/edu/shared/externalservice/erpitau/ErpItauClient;", "pixKeyRepository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "(Lbr/com/zup/edu/shared/externalservice/erpitau/ErpItauClient;Lbr/com/zup/edu/storekey/PixKeyRepository;Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;)V", "store", "Lbr/com/zup/edu/storekey/PixKey;", "newPixKeyRequest", "Lbr/com/zup/edu/storekey/NewPixKeyRequest;", "key-manager-grpc"})
@javax.inject.Singleton()
public class StoreKeyDomainService {
    private final br.com.zup.edu.shared.externalservice.erpitau.ErpItauClient erpItauClient = null;
    private final br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository = null;
    private final br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public br.com.zup.edu.storekey.PixKey store(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.NewPixKeyRequest newPixKeyRequest) {
        return null;
    }
    
    public StoreKeyDomainService(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.externalservice.erpitau.ErpItauClient erpItauClient, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient) {
        super();
    }
}