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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = StepDestination.Builder.class)
public final class StepDestination {
    private final Optional<List<StepDestinationConditionsItem>> conditions;

    private final String stepName;

    private final Map<String, Object> additionalProperties;

    private StepDestination(
            Optional<List<StepDestinationConditionsItem>> conditions,
            String stepName,
            Map<String, Object> additionalProperties) {
        this.conditions = conditions;
        this.stepName = stepName;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public String getType() {
        return "step";
    }

    /**
     * @return This is an optional array of conditions that must be met for this destination to be triggered. If empty, this is the default destination that the step transfers to.
     */
    @JsonProperty("conditions")
    public Optional<List<StepDestinationConditionsItem>> getConditions() {
        return conditions;
    }

    @JsonProperty("stepName")
    public String getStepName() {
        return stepName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof StepDestination && equalTo((StepDestination) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(StepDestination other) {
        return conditions.equals(other.conditions) && stepName.equals(other.stepName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.conditions, this.stepName);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StepNameStage builder() {
        return new Builder();
    }

    public interface StepNameStage {
        _FinalStage stepName(@NotNull String stepName);

        Builder from(StepDestination other);
    }

    public interface _FinalStage {
        StepDestination build();

        _FinalStage conditions(Optional<List<StepDestinationConditionsItem>> conditions);

        _FinalStage conditions(List<StepDestinationConditionsItem> conditions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StepNameStage, _FinalStage {
        private String stepName;

        private Optional<List<StepDestinationConditionsItem>> conditions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(StepDestination other) {
            conditions(other.getConditions());
            stepName(other.getStepName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("stepName")
        public _FinalStage stepName(@NotNull String stepName) {
            this.stepName = Objects.requireNonNull(stepName, "stepName must not be null");
            return this;
        }

        /**
         * <p>This is an optional array of conditions that must be met for this destination to be triggered. If empty, this is the default destination that the step transfers to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage conditions(List<StepDestinationConditionsItem> conditions) {
            this.conditions = Optional.ofNullable(conditions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "conditions", nulls = Nulls.SKIP)
        public _FinalStage conditions(Optional<List<StepDestinationConditionsItem>> conditions) {
            this.conditions = conditions;
            return this;
        }

        @java.lang.Override
        public StepDestination build() {
            return new StepDestination(conditions, stepName, additionalProperties);
        }
    }
}
