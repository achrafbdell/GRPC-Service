// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.grpc.project.stubs;

public interface FindByTypeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FindByTypeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<Compte>
      getComptesList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  Compte getComptes(int index);
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  int getComptesCount();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<? extends CompteOrBuilder>
      getComptesOrBuilderList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  CompteOrBuilder getComptesOrBuilder(
      int index);
}
