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
@JsonDeserialize(builder = TransferDestinationSip.Builder.class)
public final class TransferDestinationSip {
    private final Optional<TransferDestinationSipMessage> message;

    private final String sipUri;

    private final Optional<TransferPlan> transferPlan;

    private final Optional<Map<String, Object>> sipHeaders;

    private final Optional<String> description;

    private final Map<String, Object> additionalProperties;

    private TransferDestinationSip(
            Optional<TransferDestinationSipMessage> message,
            String sipUri,
            Optional<TransferPlan> transferPlan,
            Optional<Map<String, Object>> sipHeaders,
            Optional<String> description,
            Map<String, Object> additionalProperties) {
        this.message = message;
        this.sipUri = sipUri;
        this.transferPlan = transferPlan;
        this.sipHeaders = sipHeaders;
        this.description = description;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is spoken to the customer before connecting them to the destination.
     * <p>Usage:</p>
     * <ul>
     * <li>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</li>
     * <li>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</li>
     * </ul>
     * <p>This accepts a string or a ToolMessageStart class. Latter is useful if you want to specify multiple messages for different languages through the <code>contents</code> field.</p>
     */
    @JsonProperty("message")
    public Optional<TransferDestinationSipMessage> getMessage() {
        return message;
    }

    /**
     * @return This is the SIP URI to transfer the call to.
     */
    @JsonProperty("sipUri")
    public String getSipUri() {
        return sipUri;
    }

    /**
     * @return This configures how transfer is executed and the experience of the destination party receiving the call. Defaults to <code>blind-transfer</code>.
     * <p>@default <code>transferPlan.mode='blind-transfer'</code></p>
     */
    @JsonProperty("transferPlan")
    public Optional<TransferPlan> getTransferPlan() {
        return transferPlan;
    }

    /**
     * @return These are custom headers to be added to SIP refer during transfer call.
     */
    @JsonProperty("sipHeaders")
    public Optional<Map<String, Object>> getSipHeaders() {
        return sipHeaders;
    }

    /**
     * @return This is the description of the destination, used by the AI to choose when and how to transfer the call.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransferDestinationSip && equalTo((TransferDestinationSip) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransferDestinationSip other) {
        return message.equals(other.message)
                && sipUri.equals(other.sipUri)
                && transferPlan.equals(other.transferPlan)
                && sipHeaders.equals(other.sipHeaders)
                && description.equals(other.description);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.message, this.sipUri, this.transferPlan, this.sipHeaders, this.description);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SipUriStage builder() {
        return new Builder();
    }

    public interface SipUriStage {
        _FinalStage sipUri(@NotNull String sipUri);

        Builder from(TransferDestinationSip other);
    }

    public interface _FinalStage {
        TransferDestinationSip build();

        _FinalStage message(Optional<TransferDestinationSipMessage> message);

        _FinalStage message(TransferDestinationSipMessage message);

        _FinalStage transferPlan(Optional<TransferPlan> transferPlan);

        _FinalStage transferPlan(TransferPlan transferPlan);

        _FinalStage sipHeaders(Optional<Map<String, Object>> sipHeaders);

        _FinalStage sipHeaders(Map<String, Object> sipHeaders);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SipUriStage, _FinalStage {
        private String sipUri;

        private Optional<String> description = Optional.empty();

        private Optional<Map<String, Object>> sipHeaders = Optional.empty();

        private Optional<TransferPlan> transferPlan = Optional.empty();

        private Optional<TransferDestinationSipMessage> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransferDestinationSip other) {
            message(other.getMessage());
            sipUri(other.getSipUri());
            transferPlan(other.getTransferPlan());
            sipHeaders(other.getSipHeaders());
            description(other.getDescription());
            return this;
        }

        /**
         * <p>This is the SIP URI to transfer the call to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("sipUri")
        public _FinalStage sipUri(@NotNull String sipUri) {
            this.sipUri = Objects.requireNonNull(sipUri, "sipUri must not be null");
            return this;
        }

        /**
         * <p>This is the description of the destination, used by the AI to choose when and how to transfer the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * <p>These are custom headers to be added to SIP refer during transfer call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage sipHeaders(Map<String, Object> sipHeaders) {
            this.sipHeaders = Optional.ofNullable(sipHeaders);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sipHeaders", nulls = Nulls.SKIP)
        public _FinalStage sipHeaders(Optional<Map<String, Object>> sipHeaders) {
            this.sipHeaders = sipHeaders;
            return this;
        }

        /**
         * <p>This configures how transfer is executed and the experience of the destination party receiving the call. Defaults to <code>blind-transfer</code>.</p>
         * <p>@default <code>transferPlan.mode='blind-transfer'</code></p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage transferPlan(TransferPlan transferPlan) {
            this.transferPlan = Optional.ofNullable(transferPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "transferPlan", nulls = Nulls.SKIP)
        public _FinalStage transferPlan(Optional<TransferPlan> transferPlan) {
            this.transferPlan = transferPlan;
            return this;
        }

        /**
         * <p>This is spoken to the customer before connecting them to the destination.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</li>
         * <li>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</li>
         * </ul>
         * <p>This accepts a string or a ToolMessageStart class. Latter is useful if you want to specify multiple messages for different languages through the <code>contents</code> field.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage message(TransferDestinationSipMessage message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<TransferDestinationSipMessage> message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public TransferDestinationSip build() {
            return new TransferDestinationSip(
                    message, sipUri, transferPlan, sipHeaders, description, additionalProperties);
        }
    }
}
