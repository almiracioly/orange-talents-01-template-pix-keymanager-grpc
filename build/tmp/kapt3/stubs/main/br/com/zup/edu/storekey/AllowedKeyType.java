package br.com.zup.edu.storekey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/edu/storekey/AllowedKeyType;", "", "(Ljava/lang/String;I)V", "isValid", "", "value", "", "CPF", "PHONE", "EMAIL", "RANDOM", "key-manager-grpc"})
public enum AllowedKeyType {
    /*public static final*/ CPF /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/storekey/AllowedKeyType$CPF;", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "isValid", "", "value", "", "key-manager-grpc"}) CPF(){
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    CPF() {
        super();
    }
} */,
    /*public static final*/ PHONE /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/storekey/AllowedKeyType$PHONE;", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "isValid", "", "value", "", "key-manager-grpc"}) PHONE(){
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    PHONE() {
        super();
    }
} */,
    /*public static final*/ EMAIL /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/storekey/AllowedKeyType$EMAIL;", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "isValid", "", "value", "", "key-manager-grpc"}) EMAIL(){
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    EMAIL() {
        super();
    }
} */,
    /*public static final*/ RANDOM /* = new @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/storekey/AllowedKeyType$RANDOM;", "Lbr/com/zup/edu/storekey/AllowedKeyType;", "isValid", "", "value", "", "key-manager-grpc"}) RANDOM(){
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    RANDOM() {
        super();
    }
} */;
    
    public abstract boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    AllowedKeyType() {
    }
}