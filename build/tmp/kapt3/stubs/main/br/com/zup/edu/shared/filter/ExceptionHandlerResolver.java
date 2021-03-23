package br.com.zup.edu.shared.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u00a2\u0006\u0002\u0010\bB\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0003\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00042\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/edu/shared/filter/ExceptionHandlerResolver;", "", "handlers", "", "Lbr/com/zup/edu/shared/filter/ExceptionHandler;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "defaultHandler", "(Ljava/util/List;Lbr/com/zup/edu/shared/filter/ExceptionHandler;)V", "(Ljava/util/List;)V", "resolve", "e", "key-manager-grpc"})
@javax.inject.Singleton()
public final class ExceptionHandlerResolver {
    private br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception> defaultHandler;
    private final java.util.List<br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception>> handlers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception> resolve(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    public ExceptionHandlerResolver(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception>> handlers) {
        super();
    }
    
    public ExceptionHandlerResolver(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception>> handlers, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.filter.ExceptionHandler<java.lang.Exception> defaultHandler) {
        super();
    }
}