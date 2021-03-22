package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lbr/com/zup/edu/storekey/NewPixKeyRequest;", "", "ownerId", "Ljava/util/UUID;", "value", "", "keyType", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "accountType", "Lbr/com/zup/edu/storekey/AllowedAccountType;", "(Ljava/util/UUID;Ljava/lang/String;Lbr/com/zup/edu/storekey/AllowedKeyType;Lbr/com/zup/edu/storekey/AllowedAccountType;)V", "getAccountType", "()Lbr/com/zup/edu/storekey/AllowedAccountType;", "getKeyType", "()Lbr/com/zup/edu/storekey/AllowedKeyType;", "getOwnerId", "()Ljava/util/UUID;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getKeyValue", "hashCode", "", "toModel", "Lbr/com/zup/edu/storekey/PixKey;", "associatedAccount", "Lbr/com/zup/edu/storekey/Account;", "toString", "key-manager-grpc"})
@io.micronaut.core.annotation.Introspected()
public final class NewPixKeyRequest {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    private final java.util.UUID ownerId = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 77)
    @javax.validation.constraints.NotBlank()
    private final java.lang.String value = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.edu.storekey.AllowedKeyType keyType = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.edu.storekey.AllowedAccountType accountType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.PixKey toModel(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.Account associatedAccount) {
        return null;
    }
    
    private final java.lang.String getKeyValue(java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID getOwnerId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.edu.storekey.AllowedKeyType getKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.edu.storekey.AllowedAccountType getAccountType() {
        return null;
    }
    
    public NewPixKeyRequest(@org.jetbrains.annotations.Nullable()
    java.util.UUID ownerId, @org.jetbrains.annotations.Nullable()
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    br.com.zup.edu.storekey.AllowedKeyType keyType, @org.jetbrains.annotations.Nullable()
    br.com.zup.edu.storekey.AllowedAccountType accountType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.edu.storekey.AllowedKeyType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.edu.storekey.AllowedAccountType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.NewPixKeyRequest copy(@org.jetbrains.annotations.Nullable()
    java.util.UUID ownerId, @org.jetbrains.annotations.Nullable()
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    br.com.zup.edu.storekey.AllowedKeyType keyType, @org.jetbrains.annotations.Nullable()
    br.com.zup.edu.storekey.AllowedAccountType accountType) {
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