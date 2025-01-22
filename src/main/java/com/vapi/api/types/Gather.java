/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Gather.Builder.class)
public final class Gather {
    private final Optional<JsonSchema> schema;

    private final String instruction;

    private final String name;

    private final Map<String, Object> additionalProperties;

    private Gather(
            Optional<JsonSchema> schema, String instruction, String name, Map<String, Object> additionalProperties) {
        this.schema = schema;
        this.instruction = instruction;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public String getType() {
        return "gather";
    }

    @JsonProperty("schema")
    public Optional<JsonSchema> getSchema() {
        return schema;
    }

    @JsonProperty("instruction")
    public String getInstruction() {
        return instruction;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Gather && equalTo((Gather) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Gather other) {
        return schema.equals(other.schema) && instruction.equals(other.instruction) && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.schema, this.instruction, this.name);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static InstructionStage builder() {
        return new Builder();
    }

    public interface InstructionStage {
        NameStage instruction(@NotNull String instruction);

        Builder from(Gather other);
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);
    }

    public interface _FinalStage {
        Gather build();

        _FinalStage schema(Optional<JsonSchema> schema);

        _FinalStage schema(JsonSchema schema);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements InstructionStage, NameStage, _FinalStage {
        private String instruction;

        private String name;

        private Optional<JsonSchema> schema = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Gather other) {
            schema(other.getSchema());
            instruction(other.getInstruction());
            name(other.getName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("instruction")
        public NameStage instruction(@NotNull String instruction) {
            this.instruction = Objects.requireNonNull(instruction, "instruction must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage schema(JsonSchema schema) {
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "schema", nulls = Nulls.SKIP)
        public _FinalStage schema(Optional<JsonSchema> schema) {
            this.schema = schema;
            return this;
        }

        @java.lang.Override
        public Gather build() {
            return new Gather(schema, instruction, name, additionalProperties);
        }
    }
}
