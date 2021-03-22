package br.com.zup.edu.shared.externalservice.erpitau;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/edu/shared/externalservice/erpitau/ErpItauClient;", "", "getCustomerByIdAndAccountType", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/edu/shared/externalservice/erpitau/AccountInfoResponse;", "ownerId", "", "accountType", "key-manager-grpc"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:9091/api/v1")
public abstract interface ErpItauClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/clientes/{ownerId}/contas{?tipo}")
    public abstract io.micronaut.http.HttpResponse<br.com.zup.edu.shared.externalservice.erpitau.AccountInfoResponse> getCustomerByIdAndAccountType(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(value = "tipo")
    java.lang.String accountType);
}