package br.com.zup.edu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/UniqueUUIDValueGeneratorTest;", "", "pixKeyRepository", "Lbr/com/zup/edu/storekey/PixKeyRepository;", "(Lbr/com/zup/edu/storekey/PixKeyRepository;)V", "validator", "Lio/micronaut/validation/validator/Validator;", "getValidator", "()Lio/micronaut/validation/validator/Validator;", "setValidator", "(Lio/micronaut/validation/validator/Validator;)V", "garante a criacao de UUID n\u00e3o existente no banco de dados", "", "key-manager-grpc"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class UniqueUUIDValueGeneratorTest {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public io.micronaut.validation.validator.Validator validator;
    private final br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.validation.validator.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    io.micronaut.validation.validator.Validator p0) {
    }
    
    public UniqueUUIDValueGeneratorTest(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.storekey.PixKeyRepository pixKeyRepository) {
        super();
    }
}