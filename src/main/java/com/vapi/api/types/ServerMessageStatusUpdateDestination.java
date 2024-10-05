/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class ServerMessageStatusUpdateDestination {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ServerMessageStatusUpdateDestination(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ServerMessageStatusUpdateDestination number(TransferDestinationNumber value) {
        return new ServerMessageStatusUpdateDestination(new NumberValue(value));
    }

    public static ServerMessageStatusUpdateDestination sip(TransferDestinationSip value) {
        return new ServerMessageStatusUpdateDestination(new SipValue(value));
    }

    public boolean isNumber() {
        return value instanceof NumberValue;
    }

    public boolean isSip() {
        return value instanceof SipValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<TransferDestinationNumber> getNumber() {
        if (isNumber()) {
            return Optional.of(((NumberValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransferDestinationSip> getSip() {
        if (isSip()) {
            return Optional.of(((SipValue) value).value);
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
        T visitNumber(TransferDestinationNumber number);

        T visitSip(TransferDestinationSip sip);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(NumberValue.class), @JsonSubTypes.Type(SipValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("number")
    private static final class NumberValue implements Value {
        @JsonUnwrapped
        private TransferDestinationNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private NumberValue() {}

        private NumberValue(TransferDestinationNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitNumber(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof NumberValue && equalTo((NumberValue) other);
        }

        private boolean equalTo(NumberValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageStatusUpdateDestination{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("sip")
    private static final class SipValue implements Value {
        @JsonUnwrapped
        private TransferDestinationSip value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SipValue() {}

        private SipValue(TransferDestinationSip value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSip(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SipValue && equalTo((SipValue) other);
        }

        private boolean equalTo(SipValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageStatusUpdateDestination{" + "value: " + value + "}";
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
            return "ServerMessageStatusUpdateDestination{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
