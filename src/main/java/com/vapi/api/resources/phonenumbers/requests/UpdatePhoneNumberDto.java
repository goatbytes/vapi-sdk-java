/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.phonenumbers.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.resources.phonenumbers.types.UpdatePhoneNumberDtoFallbackDestination;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UpdatePhoneNumberDto.Builder.class)
public final class UpdatePhoneNumberDto {
    private final Optional<UpdatePhoneNumberDtoFallbackDestination> fallbackDestination;

    private final Optional<String> name;

    private final Optional<String> assistantId;

    private final Optional<String> squadId;

    private final Optional<String> serverUrl;

    private final Optional<String> serverUrlSecret;

    private final Map<String, Object> additionalProperties;

    private UpdatePhoneNumberDto(
            Optional<UpdatePhoneNumberDtoFallbackDestination> fallbackDestination,
            Optional<String> name,
            Optional<String> assistantId,
            Optional<String> squadId,
            Optional<String> serverUrl,
            Optional<String> serverUrlSecret,
            Map<String, Object> additionalProperties) {
        this.fallbackDestination = fallbackDestination;
        this.name = name;
        this.assistantId = assistantId;
        this.squadId = squadId;
        this.serverUrl = serverUrl;
        this.serverUrlSecret = serverUrlSecret;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the fallback destination an inbound call will be transferred to if:
     * <ol>
     * <li><code>assistantId</code> is not set</li>
     * <li><code>squadId</code> is not set</li>
     * <li>and, <code>assistant-request</code> message to the <code>serverUrl</code> fails</li>
     * </ol>
     * <p>If this is not set and above conditions are met, the inbound call is hung up with an error message.</p>
     */
    @JsonProperty("fallbackDestination")
    public Optional<UpdatePhoneNumberDtoFallbackDestination> getFallbackDestination() {
        return fallbackDestination;
    }

    /**
     * @return This is the name of the phone number. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the assistant that will be used for incoming calls to this phone number.
     * <p>If neither <code>assistantId</code> nor <code>squadId</code> is set, <code>assistant-request</code> will be sent to your Server URL. Check <code>ServerMessage</code> and <code>ServerMessageResponse</code> for the shape of the message and response that is expected.</p>
     */
    @JsonProperty("assistantId")
    public Optional<String> getAssistantId() {
        return assistantId;
    }

    /**
     * @return This is the squad that will be used for incoming calls to this phone number.
     * <p>If neither <code>assistantId</code> nor <code>squadId</code> is set, <code>assistant-request</code> will be sent to your Server URL. Check <code>ServerMessage</code> and <code>ServerMessageResponse</code> for the shape of the message and response that is expected.</p>
     */
    @JsonProperty("squadId")
    public Optional<String> getSquadId() {
        return squadId;
    }

    /**
     * @return This is the server URL where messages will be sent for calls on this number. This includes the <code>assistant-request</code> message.
     * <p>You can see the shape of the messages sent in <code>ServerMessage</code>.</p>
     * <p>This overrides the <code>org.serverUrl</code>. Order of precedence: tool.server.url &gt; assistant.serverUrl &gt; phoneNumber.serverUrl &gt; org.serverUrl.</p>
     */
    @JsonProperty("serverUrl")
    public Optional<String> getServerUrl() {
        return serverUrl;
    }

    /**
     * @return This is the secret Vapi will send with every message to your server. It's sent as a header called x-vapi-secret.
     * <p>Same precedence logic as serverUrl.</p>
     */
    @JsonProperty("serverUrlSecret")
    public Optional<String> getServerUrlSecret() {
        return serverUrlSecret;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdatePhoneNumberDto && equalTo((UpdatePhoneNumberDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdatePhoneNumberDto other) {
        return fallbackDestination.equals(other.fallbackDestination)
                && name.equals(other.name)
                && assistantId.equals(other.assistantId)
                && squadId.equals(other.squadId)
                && serverUrl.equals(other.serverUrl)
                && serverUrlSecret.equals(other.serverUrlSecret);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.fallbackDestination,
                this.name,
                this.assistantId,
                this.squadId,
                this.serverUrl,
                this.serverUrlSecret);
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
        private Optional<UpdatePhoneNumberDtoFallbackDestination> fallbackDestination = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> assistantId = Optional.empty();

        private Optional<String> squadId = Optional.empty();

        private Optional<String> serverUrl = Optional.empty();

        private Optional<String> serverUrlSecret = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdatePhoneNumberDto other) {
            fallbackDestination(other.getFallbackDestination());
            name(other.getName());
            assistantId(other.getAssistantId());
            squadId(other.getSquadId());
            serverUrl(other.getServerUrl());
            serverUrlSecret(other.getServerUrlSecret());
            return this;
        }

        @JsonSetter(value = "fallbackDestination", nulls = Nulls.SKIP)
        public Builder fallbackDestination(Optional<UpdatePhoneNumberDtoFallbackDestination> fallbackDestination) {
            this.fallbackDestination = fallbackDestination;
            return this;
        }

        public Builder fallbackDestination(UpdatePhoneNumberDtoFallbackDestination fallbackDestination) {
            this.fallbackDestination = Optional.ofNullable(fallbackDestination);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "assistantId", nulls = Nulls.SKIP)
        public Builder assistantId(Optional<String> assistantId) {
            this.assistantId = assistantId;
            return this;
        }

        public Builder assistantId(String assistantId) {
            this.assistantId = Optional.ofNullable(assistantId);
            return this;
        }

        @JsonSetter(value = "squadId", nulls = Nulls.SKIP)
        public Builder squadId(Optional<String> squadId) {
            this.squadId = squadId;
            return this;
        }

        public Builder squadId(String squadId) {
            this.squadId = Optional.ofNullable(squadId);
            return this;
        }

        @JsonSetter(value = "serverUrl", nulls = Nulls.SKIP)
        public Builder serverUrl(Optional<String> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Optional.ofNullable(serverUrl);
            return this;
        }

        @JsonSetter(value = "serverUrlSecret", nulls = Nulls.SKIP)
        public Builder serverUrlSecret(Optional<String> serverUrlSecret) {
            this.serverUrlSecret = serverUrlSecret;
            return this;
        }

        public Builder serverUrlSecret(String serverUrlSecret) {
            this.serverUrlSecret = Optional.ofNullable(serverUrlSecret);
            return this;
        }

        public UpdatePhoneNumberDto build() {
            return new UpdatePhoneNumberDto(
                    fallbackDestination, name, assistantId, squadId, serverUrl, serverUrlSecret, additionalProperties);
        }
    }
}
