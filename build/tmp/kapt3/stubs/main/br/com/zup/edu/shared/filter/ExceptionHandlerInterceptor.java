package br.com.zup.edu.shared.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\n\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fH\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/shared/filter/ExceptionHandlerInterceptor;", "Lio/micronaut/aop/MethodInterceptor;", "Lio/grpc/BindableService;", "", "resolver", "Lbr/com/zup/edu/shared/filter/ExceptionHandlerResolver;", "(Lbr/com/zup/edu/shared/filter/ExceptionHandlerResolver;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "intercept", "context", "Lio/micronaut/aop/MethodInvocationContext;", "key-manager-grpc"})
@io.micronaut.aop.InterceptorBean(value = {br.com.zup.edu.shared.customannotation.errorhandler.ErrorHandler.class})
@javax.inject.Singleton()
public final class ExceptionHandlerInterceptor implements io.micronaut.aop.MethodInterceptor<io.grpc.BindableService, java.lang.Object> {
    private final org.slf4j.Logger logger = null;
    private final br.com.zup.edu.shared.filter.ExceptionHandlerResolver resolver = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object intercept(@org.jetbrains.annotations.NotNull()
    io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context) {
        return null;
    }
    
    public ExceptionHandlerInterceptor(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.shared.filter.ExceptionHandlerResolver resolver) {
        super();
    }
}