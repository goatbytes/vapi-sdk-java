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
@JsonDeserialize(builder = ServerMessageResponse.Builder.class)
public final class ServerMessageResponse {
    private final ServerMessageResponseMessageResponse messageResponse;

    private final Map<String, Object> additionalProperties;

    private ServerMessageResponse(
            ServerMessageResponseMessageResponse messageResponse, Map<String, Object> additionalProperties) {
        this.messageResponse = messageResponse;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the response that is expected from the server to the message.
     * <p>Note: Most messages don't expect a response. Only &quot;assistant-request&quot;, &quot;tool-calls&quot; and &quot;transfer-destination-request&quot; do.</p>
     */
    @JsonProperty("messageResponse")
    public ServerMessageResponseMessageResponse getMessageResponse() {
        return messageResponse;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageResponse && equalTo((ServerMessageResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageResponse other) {
        return messageResponse.equals(other.messageResponse);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.messageResponse);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MessageResponseStage builder() {
        return new Builder();
    }

    public interface MessageResponseStage {
        _FinalStage messageResponse(@NotNull ServerMessageResponseMessageResponse messageResponse);

        Builder from(ServerMessageResponse other);
    }

    public interface _FinalStage {
        ServerMessageResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageResponseStage, _FinalStage {
        private ServerMessageResponseMessageResponse messageResponse;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ServerMessageResponse other) {
            messageResponse(other.getMessageResponse());
            return this;
        }

        /**
         * <p>This is the response that is expected from the server to the message.</p>
         * <p>Note: Most messages don't expect a response. Only &quot;assistant-request&quot;, &quot;tool-calls&quot; and &quot;transfer-destination-request&quot; do.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("messageResponse")
        public _FinalStage messageResponse(@NotNull ServerMessageResponseMessageResponse messageResponse) {
            this.messageResponse = Objects.requireNonNull(messageResponse, "messageResponse must not be null");
            return this;
        }

        @java.lang.Override
        public ServerMessageResponse build() {
            return new ServerMessageResponse(messageResponse, additionalProperties);
        }
    }
}
