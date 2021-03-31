package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/edu/storekey/PixKeyRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/zup/edu/storekey/PixKey;", "Ljava/util/UUID;", "existsByOwnerId", "", "ownerId", "existsByValue", "uniqueValue", "", "findAllByOwnerId", "", "findByValue", "Ljava/util/Optional;", "keyValue", "key-manager-grpc"})
@io.micronaut.data.annotation.Repository()
public abstract interface PixKeyRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.zup.edu.storekey.PixKey, java.util.UUID> {
    
    public abstract boolean existsByValue(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueValue);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<br.com.zup.edu.storekey.PixKey> findByValue(@org.jetbrains.annotations.NotNull()
    java.lang.String keyValue);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.com.zup.edu.storekey.PixKey> findAllByOwnerId(@org.jetbrains.annotations.NotNull()
    java.util.UUID ownerId);
    
    public abstract boolean existsByOwnerId(@org.jetbrains.annotations.NotNull()
    java.util.UUID ownerId);
}