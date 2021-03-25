package br.com.zup.edu.shared.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\nJ\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H&\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/edu/shared/filter/ExceptionHandler;", "E", "Ljava/lang/Exception;", "", "handle", "Lbr/com/zup/edu/shared/filter/ExceptionHandler$StatusWithDetails;", "e", "(Ljava/lang/Exception;)Lbr/com/zup/edu/shared/filter/ExceptionHandler$StatusWithDetails;", "supports", "", "StatusWithDetails", "key-manager-grpc"})
public abstract interface ExceptionHandler<E extends java.lang.Exception> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.edu.shared.filter.ExceptionHandler.StatusWithDetails handle(@org.jetbrains.annotations.NotNull()
    E e);
    
    public abstract boolean supports(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\bH\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/edu/shared/filter/ExceptionHandler$StatusWithDetails;", "", "se", "Lio/grpc/StatusRuntimeException;", "(Lio/grpc/StatusRuntimeException;)V", "status", "Lio/grpc/Status;", "metaData", "Lio/grpc/Metadata;", "(Lio/grpc/Status;Lio/grpc/Metadata;)V", "getMetaData", "()Lio/grpc/Metadata;", "getStatus", "()Lio/grpc/Status;", "asRuntimeException", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "key-manager-grpc"})
    public static final class StatusWithDetails {
        @org.jetbrains.annotations.NotNull()
        private final io.grpc.Status status = null;
        @org.jetbrains.annotations.NotNull()
        private final io.grpc.Metadata metaData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.StatusRuntimeException asRuntimeException() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.Status getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.Metadata getMetaData() {
            return null;
        }
        
        public StatusWithDetails(@org.jetbrains.annotations.NotNull()
        io.grpc.Status status, @org.jetbrains.annotations.NotNull()
        io.grpc.Metadata metaData) {
            super();
        }
        
        public StatusWithDetails(@org.jetbrains.annotations.NotNull()
        io.grpc.StatusRuntimeException se) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.Status component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.Metadata component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.edu.shared.filter.ExceptionHandler.StatusWithDetails copy(@org.jetbrains.annotations.NotNull()
        io.grpc.Status status, @org.jetbrains.annotations.NotNull()
        io.grpc.Metadata metaData) {
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
}