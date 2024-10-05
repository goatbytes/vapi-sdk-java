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
@JsonDeserialize(builder = SystemMessage.Builder.class)
public final class SystemMessage {
    private final String role;

    private final String message;

    private final double time;

    private final double secondsFromStart;

    private final Map<String, Object> additionalProperties;

    private SystemMessage(
            String role,
            String message,
            double time,
            double secondsFromStart,
            Map<String, Object> additionalProperties) {
        this.role = role;
        this.message = message;
        this.time = time;
        this.secondsFromStart = secondsFromStart;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The role of the system in the conversation.
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * @return The message content from the system.
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * @return The timestamp when the message was sent.
     */
    @JsonProperty("time")
    public double getTime() {
        return time;
    }

    /**
     * @return The number of seconds from the start of the conversation.
     */
    @JsonProperty("secondsFromStart")
    public double getSecondsFromStart() {
        return secondsFromStart;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SystemMessage && equalTo((SystemMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SystemMessage other) {
        return role.equals(other.role)
                && message.equals(other.message)
                && time == other.time
                && secondsFromStart == other.secondsFromStart;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.role, this.message, this.time, this.secondsFromStart);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        MessageStage role(@NotNull String role);

        Builder from(SystemMessage other);
    }

    public interface MessageStage {
        TimeStage message(@NotNull String message);
    }

    public interface TimeStage {
        SecondsFromStartStage time(double time);
    }

    public interface SecondsFromStartStage {
        _FinalStage secondsFromStart(double secondsFromStart);
    }

    public interface _FinalStage {
        SystemMessage build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RoleStage, MessageStage, TimeStage, SecondsFromStartStage, _FinalStage {
        private String role;

        private String message;

        private double time;

        private double secondsFromStart;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SystemMessage other) {
            role(other.getRole());
            message(other.getMessage());
            time(other.getTime());
            secondsFromStart(other.getSecondsFromStart());
            return this;
        }

        /**
         * <p>The role of the system in the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("role")
        public MessageStage role(@NotNull String role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        /**
         * <p>The message content from the system.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("message")
        public TimeStage message(@NotNull String message) {
            this.message = Objects.requireNonNull(message, "message must not be null");
            return this;
        }

        /**
         * <p>The timestamp when the message was sent.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("time")
        public SecondsFromStartStage time(double time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The number of seconds from the start of the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("secondsFromStart")
        public _FinalStage secondsFromStart(double secondsFromStart) {
            this.secondsFromStart = secondsFromStart;
            return this;
        }

        @java.lang.Override
        public SystemMessage build() {
            return new SystemMessage(role, message, time, secondsFromStart, additionalProperties);
        }
    }
}
