// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.grpc.project.stubs;

/**
 * <pre>
 * Enumeration pour le type de compte
 * </pre>
 *
 * Protobuf enum {@code TypeCompte}
 */
public enum TypeCompte
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COURANT = 0;</code>
   */
  COURANT(0),
  /**
   * <code>EPARGNE = 1;</code>
   */
  EPARGNE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COURANT = 0;</code>
   */
  public static final int COURANT_VALUE = 0;
  /**
   * <code>EPARGNE = 1;</code>
   */
  public static final int EPARGNE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TypeCompte valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TypeCompte forNumber(int value) {
    switch (value) {
      case 0: return COURANT;
      case 1: return EPARGNE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TypeCompte>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TypeCompte> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TypeCompte>() {
          public TypeCompte findValueByNumber(int number) {
            return TypeCompte.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return CompteServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final TypeCompte[] VALUES = values();

  public static TypeCompte valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TypeCompte(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:TypeCompte)
}

