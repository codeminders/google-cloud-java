// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

/**
 * <pre>
 * Represents the smallest syntactic building block of the text.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1.Token}
 */
public  final class Token extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1.Token)
    TokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Token.newBuilder() to construct.
  private Token(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Token() {
    lemma_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Token(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.language.v1.TextSpan.Builder subBuilder = null;
            if (text_ != null) {
              subBuilder = text_.toBuilder();
            }
            text_ = input.readMessage(com.google.cloud.language.v1.TextSpan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(text_);
              text_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.language.v1.PartOfSpeech.Builder subBuilder = null;
            if (partOfSpeech_ != null) {
              subBuilder = partOfSpeech_.toBuilder();
            }
            partOfSpeech_ = input.readMessage(com.google.cloud.language.v1.PartOfSpeech.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partOfSpeech_);
              partOfSpeech_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.cloud.language.v1.DependencyEdge.Builder subBuilder = null;
            if (dependencyEdge_ != null) {
              subBuilder = dependencyEdge_.toBuilder();
            }
            dependencyEdge_ = input.readMessage(com.google.cloud.language.v1.DependencyEdge.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dependencyEdge_);
              dependencyEdge_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            lemma_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Token_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Token_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1.Token.class, com.google.cloud.language.v1.Token.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1.TextSpan text_;
  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public boolean hasText() {
    return text_ != null;
  }
  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1.TextSpan getText() {
    return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
  }
  /**
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
    return getText();
  }

  public static final int PART_OF_SPEECH_FIELD_NUMBER = 2;
  private com.google.cloud.language.v1.PartOfSpeech partOfSpeech_;
  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  public boolean hasPartOfSpeech() {
    return partOfSpeech_ != null;
  }
  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  public com.google.cloud.language.v1.PartOfSpeech getPartOfSpeech() {
    return partOfSpeech_ == null ? com.google.cloud.language.v1.PartOfSpeech.getDefaultInstance() : partOfSpeech_;
  }
  /**
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  public com.google.cloud.language.v1.PartOfSpeechOrBuilder getPartOfSpeechOrBuilder() {
    return getPartOfSpeech();
  }

  public static final int DEPENDENCY_EDGE_FIELD_NUMBER = 3;
  private com.google.cloud.language.v1.DependencyEdge dependencyEdge_;
  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  public boolean hasDependencyEdge() {
    return dependencyEdge_ != null;
  }
  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  public com.google.cloud.language.v1.DependencyEdge getDependencyEdge() {
    return dependencyEdge_ == null ? com.google.cloud.language.v1.DependencyEdge.getDefaultInstance() : dependencyEdge_;
  }
  /**
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  public com.google.cloud.language.v1.DependencyEdgeOrBuilder getDependencyEdgeOrBuilder() {
    return getDependencyEdge();
  }

  public static final int LEMMA_FIELD_NUMBER = 4;
  private volatile java.lang.Object lemma_;
  /**
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   */
  public java.lang.String getLemma() {
    java.lang.Object ref = lemma_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lemma_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLemmaBytes() {
    java.lang.Object ref = lemma_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lemma_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (text_ != null) {
      output.writeMessage(1, getText());
    }
    if (partOfSpeech_ != null) {
      output.writeMessage(2, getPartOfSpeech());
    }
    if (dependencyEdge_ != null) {
      output.writeMessage(3, getDependencyEdge());
    }
    if (!getLemmaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lemma_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (text_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getText());
    }
    if (partOfSpeech_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPartOfSpeech());
    }
    if (dependencyEdge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDependencyEdge());
    }
    if (!getLemmaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lemma_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.language.v1.Token)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1.Token other = (com.google.cloud.language.v1.Token) obj;

    boolean result = true;
    result = result && (hasText() == other.hasText());
    if (hasText()) {
      result = result && getText()
          .equals(other.getText());
    }
    result = result && (hasPartOfSpeech() == other.hasPartOfSpeech());
    if (hasPartOfSpeech()) {
      result = result && getPartOfSpeech()
          .equals(other.getPartOfSpeech());
    }
    result = result && (hasDependencyEdge() == other.hasDependencyEdge());
    if (hasDependencyEdge()) {
      result = result && getDependencyEdge()
          .equals(other.getDependencyEdge());
    }
    result = result && getLemma()
        .equals(other.getLemma());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    if (hasPartOfSpeech()) {
      hash = (37 * hash) + PART_OF_SPEECH_FIELD_NUMBER;
      hash = (53 * hash) + getPartOfSpeech().hashCode();
    }
    if (hasDependencyEdge()) {
      hash = (37 * hash) + DEPENDENCY_EDGE_FIELD_NUMBER;
      hash = (53 * hash) + getDependencyEdge().hashCode();
    }
    hash = (37 * hash) + LEMMA_FIELD_NUMBER;
    hash = (53 * hash) + getLemma().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1.Token parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Token parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Token parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Token parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Token parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.language.v1.Token parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.language.v1.Token prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents the smallest syntactic building block of the text.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1.Token}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1.Token)
      com.google.cloud.language.v1.TokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Token_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Token_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1.Token.class, com.google.cloud.language.v1.Token.Builder.class);
    }

    // Construct using com.google.cloud.language.v1.Token.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (textBuilder_ == null) {
        text_ = null;
      } else {
        text_ = null;
        textBuilder_ = null;
      }
      if (partOfSpeechBuilder_ == null) {
        partOfSpeech_ = null;
      } else {
        partOfSpeech_ = null;
        partOfSpeechBuilder_ = null;
      }
      if (dependencyEdgeBuilder_ == null) {
        dependencyEdge_ = null;
      } else {
        dependencyEdge_ = null;
        dependencyEdgeBuilder_ = null;
      }
      lemma_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.language.v1.LanguageServiceProto.internal_static_google_cloud_language_v1_Token_descriptor;
    }

    public com.google.cloud.language.v1.Token getDefaultInstanceForType() {
      return com.google.cloud.language.v1.Token.getDefaultInstance();
    }

    public com.google.cloud.language.v1.Token build() {
      com.google.cloud.language.v1.Token result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.language.v1.Token buildPartial() {
      com.google.cloud.language.v1.Token result = new com.google.cloud.language.v1.Token(this);
      if (textBuilder_ == null) {
        result.text_ = text_;
      } else {
        result.text_ = textBuilder_.build();
      }
      if (partOfSpeechBuilder_ == null) {
        result.partOfSpeech_ = partOfSpeech_;
      } else {
        result.partOfSpeech_ = partOfSpeechBuilder_.build();
      }
      if (dependencyEdgeBuilder_ == null) {
        result.dependencyEdge_ = dependencyEdge_;
      } else {
        result.dependencyEdge_ = dependencyEdgeBuilder_.build();
      }
      result.lemma_ = lemma_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.language.v1.Token) {
        return mergeFrom((com.google.cloud.language.v1.Token)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.language.v1.Token other) {
      if (other == com.google.cloud.language.v1.Token.getDefaultInstance()) return this;
      if (other.hasText()) {
        mergeText(other.getText());
      }
      if (other.hasPartOfSpeech()) {
        mergePartOfSpeech(other.getPartOfSpeech());
      }
      if (other.hasDependencyEdge()) {
        mergeDependencyEdge(other.getDependencyEdge());
      }
      if (!other.getLemma().isEmpty()) {
        lemma_ = other.lemma_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.language.v1.Token parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.language.v1.Token) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1.TextSpan text_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder> textBuilder_;
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public boolean hasText() {
      return textBuilder_ != null || text_ != null;
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpan getText() {
      if (textBuilder_ == null) {
        return text_ == null ? com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      } else {
        return textBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        text_ = value;
        onChanged();
      } else {
        textBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder setText(
        com.google.cloud.language.v1.TextSpan.Builder builderForValue) {
      if (textBuilder_ == null) {
        text_ = builderForValue.build();
        onChanged();
      } else {
        textBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder mergeText(com.google.cloud.language.v1.TextSpan value) {
      if (textBuilder_ == null) {
        if (text_ != null) {
          text_ =
            com.google.cloud.language.v1.TextSpan.newBuilder(text_).mergeFrom(value).buildPartial();
        } else {
          text_ = value;
        }
        onChanged();
      } else {
        textBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public Builder clearText() {
      if (textBuilder_ == null) {
        text_ = null;
        onChanged();
      } else {
        text_ = null;
        textBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpan.Builder getTextBuilder() {
      
      onChanged();
      return getTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    public com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder() {
      if (textBuilder_ != null) {
        return textBuilder_.getMessageOrBuilder();
      } else {
        return text_ == null ?
            com.google.cloud.language.v1.TextSpan.getDefaultInstance() : text_;
      }
    }
    /**
     * <pre>
     * The token text.
     * </pre>
     *
     * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder> 
        getTextFieldBuilder() {
      if (textBuilder_ == null) {
        textBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.TextSpan, com.google.cloud.language.v1.TextSpan.Builder, com.google.cloud.language.v1.TextSpanOrBuilder>(
                getText(),
                getParentForChildren(),
                isClean());
        text_ = null;
      }
      return textBuilder_;
    }

    private com.google.cloud.language.v1.PartOfSpeech partOfSpeech_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.PartOfSpeech, com.google.cloud.language.v1.PartOfSpeech.Builder, com.google.cloud.language.v1.PartOfSpeechOrBuilder> partOfSpeechBuilder_;
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public boolean hasPartOfSpeech() {
      return partOfSpeechBuilder_ != null || partOfSpeech_ != null;
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public com.google.cloud.language.v1.PartOfSpeech getPartOfSpeech() {
      if (partOfSpeechBuilder_ == null) {
        return partOfSpeech_ == null ? com.google.cloud.language.v1.PartOfSpeech.getDefaultInstance() : partOfSpeech_;
      } else {
        return partOfSpeechBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public Builder setPartOfSpeech(com.google.cloud.language.v1.PartOfSpeech value) {
      if (partOfSpeechBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partOfSpeech_ = value;
        onChanged();
      } else {
        partOfSpeechBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public Builder setPartOfSpeech(
        com.google.cloud.language.v1.PartOfSpeech.Builder builderForValue) {
      if (partOfSpeechBuilder_ == null) {
        partOfSpeech_ = builderForValue.build();
        onChanged();
      } else {
        partOfSpeechBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public Builder mergePartOfSpeech(com.google.cloud.language.v1.PartOfSpeech value) {
      if (partOfSpeechBuilder_ == null) {
        if (partOfSpeech_ != null) {
          partOfSpeech_ =
            com.google.cloud.language.v1.PartOfSpeech.newBuilder(partOfSpeech_).mergeFrom(value).buildPartial();
        } else {
          partOfSpeech_ = value;
        }
        onChanged();
      } else {
        partOfSpeechBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public Builder clearPartOfSpeech() {
      if (partOfSpeechBuilder_ == null) {
        partOfSpeech_ = null;
        onChanged();
      } else {
        partOfSpeech_ = null;
        partOfSpeechBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public com.google.cloud.language.v1.PartOfSpeech.Builder getPartOfSpeechBuilder() {
      
      onChanged();
      return getPartOfSpeechFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    public com.google.cloud.language.v1.PartOfSpeechOrBuilder getPartOfSpeechOrBuilder() {
      if (partOfSpeechBuilder_ != null) {
        return partOfSpeechBuilder_.getMessageOrBuilder();
      } else {
        return partOfSpeech_ == null ?
            com.google.cloud.language.v1.PartOfSpeech.getDefaultInstance() : partOfSpeech_;
      }
    }
    /**
     * <pre>
     * Parts of speech tag for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.PartOfSpeech, com.google.cloud.language.v1.PartOfSpeech.Builder, com.google.cloud.language.v1.PartOfSpeechOrBuilder> 
        getPartOfSpeechFieldBuilder() {
      if (partOfSpeechBuilder_ == null) {
        partOfSpeechBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.PartOfSpeech, com.google.cloud.language.v1.PartOfSpeech.Builder, com.google.cloud.language.v1.PartOfSpeechOrBuilder>(
                getPartOfSpeech(),
                getParentForChildren(),
                isClean());
        partOfSpeech_ = null;
      }
      return partOfSpeechBuilder_;
    }

    private com.google.cloud.language.v1.DependencyEdge dependencyEdge_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.DependencyEdge, com.google.cloud.language.v1.DependencyEdge.Builder, com.google.cloud.language.v1.DependencyEdgeOrBuilder> dependencyEdgeBuilder_;
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public boolean hasDependencyEdge() {
      return dependencyEdgeBuilder_ != null || dependencyEdge_ != null;
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public com.google.cloud.language.v1.DependencyEdge getDependencyEdge() {
      if (dependencyEdgeBuilder_ == null) {
        return dependencyEdge_ == null ? com.google.cloud.language.v1.DependencyEdge.getDefaultInstance() : dependencyEdge_;
      } else {
        return dependencyEdgeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public Builder setDependencyEdge(com.google.cloud.language.v1.DependencyEdge value) {
      if (dependencyEdgeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dependencyEdge_ = value;
        onChanged();
      } else {
        dependencyEdgeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public Builder setDependencyEdge(
        com.google.cloud.language.v1.DependencyEdge.Builder builderForValue) {
      if (dependencyEdgeBuilder_ == null) {
        dependencyEdge_ = builderForValue.build();
        onChanged();
      } else {
        dependencyEdgeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public Builder mergeDependencyEdge(com.google.cloud.language.v1.DependencyEdge value) {
      if (dependencyEdgeBuilder_ == null) {
        if (dependencyEdge_ != null) {
          dependencyEdge_ =
            com.google.cloud.language.v1.DependencyEdge.newBuilder(dependencyEdge_).mergeFrom(value).buildPartial();
        } else {
          dependencyEdge_ = value;
        }
        onChanged();
      } else {
        dependencyEdgeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public Builder clearDependencyEdge() {
      if (dependencyEdgeBuilder_ == null) {
        dependencyEdge_ = null;
        onChanged();
      } else {
        dependencyEdge_ = null;
        dependencyEdgeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public com.google.cloud.language.v1.DependencyEdge.Builder getDependencyEdgeBuilder() {
      
      onChanged();
      return getDependencyEdgeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    public com.google.cloud.language.v1.DependencyEdgeOrBuilder getDependencyEdgeOrBuilder() {
      if (dependencyEdgeBuilder_ != null) {
        return dependencyEdgeBuilder_.getMessageOrBuilder();
      } else {
        return dependencyEdge_ == null ?
            com.google.cloud.language.v1.DependencyEdge.getDefaultInstance() : dependencyEdge_;
      }
    }
    /**
     * <pre>
     * Dependency tree parse for this token.
     * </pre>
     *
     * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.language.v1.DependencyEdge, com.google.cloud.language.v1.DependencyEdge.Builder, com.google.cloud.language.v1.DependencyEdgeOrBuilder> 
        getDependencyEdgeFieldBuilder() {
      if (dependencyEdgeBuilder_ == null) {
        dependencyEdgeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1.DependencyEdge, com.google.cloud.language.v1.DependencyEdge.Builder, com.google.cloud.language.v1.DependencyEdgeOrBuilder>(
                getDependencyEdge(),
                getParentForChildren(),
                isClean());
        dependencyEdge_ = null;
      }
      return dependencyEdgeBuilder_;
    }

    private java.lang.Object lemma_ = "";
    /**
     * <pre>
     * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
     * </pre>
     *
     * <code>string lemma = 4;</code>
     */
    public java.lang.String getLemma() {
      java.lang.Object ref = lemma_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lemma_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
     * </pre>
     *
     * <code>string lemma = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLemmaBytes() {
      java.lang.Object ref = lemma_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lemma_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
     * </pre>
     *
     * <code>string lemma = 4;</code>
     */
    public Builder setLemma(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lemma_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
     * </pre>
     *
     * <code>string lemma = 4;</code>
     */
    public Builder clearLemma() {
      
      lemma_ = getDefaultInstance().getLemma();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
     * </pre>
     *
     * <code>string lemma = 4;</code>
     */
    public Builder setLemmaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lemma_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1.Token)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1.Token)
  private static final com.google.cloud.language.v1.Token DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1.Token();
  }

  public static com.google.cloud.language.v1.Token getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Token>
      PARSER = new com.google.protobuf.AbstractParser<Token>() {
    public Token parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Token(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Token> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Token> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.language.v1.Token getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
