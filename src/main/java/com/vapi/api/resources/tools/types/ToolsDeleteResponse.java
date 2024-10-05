/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.tools.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.DtmfTool;
import com.vapi.api.types.EndCallTool;
import com.vapi.api.types.FunctionTool;
import com.vapi.api.types.GhlTool;
import com.vapi.api.types.MakeTool;
import com.vapi.api.types.OutputTool;
import com.vapi.api.types.TransferCallTool;
import java.util.Objects;
import java.util.Optional;

public final class ToolsDeleteResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ToolsDeleteResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ToolsDeleteResponse dtmf(DtmfTool value) {
        return new ToolsDeleteResponse(new DtmfValue(value));
    }

    public static ToolsDeleteResponse endCall(EndCallTool value) {
        return new ToolsDeleteResponse(new EndCallValue(value));
    }

    public static ToolsDeleteResponse function(FunctionTool value) {
        return new ToolsDeleteResponse(new FunctionValue(value));
    }

    public static ToolsDeleteResponse ghl(GhlTool value) {
        return new ToolsDeleteResponse(new GhlValue(value));
    }

    public static ToolsDeleteResponse make(MakeTool value) {
        return new ToolsDeleteResponse(new MakeValue(value));
    }

    public static ToolsDeleteResponse transferCall(TransferCallTool value) {
        return new ToolsDeleteResponse(new TransferCallValue(value));
    }

    public static ToolsDeleteResponse output(OutputTool value) {
        return new ToolsDeleteResponse(new OutputValue(value));
    }

    public boolean isDtmf() {
        return value instanceof DtmfValue;
    }

    public boolean isEndCall() {
        return value instanceof EndCallValue;
    }

    public boolean isFunction() {
        return value instanceof FunctionValue;
    }

    public boolean isGhl() {
        return value instanceof GhlValue;
    }

    public boolean isMake() {
        return value instanceof MakeValue;
    }

    public boolean isTransferCall() {
        return value instanceof TransferCallValue;
    }

    public boolean isOutput() {
        return value instanceof OutputValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<DtmfTool> getDtmf() {
        if (isDtmf()) {
            return Optional.of(((DtmfValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<EndCallTool> getEndCall() {
        if (isEndCall()) {
            return Optional.of(((EndCallValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<FunctionTool> getFunction() {
        if (isFunction()) {
            return Optional.of(((FunctionValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GhlTool> getGhl() {
        if (isGhl()) {
            return Optional.of(((GhlValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<MakeTool> getMake() {
        if (isMake()) {
            return Optional.of(((MakeValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransferCallTool> getTransferCall() {
        if (isTransferCall()) {
            return Optional.of(((TransferCallValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OutputTool> getOutput() {
        if (isOutput()) {
            return Optional.of(((OutputValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitDtmf(DtmfTool dtmf);

        T visitEndCall(EndCallTool endCall);

        T visitFunction(FunctionTool function);

        T visitGhl(GhlTool ghl);

        T visitMake(MakeTool make);

        T visitTransferCall(TransferCallTool transferCall);

        T visitOutput(OutputTool output);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(DtmfValue.class),
        @JsonSubTypes.Type(EndCallValue.class),
        @JsonSubTypes.Type(FunctionValue.class),
        @JsonSubTypes.Type(GhlValue.class),
        @JsonSubTypes.Type(MakeValue.class),
        @JsonSubTypes.Type(TransferCallValue.class),
        @JsonSubTypes.Type(OutputValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("dtmf")
    private static final class DtmfValue implements Value {
        @JsonUnwrapped
        private DtmfTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DtmfValue() {}

        private DtmfValue(DtmfTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDtmf(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DtmfValue && equalTo((DtmfValue) other);
        }

        private boolean equalTo(DtmfValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("endCall")
    private static final class EndCallValue implements Value {
        @JsonUnwrapped
        private EndCallTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private EndCallValue() {}

        private EndCallValue(EndCallTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitEndCall(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof EndCallValue && equalTo((EndCallValue) other);
        }

        private boolean equalTo(EndCallValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("function")
    private static final class FunctionValue implements Value {
        @JsonUnwrapped
        private FunctionTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private FunctionValue() {}

        private FunctionValue(FunctionTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitFunction(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof FunctionValue && equalTo((FunctionValue) other);
        }

        private boolean equalTo(FunctionValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("ghl")
    private static final class GhlValue implements Value {
        @JsonUnwrapped
        private GhlTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GhlValue() {}

        private GhlValue(GhlTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGhl(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GhlValue && equalTo((GhlValue) other);
        }

        private boolean equalTo(GhlValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("make")
    private static final class MakeValue implements Value {
        @JsonUnwrapped
        private MakeTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MakeValue() {}

        private MakeValue(MakeTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMake(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MakeValue && equalTo((MakeValue) other);
        }

        private boolean equalTo(MakeValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("transferCall")
    private static final class TransferCallValue implements Value {
        @JsonUnwrapped
        private TransferCallTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TransferCallValue() {}

        private TransferCallValue(TransferCallTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTransferCall(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TransferCallValue && equalTo((TransferCallValue) other);
        }

        private boolean equalTo(TransferCallValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("output")
    private static final class OutputValue implements Value {
        @JsonUnwrapped
        private OutputTool value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OutputValue() {}

        private OutputValue(OutputTool value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOutput(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OutputValue && equalTo((OutputValue) other);
        }

        private boolean equalTo(OutputValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsDeleteResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
