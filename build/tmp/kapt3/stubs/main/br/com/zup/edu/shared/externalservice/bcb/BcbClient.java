package br.com.zup.edu.shared.externalservice.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/bcb/BcbClient;", "", "findByKey", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/edu/shared/externalservice/bcb/PixKeyDetailsResponse;", "keyValue", "", "remove", "Lbr/com/zup/edu/shared/externalservice/bcb/DeletePixKeyResponse;", "key", "request", "Lbr/com/zup/edu/shared/externalservice/bcb/DeletePixKeyRequest;", "store", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyResponse;", "Lbr/com/zup/edu/shared/externalservice/bcb/CreatePixKeyRequest;", "key-manager-grpc"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:8082/api/v1/pix/keys")
public abstract interface BcbClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Consumes(value = {"application/xml"})
    @io.micronaut.http.annotation.Produces(value = {"application/xml"})
    @io.micronaut.http.annotation.Post()
    public abstract io.micronaut.http.HttpResponse<br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyResponse> store(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zup.edu.shared.externalservice.bcb.CreatePixKeyRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Consumes(value = {"application/xml"})
    @io.micronaut.http.annotation.Produces(value = {"application/xml"})
    @io.micronaut.http.annotation.Delete(value = "/{key}")
    public abstract io.micronaut.http.HttpResponse<br.com.zup.edu.shared.externalservice.bcb.DeletePixKeyResponse> remove(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zup.edu.shared.externalservice.bcb.DeletePixKeyRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Consumes(value = {"application/xml"})
    @io.micronaut.http.annotation.Produces(value = {"application/xml"})
    @io.micronaut.http.annotation.Get(value = "/{key}")
    public abstract io.micronaut.http.HttpResponse<br.com.zup.edu.shared.externalservice.bcb.PixKeyDetailsResponse> findByKey(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable(value = "key")
    java.lang.String keyValue);
}