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
@JsonDeserialize(builder = UpdateByoSipTrunkCredentialDto.Builder.class)
public final class UpdateByoSipTrunkCredentialDto {
    private final Optional<String> provider;

    private final List<SipTrunkGateway> gateways;

    private final Optional<String> name;

    private final Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan;

    private final Optional<Boolean> outboundLeadingPlusEnabled;

    private final Optional<SbcConfiguration> sbcConfiguration;

    private final Map<String, Object> additionalProperties;

    private UpdateByoSipTrunkCredentialDto(
            Optional<String> provider,
            List<SipTrunkGateway> gateways,
            Optional<String> name,
            Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan,
            Optional<Boolean> outboundLeadingPlusEnabled,
            Optional<SbcConfiguration> sbcConfiguration,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.gateways = gateways;
        this.name = name;
        this.outboundAuthenticationPlan = outboundAuthenticationPlan;
        this.outboundLeadingPlusEnabled = outboundLeadingPlusEnabled;
        this.sbcConfiguration = sbcConfiguration;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This can be used to bring your own SIP trunks or to connect to a Carrier.
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    /**
     * @return This is the list of SIP trunk's gateways.
     */
    @JsonProperty("gateways")
    public List<SipTrunkGateway> getGateways() {
        return gateways;
    }

    /**
     * @return This is the name of the SIP trunk. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This can be used to configure the outbound authentication if required by the SIP trunk.
     */
    @JsonProperty("outboundAuthenticationPlan")
    public Optional<SipTrunkOutboundAuthenticationPlan> getOutboundAuthenticationPlan() {
        return outboundAuthenticationPlan;
    }

    /**
     * @return This ensures the outbound origination attempts have a leading plus. Defaults to false to match conventional telecom behavior.
     * <p>Usage:</p>
     * <ul>
     * <li>Vonage/Twilio requires leading plus for all outbound calls. Set this to true.</li>
     * </ul>
     * <p>@default false</p>
     */
    @JsonProperty("outboundLeadingPlusEnabled")
    public Optional<Boolean> getOutboundLeadingPlusEnabled() {
        return outboundLeadingPlusEnabled;
    }

    /**
     * @return This is an advanced configuration for enterprise deployments. This uses the onprem SBC to trunk into the SIP trunk's <code>gateways</code>, rather than the managed SBC provided by Vapi.
     */
    @JsonProperty("sbcConfiguration")
    public Optional<SbcConfiguration> getSbcConfiguration() {
        return sbcConfiguration;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateByoSipTrunkCredentialDto && equalTo((UpdateByoSipTrunkCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateByoSipTrunkCredentialDto other) {
        return provider.equals(other.provider)
                && gateways.equals(other.gateways)
                && name.equals(other.name)
                && outboundAuthenticationPlan.equals(other.outboundAuthenticationPlan)
                && outboundLeadingPlusEnabled.equals(other.outboundLeadingPlusEnabled)
                && sbcConfiguration.equals(other.sbcConfiguration);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.provider,
                this.gateways,
                this.name,
                this.outboundAuthenticationPlan,
                this.outboundLeadingPlusEnabled,
                this.sbcConfiguration);
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
        private Optional<String> provider = Optional.empty();

        private List<SipTrunkGateway> gateways = new ArrayList<>();

        private Optional<String> name = Optional.empty();

        private Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan = Optional.empty();

        private Optional<Boolean> outboundLeadingPlusEnabled = Optional.empty();

        private Optional<SbcConfiguration> sbcConfiguration = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateByoSipTrunkCredentialDto other) {
            provider(other.getProvider());
            gateways(other.getGateways());
            name(other.getName());
            outboundAuthenticationPlan(other.getOutboundAuthenticationPlan());
            outboundLeadingPlusEnabled(other.getOutboundLeadingPlusEnabled());
            sbcConfiguration(other.getSbcConfiguration());
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(String provider) {
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        @JsonSetter(value = "gateways", nulls = Nulls.SKIP)
        public Builder gateways(List<SipTrunkGateway> gateways) {
            this.gateways.clear();
            this.gateways.addAll(gateways);
            return this;
        }

        public Builder addGateways(SipTrunkGateway gateways) {
            this.gateways.add(gateways);
            return this;
        }

        public Builder addAllGateways(List<SipTrunkGateway> gateways) {
            this.gateways.addAll(gateways);
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

        @JsonSetter(value = "outboundAuthenticationPlan", nulls = Nulls.SKIP)
        public Builder outboundAuthenticationPlan(
                Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = outboundAuthenticationPlan;
            return this;
        }

        public Builder outboundAuthenticationPlan(SipTrunkOutboundAuthenticationPlan outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = Optional.ofNullable(outboundAuthenticationPlan);
            return this;
        }

        @JsonSetter(value = "outboundLeadingPlusEnabled", nulls = Nulls.SKIP)
        public Builder outboundLeadingPlusEnabled(Optional<Boolean> outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = outboundLeadingPlusEnabled;
            return this;
        }

        public Builder outboundLeadingPlusEnabled(Boolean outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = Optional.ofNullable(outboundLeadingPlusEnabled);
            return this;
        }

        @JsonSetter(value = "sbcConfiguration", nulls = Nulls.SKIP)
        public Builder sbcConfiguration(Optional<SbcConfiguration> sbcConfiguration) {
            this.sbcConfiguration = sbcConfiguration;
            return this;
        }

        public Builder sbcConfiguration(SbcConfiguration sbcConfiguration) {
            this.sbcConfiguration = Optional.ofNullable(sbcConfiguration);
            return this;
        }

        public UpdateByoSipTrunkCredentialDto build() {
            return new UpdateByoSipTrunkCredentialDto(
                    provider,
                    gateways,
                    name,
                    outboundAuthenticationPlan,
                    outboundLeadingPlusEnabled,
                    sbcConfiguration,
                    additionalProperties);
        }
    }
}
