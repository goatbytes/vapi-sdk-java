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
@JsonDeserialize(builder = CreateOutboundCallDto.Builder.class)
public final class CreateOutboundCallDto {
    private final Optional<String> name;

    private final Optional<String> assistantId;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<AssistantOverrides> assistantOverrides;

    private final Optional<String> squadId;

    private final Optional<CreateSquadDto> squad;

    private final Optional<String> phoneNumberId;

    private final Optional<ImportTwilioPhoneNumberDto> phoneNumber;

    private final Optional<String> customerId;

    private final Optional<CreateCustomerDto> customer;

    private final Map<String, Object> additionalProperties;

    private CreateOutboundCallDto(
            Optional<String> name,
            Optional<String> assistantId,
            Optional<CreateAssistantDto> assistant,
            Optional<AssistantOverrides> assistantOverrides,
            Optional<String> squadId,
            Optional<CreateSquadDto> squad,
            Optional<String> phoneNumberId,
            Optional<ImportTwilioPhoneNumberDto> phoneNumber,
            Optional<String> customerId,
            Optional<CreateCustomerDto> customer,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.assistantId = assistantId;
        this.assistant = assistant;
        this.assistantOverrides = assistantOverrides;
        this.squadId = squadId;
        this.squad = squad;
        this.phoneNumberId = phoneNumberId;
        this.phoneNumber = phoneNumber;
        this.customerId = customerId;
        this.customer = customer;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of the call. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the assistant that will be used for the call. To use a transient assistant, use <code>assistant</code> instead.
     */
    @JsonProperty("assistantId")
    public Optional<String> getAssistantId() {
        return assistantId;
    }

    /**
     * @return This is the assistant that will be used for the call. To use an existing assistant, use <code>assistantId</code> instead.
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return These are the overrides for the <code>assistant</code> or <code>assistantId</code>'s settings and template variables.
     */
    @JsonProperty("assistantOverrides")
    public Optional<AssistantOverrides> getAssistantOverrides() {
        return assistantOverrides;
    }

    /**
     * @return This is the squad that will be used for the call. To use a transient squad, use <code>squad</code> instead.
     */
    @JsonProperty("squadId")
    public Optional<String> getSquadId() {
        return squadId;
    }

    /**
     * @return This is a squad that will be used for the call. To use an existing squad, use <code>squadId</code> instead.
     */
    @JsonProperty("squad")
    public Optional<CreateSquadDto> getSquad() {
        return squad;
    }

    /**
     * @return This is the phone number that will be used for the call. To use a transient number, use <code>phoneNumber</code> instead.
     * <p>Only relevant for <code>outboundPhoneCall</code> and <code>inboundPhoneCall</code> type.</p>
     */
    @JsonProperty("phoneNumberId")
    public Optional<String> getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * @return This is the phone number that will be used for the call. To use an existing number, use <code>phoneNumberId</code> instead.
     * <p>Only relevant for <code>outboundPhoneCall</code> and <code>inboundPhoneCall</code> type.</p>
     */
    @JsonProperty("phoneNumber")
    public Optional<ImportTwilioPhoneNumberDto> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the customer that will be called. To call a transient customer , use <code>customer</code> instead.
     * <p>Only relevant for <code>outboundPhoneCall</code> and <code>inboundPhoneCall</code> type.</p>
     */
    @JsonProperty("customerId")
    public Optional<String> getCustomerId() {
        return customerId;
    }

    /**
     * @return This is the customer that will be called. To call an existing customer, use <code>customerId</code> instead.
     * <p>Only relevant for <code>outboundPhoneCall</code> and <code>inboundPhoneCall</code> type.</p>
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateOutboundCallDto && equalTo((CreateOutboundCallDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateOutboundCallDto other) {
        return name.equals(other.name)
                && assistantId.equals(other.assistantId)
                && assistant.equals(other.assistant)
                && assistantOverrides.equals(other.assistantOverrides)
                && squadId.equals(other.squadId)
                && squad.equals(other.squad)
                && phoneNumberId.equals(other.phoneNumberId)
                && phoneNumber.equals(other.phoneNumber)
                && customerId.equals(other.customerId)
                && customer.equals(other.customer);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.assistantId,
                this.assistant,
                this.assistantOverrides,
                this.squadId,
                this.squad,
                this.phoneNumberId,
                this.phoneNumber,
                this.customerId,
                this.customer);
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
        private Optional<String> name = Optional.empty();

        private Optional<String> assistantId = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<AssistantOverrides> assistantOverrides = Optional.empty();

        private Optional<String> squadId = Optional.empty();

        private Optional<CreateSquadDto> squad = Optional.empty();

        private Optional<String> phoneNumberId = Optional.empty();

        private Optional<ImportTwilioPhoneNumberDto> phoneNumber = Optional.empty();

        private Optional<String> customerId = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateOutboundCallDto other) {
            name(other.getName());
            assistantId(other.getAssistantId());
            assistant(other.getAssistant());
            assistantOverrides(other.getAssistantOverrides());
            squadId(other.getSquadId());
            squad(other.getSquad());
            phoneNumberId(other.getPhoneNumberId());
            phoneNumber(other.getPhoneNumber());
            customerId(other.getCustomerId());
            customer(other.getCustomer());
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

        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public Builder assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        public Builder assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @JsonSetter(value = "assistantOverrides", nulls = Nulls.SKIP)
        public Builder assistantOverrides(Optional<AssistantOverrides> assistantOverrides) {
            this.assistantOverrides = assistantOverrides;
            return this;
        }

        public Builder assistantOverrides(AssistantOverrides assistantOverrides) {
            this.assistantOverrides = Optional.ofNullable(assistantOverrides);
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

        @JsonSetter(value = "squad", nulls = Nulls.SKIP)
        public Builder squad(Optional<CreateSquadDto> squad) {
            this.squad = squad;
            return this;
        }

        public Builder squad(CreateSquadDto squad) {
            this.squad = Optional.ofNullable(squad);
            return this;
        }

        @JsonSetter(value = "phoneNumberId", nulls = Nulls.SKIP)
        public Builder phoneNumberId(Optional<String> phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }

        public Builder phoneNumberId(String phoneNumberId) {
            this.phoneNumberId = Optional.ofNullable(phoneNumberId);
            return this;
        }

        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<ImportTwilioPhoneNumberDto> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(ImportTwilioPhoneNumberDto phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @JsonSetter(value = "customerId", nulls = Nulls.SKIP)
        public Builder customerId(Optional<String> customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder customerId(String customerId) {
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public Builder customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        public Builder customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
            return this;
        }

        public CreateOutboundCallDto build() {
            return new CreateOutboundCallDto(
                    name,
                    assistantId,
                    assistant,
                    assistantOverrides,
                    squadId,
                    squad,
                    phoneNumberId,
                    phoneNumber,
                    customerId,
                    customer,
                    additionalProperties);
        }
    }
}
