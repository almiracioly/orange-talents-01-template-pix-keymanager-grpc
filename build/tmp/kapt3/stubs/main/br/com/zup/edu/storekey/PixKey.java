package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006$"}, d2 = {"Lbr/com/zup/edu/storekey/PixKey;", "", "value", "", "ownerId", "Ljava/util/UUID;", "keyType", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "accountType", "Lbr/com/zup/edu/storekey/AllowedAccountType;", "associatedAccount", "Lbr/com/zup/edu/storekey/Account;", "(Ljava/lang/String;Ljava/util/UUID;Lbr/com/zup/edu/storekey/AllowedKeyType;Lbr/com/zup/edu/storekey/AllowedAccountType;Lbr/com/zup/edu/storekey/Account;)V", "getAccountType", "()Lbr/com/zup/edu/storekey/AllowedAccountType;", "getAssociatedAccount", "()Lbr/com/zup/edu/storekey/Account;", "createdAd", "Ljava/time/LocalDateTime;", "getCreatedAd", "()Ljava/time/LocalDateTime;", "id", "getId", "()Ljava/util/UUID;", "getKeyType", "()Lbr/com/zup/edu/storekey/AllowedKeyType;", "getOwnerId", "<set-?>", "getValue", "()Ljava/lang/String;", "belongsTo", "", "ownerIdAsUuid", "update", "", "newKeyValue", "key-manager-grpc"})
@javax.persistence.Table(name = "pix_keys")
@javax.persistence.Entity()
public final class PixKey {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String value;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime createdAd = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(columnDefinition = "BINARY(16)")
    @org.hibernate.annotations.GenericGenerator(name = "uuid2", strategy = "uuid2")
    @javax.persistence.GeneratedValue(generator = "uuid2")
    @javax.persistence.Id()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(columnDefinition = "BINARY(16)")
    @org.hibernate.annotations.GenericGenerator(name = "uuid2", strategy = "uuid2")
    @javax.persistence.GeneratedValue(generator = "uuid2")
    private final java.util.UUID ownerId = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.storekey.AllowedKeyType keyType = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.storekey.AllowedAccountType accountType = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Embedded()
    private final br.com.zup.edu.storekey.Account associatedAccount = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCreatedAd() {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.lang.String newKeyValue) {
    }
    
    public final boolean belongsTo(@org.jetbrains.annotations.NotNull()
    java.util.UUID ownerIdAsUuid) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getOwnerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.AllowedKeyType getKeyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.AllowedAccountType getAccountType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.storekey.Account getAssociatedAccount() {
        return null;
    }
    
    public PixKey(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.util.UUID ownerId, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.AllowedKeyType keyType, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.AllowedAccountType accountType, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.Account associatedAccount) {
        super();
    }
}