// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckUgcUpdateRsp.proto

package emu.grasscutter.net.proto;

public final class CheckUgcUpdateRspOuterClass {
    private CheckUgcUpdateRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CheckUgcUpdateRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CheckUgcUpdateRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @return A list containing the updateUgcGuidList.
         */
        java.util.List<java.lang.Long> getUpdateUgcGuidListList();
        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @return The count of updateUgcGuidList.
         */
        int getUpdateUgcGuidListCount();
        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @param index The index of the element to return.
         * @return The updateUgcGuidList at the given index.
         */
        long getUpdateUgcGuidList(int index);

        /**
         * <code>int32 retcode = 10;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>.UgcType ugc_type = 12;</code>
         *
         * @return The enum numeric value on the wire for ugcType.
         */
        int getUgcTypeValue();
        /**
         * <code>.UgcType ugc_type = 12;</code>
         *
         * @return The ugcType.
         */
        emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 6345 (3.2)
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code CheckUgcUpdateRsp}
     */
    public static final class CheckUgcUpdateRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CheckUgcUpdateRsp)
            CheckUgcUpdateRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CheckUgcUpdateRsp.newBuilder() to construct.
        private CheckUgcUpdateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CheckUgcUpdateRsp() {
            updateUgcGuidList_ = emptyLongList();
            ugcType_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CheckUgcUpdateRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CheckUgcUpdateRsp(
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
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 96:
                            {
                                int rawValue = input.readEnum();

                                ugcType_ = rawValue;
                                break;
                            }
                        case 120:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    updateUgcGuidList_ = newLongList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                updateUgcGuidList_.addLong(input.readUInt64());
                                break;
                            }
                        case 122:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    updateUgcGuidList_ = newLongList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    updateUgcGuidList_.addLong(input.readUInt64());
                                }
                                input.popLimit(limit);
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
                    updateUgcGuidList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass
                    .internal_static_CheckUgcUpdateRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass
                    .internal_static_CheckUgcUpdateRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.class,
                            emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.Builder
                                    .class);
        }

        public static final int UPDATE_UGC_GUID_LIST_FIELD_NUMBER = 15;
        private com.google.protobuf.Internal.LongList updateUgcGuidList_;
        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @return A list containing the updateUgcGuidList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Long> getUpdateUgcGuidListList() {
            return updateUgcGuidList_;
        }
        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @return The count of updateUgcGuidList.
         */
        public int getUpdateUgcGuidListCount() {
            return updateUgcGuidList_.size();
        }
        /**
         * <code>repeated uint64 update_ugc_guid_list = 15;</code>
         *
         * @param index The index of the element to return.
         * @return The updateUgcGuidList at the given index.
         */
        public long getUpdateUgcGuidList(int index) {
            return updateUgcGuidList_.getLong(index);
        }

        private int updateUgcGuidListMemoizedSerializedSize = -1;

        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        /**
         * <code>int32 retcode = 10;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int UGC_TYPE_FIELD_NUMBER = 12;
        private int ugcType_;
        /**
         * <code>.UgcType ugc_type = 12;</code>
         *
         * @return The enum numeric value on the wire for ugcType.
         */
        @java.lang.Override
        public int getUgcTypeValue() {
            return ugcType_;
        }
        /**
         * <code>.UgcType ugc_type = 12;</code>
         *
         * @return The ugcType.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result =
                    emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
            return result == null
                    ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED
                    : result;
        }

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
            if (retcode_ != 0) {
                output.writeInt32(10, retcode_);
            }
            if (ugcType_
                    != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
                output.writeEnum(12, ugcType_);
            }
            if (getUpdateUgcGuidListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(updateUgcGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < updateUgcGuidList_.size(); i++) {
                output.writeUInt64NoTag(updateUgcGuidList_.getLong(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(10, retcode_);
            }
            if (ugcType_
                    != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(12, ugcType_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < updateUgcGuidList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(
                                    updateUgcGuidList_.getLong(i));
                }
                size += dataSize;
                if (!getUpdateUgcGuidListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                updateUgcGuidListMemoizedSerializedSize = dataSize;
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
            if (!(obj
                    instanceof emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp other =
                    (emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) obj;

            if (!getUpdateUgcGuidListList().equals(other.getUpdateUgcGuidListList())) return false;
            if (getRetcode() != other.getRetcode()) return false;
            if (ugcType_ != other.ugcType_) return false;
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
            if (getUpdateUgcGuidListCount() > 0) {
                hash = (37 * hash) + UPDATE_UGC_GUID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getUpdateUgcGuidListList().hashCode();
            }
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + ugcType_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parseFrom(
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
                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp prototype) {
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
        /**
         *
         *
         * <pre>
         * CmdId: 6345 (3.2)
         * EnetChannelId: 0
         * EnetIsReliable: true
         * </pre>
         *
         * Protobuf type {@code CheckUgcUpdateRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CheckUgcUpdateRsp)
                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass
                        .internal_static_CheckUgcUpdateRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass
                        .internal_static_CheckUgcUpdateRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.class,
                                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp.newBuilder()
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
                updateUgcGuidList_ = emptyLongList();
                bitField0_ = (bitField0_ & ~0x00000001);
                retcode_ = 0;

                ugcType_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass
                        .internal_static_CheckUgcUpdateRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp build() {
                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                    buildPartial() {
                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp result =
                        new emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    updateUgcGuidList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.updateUgcGuidList_ = updateUgcGuidList_;
                result.retcode_ = retcode_;
                result.ugcType_ = ugcType_;
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
                if (other
                        instanceof emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp other) {
                if (other
                        == emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                                .getDefaultInstance()) return this;
                if (!other.updateUgcGuidList_.isEmpty()) {
                    if (updateUgcGuidList_.isEmpty()) {
                        updateUgcGuidList_ = other.updateUgcGuidList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureUpdateUgcGuidListIsMutable();
                        updateUgcGuidList_.addAll(other.updateUgcGuidList_);
                    }
                    onChanged();
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.ugcType_ != 0) {
                    setUgcTypeValue(other.getUgcTypeValue());
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
                emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp)
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

            private com.google.protobuf.Internal.LongList updateUgcGuidList_ = emptyLongList();

            private void ensureUpdateUgcGuidListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    updateUgcGuidList_ = mutableCopy(updateUgcGuidList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @return A list containing the updateUgcGuidList.
             */
            public java.util.List<java.lang.Long> getUpdateUgcGuidListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(updateUgcGuidList_)
                        : updateUgcGuidList_;
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @return The count of updateUgcGuidList.
             */
            public int getUpdateUgcGuidListCount() {
                return updateUgcGuidList_.size();
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @param index The index of the element to return.
             * @return The updateUgcGuidList at the given index.
             */
            public long getUpdateUgcGuidList(int index) {
                return updateUgcGuidList_.getLong(index);
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @param index The index to set the value at.
             * @param value The updateUgcGuidList to set.
             * @return This builder for chaining.
             */
            public Builder setUpdateUgcGuidList(int index, long value) {
                ensureUpdateUgcGuidListIsMutable();
                updateUgcGuidList_.setLong(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @param value The updateUgcGuidList to add.
             * @return This builder for chaining.
             */
            public Builder addUpdateUgcGuidList(long value) {
                ensureUpdateUgcGuidListIsMutable();
                updateUgcGuidList_.addLong(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @param values The updateUgcGuidList to add.
             * @return This builder for chaining.
             */
            public Builder addAllUpdateUgcGuidList(java.lang.Iterable<? extends java.lang.Long> values) {
                ensureUpdateUgcGuidListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, updateUgcGuidList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint64 update_ugc_guid_list = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUpdateUgcGuidList() {
                updateUgcGuidList_ = emptyLongList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 10;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 10;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private int ugcType_ = 0;
            /**
             * <code>.UgcType ugc_type = 12;</code>
             *
             * @return The enum numeric value on the wire for ugcType.
             */
            @java.lang.Override
            public int getUgcTypeValue() {
                return ugcType_;
            }
            /**
             * <code>.UgcType ugc_type = 12;</code>
             *
             * @param value The enum numeric value on the wire for ugcType to set.
             * @return This builder for chaining.
             */
            public Builder setUgcTypeValue(int value) {

                ugcType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.UgcType ugc_type = 12;</code>
             *
             * @return The ugcType.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result =
                        emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
                return result == null
                        ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.UgcType ugc_type = 12;</code>
             *
             * @param value The ugcType to set.
             * @return This builder for chaining.
             */
            public Builder setUgcType(emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ugcType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.UgcType ugc_type = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUgcType() {

                ugcType_ = 0;
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

            // @@protoc_insertion_point(builder_scope:CheckUgcUpdateRsp)
        }

        // @@protoc_insertion_point(class_scope:CheckUgcUpdateRsp)
        private static final emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp();
        }

        public static emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CheckUgcUpdateRsp> PARSER =
                new com.google.protobuf.AbstractParser<CheckUgcUpdateRsp>() {
                    @java.lang.Override
                    public CheckUgcUpdateRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CheckUgcUpdateRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CheckUgcUpdateRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CheckUgcUpdateRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CheckUgcUpdateRspOuterClass.CheckUgcUpdateRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CheckUgcUpdateRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CheckUgcUpdateRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\027CheckUgcUpdateRsp.proto\032\rUgcType.proto"
                    + "\"^\n\021CheckUgcUpdateRsp\022\034\n\024update_ugc_guid"
                    + "_list\030\017 \003(\004\022\017\n\007retcode\030\n \001(\005\022\032\n\010ugc_type"
                    + "\030\014 \001(\0162\010.UgcTypeB\033\n\031emu.grasscutter.net."
                    + "protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor(),
                        });
        internal_static_CheckUgcUpdateRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CheckUgcUpdateRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CheckUgcUpdateRsp_descriptor,
                        new java.lang.String[] {
                            "UpdateUgcGuidList", "Retcode", "UgcType",
                        });
        emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
