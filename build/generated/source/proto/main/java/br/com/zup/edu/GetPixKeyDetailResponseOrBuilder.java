// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zup.edu;

public interface GetPixKeyDetailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.zup.edu.GetPixKeyDetailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pixId = 1;</code>
   * @return The pixId.
   */
  java.lang.String getPixId();
  /**
   * <code>string pixId = 1;</code>
   * @return The bytes for pixId.
   */
  com.google.protobuf.ByteString
      getPixIdBytes();

  /**
   * <code>.br.com.zup.edu.KeyType keyType = 2;</code>
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   * <code>.br.com.zup.edu.KeyType keyType = 2;</code>
   * @return The keyType.
   */
  br.com.zup.edu.KeyType getKeyType();

  /**
   * <code>string keyValue = 3;</code>
   * @return The keyValue.
   */
  java.lang.String getKeyValue();
  /**
   * <code>string keyValue = 3;</code>
   * @return The bytes for keyValue.
   */
  com.google.protobuf.ByteString
      getKeyValueBytes();

  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.OwnerInfo owner = 4;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.OwnerInfo owner = 4;</code>
   * @return The owner.
   */
  br.com.zup.edu.GetPixKeyDetailResponse.OwnerInfo getOwner();
  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.OwnerInfo owner = 4;</code>
   */
  br.com.zup.edu.GetPixKeyDetailResponse.OwnerInfoOrBuilder getOwnerOrBuilder();

  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.AccountInfo account = 5;</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.AccountInfo account = 5;</code>
   * @return The account.
   */
  br.com.zup.edu.GetPixKeyDetailResponse.AccountInfo getAccount();
  /**
   * <code>.br.com.zup.edu.GetPixKeyDetailResponse.AccountInfo account = 5;</code>
   */
  br.com.zup.edu.GetPixKeyDetailResponse.AccountInfoOrBuilder getAccountOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();
}
