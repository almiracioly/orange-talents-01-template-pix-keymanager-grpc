package br.com.zup.edu.showkeydetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u0082\u0001\u0003\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria;", "", "()V", "filter", "Lbr/com/zup/edu/showkeydetail/PixKeyInfo;", "repository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "ByKey", "ByPixId", "Invalid", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$ByPixId;", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$ByKey;", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$Invalid;", "key-manager-grpc"})
@io.micronaut.core.annotation.Introspected()
public abstract class PixKeyFilterCriteria {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.edu.showkeydetail.PixKeyInfo filter(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient);
    
    private PixKeyFilterCriteria() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$ByPixId;", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria;", "ownerId", "", "pixId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOwnerId", "()Ljava/lang/String;", "getPixId", "component1", "component2", "copy", "equals", "", "other", "", "filter", "Lbr/com/zup/edu/showkeydetail/PixKeyInfo;", "repository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "hashCode", "", "ownerIdAsUuid", "Ljava/util/UUID;", "pixIdAsUuid", "toString", "key-manager-grpc"})
    @io.micronaut.core.annotation.Introspected()
    public static final class ByPixId extends br.com.zup.edu.showkeydetail.PixKeyFilterCriteria {
        @org.jetbrains.annotations.NotNull()
        @javax.validation.constraints.NotBlank()
        private final java.lang.String ownerId = null;
        @org.jetbrains.annotations.NotNull()
        @javax.validation.constraints.NotBlank()
        private final java.lang.String pixId = null;
        
        private final java.util.UUID pixIdAsUuid() {
            return null;
        }
        
        private final java.util.UUID ownerIdAsUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public br.com.zup.edu.showkeydetail.PixKeyInfo filter(@org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.PixKeyRepository repository, @org.jetbrains.annotations.NotNull()
        br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOwnerId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPixId() {
            return null;
        }
        
        public ByPixId(@org.jetbrains.annotations.NotNull()
        java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
        java.lang.String pixId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.edu.showkeydetail.PixKeyFilterCriteria.ByPixId copy(@org.jetbrains.annotations.NotNull()
        java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
        java.lang.String pixId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$ByKey;", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria;", "keyValue", "", "(Ljava/lang/String;)V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getKeyValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "filter", "Lbr/com/zup/edu/showkeydetail/PixKeyInfo;", "repository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "hashCode", "", "toString", "key-manager-grpc"})
    @io.micronaut.core.annotation.Introspected()
    public static final class ByKey extends br.com.zup.edu.showkeydetail.PixKeyFilterCriteria {
        private final org.slf4j.Logger LOGGER = null;
        @org.jetbrains.annotations.NotNull()
        @javax.validation.constraints.NotBlank()
        private final java.lang.String keyValue = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public br.com.zup.edu.showkeydetail.PixKeyInfo filter(@org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.PixKeyRepository repository, @org.jetbrains.annotations.NotNull()
        br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKeyValue() {
            return null;
        }
        
        public ByKey(@org.jetbrains.annotations.NotNull()
        @javax.validation.constraints.Size(max = 77)
        java.lang.String keyValue) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.edu.showkeydetail.PixKeyFilterCriteria.ByKey copy(@org.jetbrains.annotations.NotNull()
        @javax.validation.constraints.Size(max = 77)
        java.lang.String keyValue) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria$Invalid;", "Lbr/com/zup/edu/showkeydetail/PixKeyFilterCriteria;", "()V", "filter", "Lbr/com/zup/edu/showkeydetail/PixKeyInfo;", "repository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "bcbClient", "Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "key-manager-grpc"})
    @io.micronaut.core.annotation.Introspected()
    public static final class Invalid extends br.com.zup.edu.showkeydetail.PixKeyFilterCriteria {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public br.com.zup.edu.showkeydetail.PixKeyInfo filter(@org.jetbrains.annotations.NotNull()
        br.com.zup.edu.storekey.PixKeyRepository repository, @org.jetbrains.annotations.NotNull()
        br.com.zup.edu.shared.externalservice.bcb.BcbClient bcbClient) {
            return null;
        }
        
        public Invalid() {
            super();
        }
    }
}