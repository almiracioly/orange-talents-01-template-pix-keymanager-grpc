package br.com.zup.edu.shared.externalservice.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest;", "", "pixKey", "Lbr/com/zup/edu/storekey/PixKey;", "(Lbr/com/zup/edu/storekey/PixKey;)V", "bankAccount", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbBankAccountCreatePixKeyRequest;", "getBankAccount", "()Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbBankAccountCreatePixKeyRequest;", "key", "", "getKey", "()Ljava/lang/String;", "keyType", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "getKeyType", "()Lbr/com/zup/edu/storekey/AllowedKeyType;", "owner", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountOwnerCreatePixKeyRequest;", "getOwner", "()Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountOwnerCreatePixKeyRequest;", "BcbAccountOwnerCreatePixKeyRequest", "BcbAccountType", "BcbBankAccountCreatePixKeyRequest", "key-manager-grpc"})
public final class CreatePixKeyRequest {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.storekey.AllowedKeyType keyType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbBankAccountCreatePixKeyRequest bankAccount = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountOwnerCreatePixKeyRequest owner = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.AllowedKeyType getKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbBankAccountCreatePixKeyRequest getBankAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountOwnerCreatePixKeyRequest getOwner() {
        return null;
    }
    
    public CreatePixKeyRequest(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKey pixKey) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountOwnerCreatePixKeyRequest;", "", "associatedAccount", "Lbr/com/zup/edu/storekey/Account;", "(Lbr/com/zup/edu/storekey/Account;)V", "name", "", "getName", "()Ljava/lang/String;", "taxIdNumber", "getTaxIdNumber", "type", "getType", "key-manager-grpc"})
    public static final class BcbAccountOwnerCreatePixKeyRequest {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = "NATURAL_PERSON";
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String taxIdNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTaxIdNumber() {
            return null;
        }
        
        public BcbAccountOwnerCreatePixKeyRequest(@org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.Account associatedAccount) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbBankAccountCreatePixKeyRequest;", "", "participant", "", "type", "Lbr/com/zup/edu/storekey/AllowedAccountType;", "associatedAccount", "Lbr/com/zup/edu/storekey/Account;", "(Ljava/lang/String;Lbr/com/zup/edu/storekey/AllowedAccountType;Lbr/com/zup/edu/storekey/Account;)V", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "accountType", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountType;", "getAccountType", "()Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountType;", "branch", "getBranch", "getParticipant", "key-manager-grpc"})
    public static final class BcbBankAccountCreatePixKeyRequest {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String branch = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String accountNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountType accountType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String participant = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBranch() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccountNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountType getAccountType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getParticipant() {
            return null;
        }
        
        public BcbBankAccountCreatePixKeyRequest(@org.jetbrains.annotations.NotNull()
        java.lang.String participant, @org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.AllowedAccountType type, @org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.Account associatedAccount) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountType;", "", "domainType", "Lbr/com/zup/edu/storekey/AllowedAccountType;", "(Ljava/lang/String;ILbr/com/zup/edu/storekey/AllowedAccountType;)V", "getDomainType", "()Lbr/com/zup/edu/storekey/AllowedAccountType;", "CACC", "SACC", "Companion", "key-manager-grpc"})
    public static enum BcbAccountType {
        /*public static final*/ CACC /* = new CACC(null) */,
        /*public static final*/ SACC /* = new SACC(null) */;
        @org.jetbrains.annotations.NotNull()
        private final br.com.zup.edu.storekey.AllowedAccountType domainType = null;
        private static final java.util.Map<br.com.zup.edu.storekey.AllowedAccountType, br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountType> mapping = null;
        public static final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountType.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.edu.storekey.AllowedAccountType getDomainType() {
            return null;
        }
        
        BcbAccountType(br.com.zup.edu.storekey.AllowedAccountType domainType) {
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountType$Companion;", "", "()V", "mapping", "", "Lbr/com/zup/edu/storekey/AllowedAccountType;", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest$BcbAccountType;", "by", "domainType", "key-manager-grpc"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest.BcbAccountType by(@org.jetbrains.annotations.NotNull()
            br.com.zup.edu.storekey.AllowedAccountType domainType) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}