// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LJJJCOKHKHF.proto

package emu.grasscutter.net.proto;

public final class LJJJCOKHKHFOuterClass {
    private LJJJCOKHKHFOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface LJJJCOKHKHFOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:LJJJCOKHKHF)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 team_id = 11;</code>
         *
         * @return The teamId.
         */
        int getTeamId();

        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @return A list containing the oDANFMOPFJE.
         */
        java.util.List<java.lang.Integer> getODANFMOPFJEList();
        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @return The count of oDANFMOPFJE.
         */
        int getODANFMOPFJECount();
        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The oDANFMOPFJE at the given index.
         */
        int getODANFMOPFJE(int index);
    }
    /** Protobuf type {@code LJJJCOKHKHF} */
    public static final class LJJJCOKHKHF extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:LJJJCOKHKHF)
            LJJJCOKHKHFOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LJJJCOKHKHF.newBuilder() to construct.
        private LJJJCOKHKHF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private LJJJCOKHKHF() {
            oDANFMOPFJE_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new LJJJCOKHKHF();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LJJJCOKHKHF(
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
                        case 80:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    oDANFMOPFJE_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                oDANFMOPFJE_.addInt(input.readUInt32());
                                break;
                            }
                        case 82:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    oDANFMOPFJE_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    oDANFMOPFJE_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 88:
                            {
                                teamId_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    oDANFMOPFJE_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.internal_static_LJJJCOKHKHF_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass
                    .internal_static_LJJJCOKHKHF_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.class,
                            emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.Builder.class);
        }

        public static final int TEAM_ID_FIELD_NUMBER = 11;
        private int teamId_;
        /**
         * <code>uint32 team_id = 11;</code>
         *
         * @return The teamId.
         */
        @java.lang.Override
        public int getTeamId() {
            return teamId_;
        }

        public static final int ODANFMOPFJE_FIELD_NUMBER = 10;
        private com.google.protobuf.Internal.IntList oDANFMOPFJE_;
        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @return A list containing the oDANFMOPFJE.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getODANFMOPFJEList() {
            return oDANFMOPFJE_;
        }
        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @return The count of oDANFMOPFJE.
         */
        public int getODANFMOPFJECount() {
            return oDANFMOPFJE_.size();
        }
        /**
         * <code>repeated uint32 ODANFMOPFJE = 10;</code>
         *
         * @param index The index of the element to return.
         * @return The oDANFMOPFJE at the given index.
         */
        public int getODANFMOPFJE(int index) {
            return oDANFMOPFJE_.getInt(index);
        }

        private int oDANFMOPFJEMemoizedSerializedSize = -1;

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            if (getODANFMOPFJEList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(oDANFMOPFJEMemoizedSerializedSize);
            }
            for (int i = 0; i < oDANFMOPFJE_.size(); i++) {
                output.writeUInt32NoTag(oDANFMOPFJE_.getInt(i));
            }
            if (teamId_ != 0) {
                output.writeUInt32(11, teamId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < oDANFMOPFJE_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(oDANFMOPFJE_.getInt(i));
                }
                size += dataSize;
                if (!getODANFMOPFJEList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                oDANFMOPFJEMemoizedSerializedSize = dataSize;
            }
            if (teamId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, teamId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF other =
                    (emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF) obj;

            if (getTeamId() != other.getTeamId()) return false;
            if (!getODANFMOPFJEList().equals(other.getODANFMOPFJEList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
            hash = (53 * hash) + getTeamId();
            if (getODANFMOPFJECount() > 0) {
                hash = (37 * hash) + ODANFMOPFJE_FIELD_NUMBER;
                hash = (53 * hash) + getODANFMOPFJEList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /** Protobuf type {@code LJJJCOKHKHF} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:LJJJCOKHKHF)
                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHFOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass
                        .internal_static_LJJJCOKHKHF_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass
                        .internal_static_LJJJCOKHKHF_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.class,
                                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                teamId_ = 0;

                oDANFMOPFJE_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass
                        .internal_static_LJJJCOKHKHF_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF build() {
                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF buildPartial() {
                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF result =
                        new emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF(this);
                int from_bitField0_ = bitField0_;
                result.teamId_ = teamId_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    oDANFMOPFJE_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.oDANFMOPFJE_ = oDANFMOPFJE_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF) {
                    return mergeFrom((emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF other) {
                if (other
                        == emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF.getDefaultInstance())
                    return this;
                if (other.getTeamId() != 0) {
                    setTeamId(other.getTeamId());
                }
                if (!other.oDANFMOPFJE_.isEmpty()) {
                    if (oDANFMOPFJE_.isEmpty()) {
                        oDANFMOPFJE_ = other.oDANFMOPFJE_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureODANFMOPFJEIsMutable();
                        oDANFMOPFJE_.addAll(other.oDANFMOPFJE_);
                    }
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int teamId_;
            /**
             * <code>uint32 team_id = 11;</code>
             *
             * @return The teamId.
             */
            @java.lang.Override
            public int getTeamId() {
                return teamId_;
            }
            /**
             * <code>uint32 team_id = 11;</code>
             *
             * @param value The teamId to set.
             * @return This builder for chaining.
             */
            public Builder setTeamId(int value) {

                teamId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 team_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTeamId() {

                teamId_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.Internal.IntList oDANFMOPFJE_ = emptyIntList();

            private void ensureODANFMOPFJEIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    oDANFMOPFJE_ = mutableCopy(oDANFMOPFJE_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @return A list containing the oDANFMOPFJE.
             */
            public java.util.List<java.lang.Integer> getODANFMOPFJEList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(oDANFMOPFJE_)
                        : oDANFMOPFJE_;
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @return The count of oDANFMOPFJE.
             */
            public int getODANFMOPFJECount() {
                return oDANFMOPFJE_.size();
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @param index The index of the element to return.
             * @return The oDANFMOPFJE at the given index.
             */
            public int getODANFMOPFJE(int index) {
                return oDANFMOPFJE_.getInt(index);
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @param index The index to set the value at.
             * @param value The oDANFMOPFJE to set.
             * @return This builder for chaining.
             */
            public Builder setODANFMOPFJE(int index, int value) {
                ensureODANFMOPFJEIsMutable();
                oDANFMOPFJE_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @param value The oDANFMOPFJE to add.
             * @return This builder for chaining.
             */
            public Builder addODANFMOPFJE(int value) {
                ensureODANFMOPFJEIsMutable();
                oDANFMOPFJE_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @param values The oDANFMOPFJE to add.
             * @return This builder for chaining.
             */
            public Builder addAllODANFMOPFJE(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureODANFMOPFJEIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, oDANFMOPFJE_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ODANFMOPFJE = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearODANFMOPFJE() {
                oDANFMOPFJE_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:LJJJCOKHKHF)
        }

        // @@protoc_insertion_point(class_scope:LJJJCOKHKHF)
        private static final emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF();
        }

        public static emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LJJJCOKHKHF> PARSER =
                new com.google.protobuf.AbstractParser<LJJJCOKHKHF>() {
                    @java.lang.Override
                    public LJJJCOKHKHF parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new LJJJCOKHKHF(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<LJJJCOKHKHF> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<LJJJCOKHKHF> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.LJJJCOKHKHFOuterClass.LJJJCOKHKHF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_LJJJCOKHKHF_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_LJJJCOKHKHF_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021LJJJCOKHKHF.proto\"3\n\013LJJJCOKHKHF\022\017\n\007te"
                    + "am_id\030\013 \001(\r\022\023\n\013ODANFMOPFJE\030\n \003(\rB\033\n\031emu."
                    + "grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_LJJJCOKHKHF_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_LJJJCOKHKHF_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_LJJJCOKHKHF_descriptor,
                        new java.lang.String[] {
                            "TeamId", "ODANFMOPFJE",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}