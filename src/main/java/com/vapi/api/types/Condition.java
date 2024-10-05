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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Condition.Builder.class)
public final class Condition {
    private final String value;

    private final ConditionOperator operator;

    private final String param;

    private final Map<String, Object> additionalProperties;

    private Condition(
            String value, ConditionOperator operator, String param, Map<String, Object> additionalProperties) {
        this.value = value;
        this.operator = operator;
        this.param = param;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the value you want to compare against the parameter.
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * @return This is the operator you want to use to compare the parameter and value.
     */
    @JsonProperty("operator")
    public ConditionOperator getOperator() {
        return operator;
    }

    /**
     * @return This is the name of the parameter that you want to check.
     */
    @JsonProperty("param")
    public String getParam() {
        return param;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Condition && equalTo((Condition) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Condition other) {
        return value.equals(other.value) && operator.equals(other.operator) && param.equals(other.param);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value, this.operator, this.param);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ValueStage builder() {
        return new Builder();
    }

    public interface ValueStage {
        OperatorStage value(@NotNull String value);

        Builder from(Condition other);
    }

    public interface OperatorStage {
        ParamStage operator(@NotNull ConditionOperator operator);
    }

    public interface ParamStage {
        _FinalStage param(@NotNull String param);
    }

    public interface _FinalStage {
        Condition build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ValueStage, OperatorStage, ParamStage, _FinalStage {
        private String value;

        private ConditionOperator operator;

        private String param;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Condition other) {
            value(other.getValue());
            operator(other.getOperator());
            param(other.getParam());
            return this;
        }

        /**
         * <p>This is the value you want to compare against the parameter.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("value")
        public OperatorStage value(@NotNull String value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        /**
         * <p>This is the operator you want to use to compare the parameter and value.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("operator")
        public ParamStage operator(@NotNull ConditionOperator operator) {
            this.operator = Objects.requireNonNull(operator, "operator must not be null");
            return this;
        }

        /**
         * <p>This is the name of the parameter that you want to check.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("param")
        public _FinalStage param(@NotNull String param) {
            this.param = Objects.requireNonNull(param, "param must not be null");
            return this;
        }

        @java.lang.Override
        public Condition build() {
            return new Condition(value, operator, param, additionalProperties);
        }
    }
}
