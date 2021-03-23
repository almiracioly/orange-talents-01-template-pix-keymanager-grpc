package br.com.zup.edu.shared.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/edu/shared/filter/GrpcEndpointArguments;", "", "context", "Lio/micronaut/aop/MethodInvocationContext;", "Lio/grpc/BindableService;", "(Lio/micronaut/aop/MethodInvocationContext;)V", "getContext", "()Lio/micronaut/aop/MethodInvocationContext;", "response", "Lio/grpc/stub/StreamObserver;", "key-manager-grpc"})
public final class GrpcEndpointArguments {
    @org.jetbrains.annotations.NotNull()
    private final io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.grpc.stub.StreamObserver<java.lang.Object> response() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> getContext() {
        return null;
    }
    
    public GrpcEndpointArguments(@org.jetbrains.annotations.NotNull()
    io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context) {
        super();
    }
}