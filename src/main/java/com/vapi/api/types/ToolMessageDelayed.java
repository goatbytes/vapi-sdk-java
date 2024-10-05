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
@JsonDeserialize(builder = ToolMessageDelayed.Builder.class)
public final class ToolMessageDelayed {
    private final Optional<Double> timingMilliseconds;

    private final String content;

    private final Optional<List<Condition>> conditions;

    private final Map<String, Object> additionalProperties;

    private ToolMessageDelayed(
            Optional<Double> timingMilliseconds,
            String content,
            Optional<List<Condition>> conditions,
            Map<String, Object> additionalProperties) {
        this.timingMilliseconds = timingMilliseconds;
        this.content = content;
        this.conditions = conditions;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The number of milliseconds to wait for the server response before saying this message.
     */
    @JsonProperty("timingMilliseconds")
    public Optional<Double> getTimingMilliseconds() {
        return timingMilliseconds;
    }

    /**
     * @return This is the content that the assistant says when this message is triggered.
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * @return This is an optional array of conditions that the tool call arguments must meet in order for this message to be triggered.
     */
    @JsonProperty("conditions")
    public Optional<List<Condition>> getConditions() {
        return conditions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ToolMessageDelayed && equalTo((ToolMessageDelayed) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ToolMessageDelayed other) {
        return timingMilliseconds.equals(other.timingMilliseconds)
                && content.equals(other.content)
                && conditions.equals(other.conditions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.timingMilliseconds, this.content, this.conditions);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(@NotNull String content);

        Builder from(ToolMessageDelayed other);
    }

    public interface _FinalStage {
        ToolMessageDelayed build();

        _FinalStage timingMilliseconds(Optional<Double> timingMilliseconds);

        _FinalStage timingMilliseconds(Double timingMilliseconds);

        _FinalStage conditions(Optional<List<Condition>> conditions);

        _FinalStage conditions(List<Condition> conditions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private String content;

        private Optional<List<Condition>> conditions = Optional.empty();

        private Optional<Double> timingMilliseconds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ToolMessageDelayed other) {
            timingMilliseconds(other.getTimingMilliseconds());
            content(other.getContent());
            conditions(other.getConditions());
            return this;
        }

        /**
         * <p>This is the content that the assistant says when this message is triggered.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("content")
        public _FinalStage content(@NotNull String content) {
            this.content = Objects.requireNonNull(content, "content must not be null");
            return this;
        }

        /**
         * <p>This is an optional array of conditions that the tool call arguments must meet in order for this message to be triggered.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage conditions(List<Condition> conditions) {
            this.conditions = Optional.ofNullable(conditions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "conditions", nulls = Nulls.SKIP)
        public _FinalStage conditions(Optional<List<Condition>> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The number of milliseconds to wait for the server response before saying this message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timingMilliseconds(Double timingMilliseconds) {
            this.timingMilliseconds = Optional.ofNullable(timingMilliseconds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timingMilliseconds", nulls = Nulls.SKIP)
        public _FinalStage timingMilliseconds(Optional<Double> timingMilliseconds) {
            this.timingMilliseconds = timingMilliseconds;
            return this;
        }

        @java.lang.Override
        public ToolMessageDelayed build() {
            return new ToolMessageDelayed(timingMilliseconds, content, conditions, additionalProperties);
        }
    }
}
