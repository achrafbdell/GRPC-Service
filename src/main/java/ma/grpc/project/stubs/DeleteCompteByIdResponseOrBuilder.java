// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.grpc.project.stubs;

public interface DeleteCompteByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DeleteCompteByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indique si la suppression a été réussie
   * </pre>
   *
   * <code>bool success = 1;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <pre>
   * Message décrivant le résultat
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Message décrivant le résultat
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
