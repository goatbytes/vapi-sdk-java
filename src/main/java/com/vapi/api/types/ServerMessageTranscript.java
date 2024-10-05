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
@JsonDeserialize(builder = ServerMessageTranscript.Builder.class)
public final class ServerMessageTranscript {
    private final Optional<ServerMessageTranscriptPhoneNumber> phoneNumber;

    private final Optional<String> timestamp;

    private final Optional<Artifact> artifact;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<Call> call;

    private final ServerMessageTranscriptRole role;

    private final ServerMessageTranscriptTranscriptType transcriptType;

    private final String transcript;

    private final Map<String, Object> additionalProperties;

    private ServerMessageTranscript(
            Optional<ServerMessageTranscriptPhoneNumber> phoneNumber,
            Optional<String> timestamp,
            Optional<Artifact> artifact,
            Optional<CreateAssistantDto> assistant,
            Optional<CreateCustomerDto> customer,
            Optional<Call> call,
            ServerMessageTranscriptRole role,
            ServerMessageTranscriptTranscriptType transcriptType,
            String transcript,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
        this.artifact = artifact;
        this.assistant = assistant;
        this.customer = customer;
        this.call = call;
        this.role = role;
        this.transcriptType = transcriptType;
        this.transcript = transcript;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.phoneNumber</code>,</li>
     * <li><code>call.phoneNumberId</code>.</li>
     * </ul>
     */
    @JsonProperty("phoneNumber")
    public Optional<ServerMessageTranscriptPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the ISO-8601 formatted timestamp of when the message was sent.
     */
    @JsonProperty("timestamp")
    public Optional<String> getTimestamp() {
        return timestamp;
    }

    /**
     * @return This is a live version of the <code>call.artifact</code>.
     * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
     */
    @JsonProperty("artifact")
    public Optional<Artifact> getArtifact() {
        return artifact;
    }

    /**
     * @return This is the assistant that is currently active. This is provided for convenience.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.assistant</code>,</li>
     * <li><code>call.assistantId</code>,</li>
     * <li><code>call.squad[n].assistant</code>,</li>
     * <li><code>call.squad[n].assistantId</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistant</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistantId</code>.</li>
     * </ul>
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return This is the customer associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.customer</code>,</li>
     * <li><code>call.customerId</code>.</li>
     * </ul>
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    /**
     * @return This is the call object.
     * <p>This matches what was returned in POST /call.</p>
     * <p>Note: This might get stale during the call. To get the latest call object, especially after the call is ended, use GET /call/:id.</p>
     */
    @JsonProperty("call")
    public Optional<Call> getCall() {
        return call;
    }

    /**
     * @return This is the role for which the transcript is for.
     */
    @JsonProperty("role")
    public ServerMessageTranscriptRole getRole() {
        return role;
    }

    /**
     * @return This is the type of the transcript.
     */
    @JsonProperty("transcriptType")
    public ServerMessageTranscriptTranscriptType getTranscriptType() {
        return transcriptType;
    }

    /**
     * @return This is the transcript content.
     */
    @JsonProperty("transcript")
    public String getTranscript() {
        return transcript;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageTranscript && equalTo((ServerMessageTranscript) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageTranscript other) {
        return phoneNumber.equals(other.phoneNumber)
                && timestamp.equals(other.timestamp)
                && artifact.equals(other.artifact)
                && assistant.equals(other.assistant)
                && customer.equals(other.customer)
                && call.equals(other.call)
                && role.equals(other.role)
                && transcriptType.equals(other.transcriptType)
                && transcript.equals(other.transcript);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.phoneNumber,
                this.timestamp,
                this.artifact,
                this.assistant,
                this.customer,
                this.call,
                this.role,
                this.transcriptType,
                this.transcript);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        TranscriptTypeStage role(@NotNull ServerMessageTranscriptRole role);

        Builder from(ServerMessageTranscript other);
    }

    public interface TranscriptTypeStage {
        TranscriptStage transcriptType(@NotNull ServerMessageTranscriptTranscriptType transcriptType);
    }

    public interface TranscriptStage {
        _FinalStage transcript(@NotNull String transcript);
    }

    public interface _FinalStage {
        ServerMessageTranscript build();

        _FinalStage phoneNumber(Optional<ServerMessageTranscriptPhoneNumber> phoneNumber);

        _FinalStage phoneNumber(ServerMessageTranscriptPhoneNumber phoneNumber);

        _FinalStage timestamp(Optional<String> timestamp);

        _FinalStage timestamp(String timestamp);

        _FinalStage artifact(Optional<Artifact> artifact);

        _FinalStage artifact(Artifact artifact);

        _FinalStage assistant(Optional<CreateAssistantDto> assistant);

        _FinalStage assistant(CreateAssistantDto assistant);

        _FinalStage customer(Optional<CreateCustomerDto> customer);

        _FinalStage customer(CreateCustomerDto customer);

        _FinalStage call(Optional<Call> call);

        _FinalStage call(Call call);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RoleStage, TranscriptTypeStage, TranscriptStage, _FinalStage {
        private ServerMessageTranscriptRole role;

        private ServerMessageTranscriptTranscriptType transcriptType;

        private String transcript;

        private Optional<Call> call = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<Artifact> artifact = Optional.empty();

        private Optional<String> timestamp = Optional.empty();

        private Optional<ServerMessageTranscriptPhoneNumber> phoneNumber = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ServerMessageTranscript other) {
            phoneNumber(other.getPhoneNumber());
            timestamp(other.getTimestamp());
            artifact(other.getArtifact());
            assistant(other.getAssistant());
            customer(other.getCustomer());
            call(other.getCall());
            role(other.getRole());
            transcriptType(other.getTranscriptType());
            transcript(other.getTranscript());
            return this;
        }

        /**
         * <p>This is the role for which the transcript is for.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("role")
        public TranscriptTypeStage role(@NotNull ServerMessageTranscriptRole role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        /**
         * <p>This is the type of the transcript.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("transcriptType")
        public TranscriptStage transcriptType(@NotNull ServerMessageTranscriptTranscriptType transcriptType) {
            this.transcriptType = Objects.requireNonNull(transcriptType, "transcriptType must not be null");
            return this;
        }

        /**
         * <p>This is the transcript content.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("transcript")
        public _FinalStage transcript(@NotNull String transcript) {
            this.transcript = Objects.requireNonNull(transcript, "transcript must not be null");
            return this;
        }

        /**
         * <p>This is the call object.</p>
         * <p>This matches what was returned in POST /call.</p>
         * <p>Note: This might get stale during the call. To get the latest call object, especially after the call is ended, use GET /call/:id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage call(Call call) {
            this.call = Optional.ofNullable(call);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "call", nulls = Nulls.SKIP)
        public _FinalStage call(Optional<Call> call) {
            this.call = call;
            return this;
        }

        /**
         * <p>This is the customer associated with the call.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.customer</code>,</li>
         * <li><code>call.customerId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public _FinalStage customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        /**
         * <p>This is the assistant that is currently active. This is provided for convenience.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.assistant</code>,</li>
         * <li><code>call.assistantId</code>,</li>
         * <li><code>call.squad[n].assistant</code>,</li>
         * <li><code>call.squad[n].assistantId</code>,</li>
         * <li><code>call.squadId-&gt;[n].assistant</code>,</li>
         * <li><code>call.squadId-&gt;[n].assistantId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public _FinalStage assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        /**
         * <p>This is a live version of the <code>call.artifact</code>.</p>
         * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage artifact(Artifact artifact) {
            this.artifact = Optional.ofNullable(artifact);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "artifact", nulls = Nulls.SKIP)
        public _FinalStage artifact(Optional<Artifact> artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * <p>This is the ISO-8601 formatted timestamp of when the message was sent.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timestamp(String timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public _FinalStage timestamp(Optional<String> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>This is the phone number associated with the call.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.phoneNumber</code>,</li>
         * <li><code>call.phoneNumberId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage phoneNumber(ServerMessageTranscriptPhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public _FinalStage phoneNumber(Optional<ServerMessageTranscriptPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        public ServerMessageTranscript build() {
            return new ServerMessageTranscript(
                    phoneNumber,
                    timestamp,
                    artifact,
                    assistant,
                    customer,
                    call,
                    role,
                    transcriptType,
                    transcript,
                    additionalProperties);
        }
    }
}
