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

public final class EdgeCondition {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private EdgeCondition(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static EdgeCondition semantic(SemanticEdgeCondition value) {
        return new EdgeCondition(new SemanticValue(value));
    }

    public static EdgeCondition programmatic(ProgrammaticEdgeCondition value) {
        return new EdgeCondition(new ProgrammaticValue(value));
    }

    public boolean isSemantic() {
        return value instanceof SemanticValue;
    }

    public boolean isProgrammatic() {
        return value instanceof ProgrammaticValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<SemanticEdgeCondition> getSemantic() {
        if (isSemantic()) {
            return Optional.of(((SemanticValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ProgrammaticEdgeCondition> getProgrammatic() {
        if (isProgrammatic()) {
            return Optional.of(((ProgrammaticValue) value).value);
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
        T visitSemantic(SemanticEdgeCondition semantic);

        T visitProgrammatic(ProgrammaticEdgeCondition programmatic);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(SemanticValue.class), @JsonSubTypes.Type(ProgrammaticValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("semantic")
    private static final class SemanticValue implements Value {
        @JsonUnwrapped
        private SemanticEdgeCondition value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SemanticValue() {}

        private SemanticValue(SemanticEdgeCondition value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSemantic(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SemanticValue && equalTo((SemanticValue) other);
        }

        private boolean equalTo(SemanticValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "EdgeCondition{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("programmatic")
    private static final class ProgrammaticValue implements Value {
        @JsonUnwrapped
        private ProgrammaticEdgeCondition value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ProgrammaticValue() {}

        private ProgrammaticValue(ProgrammaticEdgeCondition value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitProgrammatic(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ProgrammaticValue && equalTo((ProgrammaticValue) other);
        }

        private boolean equalTo(ProgrammaticValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "EdgeCondition{" + "value: " + value + "}";
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
            return "EdgeCondition{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
