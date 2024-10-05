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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Analysis.Builder.class)
public final class Analysis {
    private final Optional<String> summary;

    private final Optional<Map<String, Object>> structuredData;

    private final Optional<String> successEvaluation;

    private final Map<String, Object> additionalProperties;

    private Analysis(
            Optional<String> summary,
            Optional<Map<String, Object>> structuredData,
            Optional<String> successEvaluation,
            Map<String, Object> additionalProperties) {
        this.summary = summary;
        this.structuredData = structuredData;
        this.successEvaluation = successEvaluation;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the summary of the call. Customize by setting <code>assistant.analysisPlan.summaryPrompt</code>.
     */
    @JsonProperty("summary")
    public Optional<String> getSummary() {
        return summary;
    }

    /**
     * @return This is the structured data extracted from the call. Customize by setting <code>assistant.analysisPlan.structuredDataPrompt</code> and/or <code>assistant.analysisPlan.structuredDataSchema</code>.
     */
    @JsonProperty("structuredData")
    public Optional<Map<String, Object>> getStructuredData() {
        return structuredData;
    }

    /**
     * @return This is the evaluation of the call. Customize by setting <code>assistant.analysisPlan.successEvaluationPrompt</code> and/or <code>assistant.analysisPlan.successEvaluationRubric</code>.
     */
    @JsonProperty("successEvaluation")
    public Optional<String> getSuccessEvaluation() {
        return successEvaluation;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Analysis && equalTo((Analysis) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Analysis other) {
        return summary.equals(other.summary)
                && structuredData.equals(other.structuredData)
                && successEvaluation.equals(other.successEvaluation);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.summary, this.structuredData, this.successEvaluation);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> summary = Optional.empty();

        private Optional<Map<String, Object>> structuredData = Optional.empty();

        private Optional<String> successEvaluation = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Analysis other) {
            summary(other.getSummary());
            structuredData(other.getStructuredData());
            successEvaluation(other.getSuccessEvaluation());
            return this;
        }

        @JsonSetter(value = "summary", nulls = Nulls.SKIP)
        public Builder summary(Optional<String> summary) {
            this.summary = summary;
            return this;
        }

        public Builder summary(String summary) {
            this.summary = Optional.ofNullable(summary);
            return this;
        }

        @JsonSetter(value = "structuredData", nulls = Nulls.SKIP)
        public Builder structuredData(Optional<Map<String, Object>> structuredData) {
            this.structuredData = structuredData;
            return this;
        }

        public Builder structuredData(Map<String, Object> structuredData) {
            this.structuredData = Optional.ofNullable(structuredData);
            return this;
        }

        @JsonSetter(value = "successEvaluation", nulls = Nulls.SKIP)
        public Builder successEvaluation(Optional<String> successEvaluation) {
            this.successEvaluation = successEvaluation;
            return this;
        }

        public Builder successEvaluation(String successEvaluation) {
            this.successEvaluation = Optional.ofNullable(successEvaluation);
            return this;
        }

        public Analysis build() {
            return new Analysis(summary, structuredData, successEvaluation, additionalProperties);
        }
    }
}
