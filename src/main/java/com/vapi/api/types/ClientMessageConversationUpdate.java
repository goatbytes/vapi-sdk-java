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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ClientMessageConversationUpdate.Builder.class)
public final class ClientMessageConversationUpdate {
    private final Optional<List<ClientMessageConversationUpdateMessagesItem>> messages;

    private final List<OpenAiMessage> messagesOpenAiFormatted;

    private final Map<String, Object> additionalProperties;

    private ClientMessageConversationUpdate(
            Optional<List<ClientMessageConversationUpdateMessagesItem>> messages,
            List<OpenAiMessage> messagesOpenAiFormatted,
            Map<String, Object> additionalProperties) {
        this.messages = messages;
        this.messagesOpenAiFormatted = messagesOpenAiFormatted;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the most up-to-date conversation history at the time the message is sent.
     */
    @JsonProperty("messages")
    public Optional<List<ClientMessageConversationUpdateMessagesItem>> getMessages() {
        return messages;
    }

    /**
     * @return This is the most up-to-date conversation history at the time the message is sent, formatted for OpenAI.
     */
    @JsonProperty("messagesOpenAIFormatted")
    public List<OpenAiMessage> getMessagesOpenAiFormatted() {
        return messagesOpenAiFormatted;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageConversationUpdate && equalTo((ClientMessageConversationUpdate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientMessageConversationUpdate other) {
        return messages.equals(other.messages) && messagesOpenAiFormatted.equals(other.messagesOpenAiFormatted);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.messages, this.messagesOpenAiFormatted);
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
        private Optional<List<ClientMessageConversationUpdateMessagesItem>> messages = Optional.empty();

        private List<OpenAiMessage> messagesOpenAiFormatted = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientMessageConversationUpdate other) {
            messages(other.getMessages());
            messagesOpenAiFormatted(other.getMessagesOpenAiFormatted());
            return this;
        }

        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public Builder messages(Optional<List<ClientMessageConversationUpdateMessagesItem>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(List<ClientMessageConversationUpdateMessagesItem> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @JsonSetter(value = "messagesOpenAIFormatted", nulls = Nulls.SKIP)
        public Builder messagesOpenAiFormatted(List<OpenAiMessage> messagesOpenAiFormatted) {
            this.messagesOpenAiFormatted.clear();
            this.messagesOpenAiFormatted.addAll(messagesOpenAiFormatted);
            return this;
        }

        public Builder addMessagesOpenAiFormatted(OpenAiMessage messagesOpenAiFormatted) {
            this.messagesOpenAiFormatted.add(messagesOpenAiFormatted);
            return this;
        }

        public Builder addAllMessagesOpenAiFormatted(List<OpenAiMessage> messagesOpenAiFormatted) {
            this.messagesOpenAiFormatted.addAll(messagesOpenAiFormatted);
            return this;
        }

        public ClientMessageConversationUpdate build() {
            return new ClientMessageConversationUpdate(messages, messagesOpenAiFormatted, additionalProperties);
        }
    }
}
