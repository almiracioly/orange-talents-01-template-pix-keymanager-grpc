// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zup.edu;

public final class KeyManagerGrpc {
  private KeyManagerGrpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_edu_KeyManagerGrpcRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_edu_KeyManagerGrpcRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_edu_KeyManagerGrpcReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_edu_KeyManagerGrpcReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_edu_StoreKeyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_edu_StoreKeyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_edu_StoreKeyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_edu_StoreKeyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024keyManagerGrpc.proto\022\016br.com.zup.edu\"%" +
      "\n\025KeyManagerGrpcRequest\022\014\n\004name\030\001 \001(\t\"&\n" +
      "\023KeyManagerGrpcReply\022\017\n\007message\030\001 \001(\t\"\224\001" +
      "\n\017StoreKeyRequest\022\020\n\010owner_id\030\001 \001(\t\022)\n\010k" +
      "ey_type\030\002 \001(\0162\027.br.com.zup.edu.KeyType\022\r" +
      "\n\005value\030\003 \001(\t\0225\n\014account_type\030\004 \001(\0162\037.br" +
      ".com.zup.edu.BankAccountType\"\"\n\020StoreKey" +
      "Response\022\016\n\006pix_id\030\001 \001(\t*4\n\007KeyType\022\007\n\003C" +
      "PF\020\000\022\t\n\005PHONE\020\001\022\t\n\005EMAIL\020\002\022\n\n\006RANDOM\020\003*+" +
      "\n\017BankAccountType\022\n\n\006SAVING\020\000\022\014\n\010CHECKIN" +
      "G\020\0012\276\001\n\025KeyManagerGrpcService\022T\n\004send\022%." +
      "br.com.zup.edu.KeyManagerGrpcRequest\032#.b" +
      "r.com.zup.edu.KeyManagerGrpcReply\"\000\022O\n\010s" +
      "toreKey\022\037.br.com.zup.edu.StoreKeyRequest" +
      "\032 .br.com.zup.edu.StoreKeyResponse\"\000B(\n\016" +
      "br.com.zup.eduB\016KeyManagerGrpcP\001\242\002\003HLWb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_zup_edu_KeyManagerGrpcRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_zup_edu_KeyManagerGrpcRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_edu_KeyManagerGrpcRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_br_com_zup_edu_KeyManagerGrpcReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_zup_edu_KeyManagerGrpcReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_edu_KeyManagerGrpcReply_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_br_com_zup_edu_StoreKeyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_br_com_zup_edu_StoreKeyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_edu_StoreKeyRequest_descriptor,
        new java.lang.String[] { "OwnerId", "KeyType", "Value", "AccountType", });
    internal_static_br_com_zup_edu_StoreKeyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_br_com_zup_edu_StoreKeyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_edu_StoreKeyResponse_descriptor,
        new java.lang.String[] { "PixId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
