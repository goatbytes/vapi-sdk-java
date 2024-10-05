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
@JsonDeserialize(builder = TransportConfigurationTwilio.Builder.class)
public final class TransportConfigurationTwilio {
    private final Optional<Double> timeout;

    private final Optional<Boolean> record;

    private final Optional<TransportConfigurationTwilioRecordingChannels> recordingChannels;

    private final Map<String, Object> additionalProperties;

    private TransportConfigurationTwilio(
            Optional<Double> timeout,
            Optional<Boolean> record,
            Optional<TransportConfigurationTwilioRecordingChannels> recordingChannels,
            Map<String, Object> additionalProperties) {
        this.timeout = timeout;
        this.record = record;
        this.recordingChannels = recordingChannels;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "twilio";
    }

    /**
     * @return The integer number of seconds that we should allow the phone to ring before assuming there is no answer.
     * The default is <code>60</code> seconds and the maximum is <code>600</code> seconds.
     * For some call flows, we will add a 5-second buffer to the timeout value you provide.
     * For this reason, a timeout value of 10 seconds could result in an actual timeout closer to 15 seconds.
     * You can set this to a short time, such as <code>15</code> seconds, to hang up before reaching an answering machine or voicemail.
     * <p>@default 60</p>
     */
    @JsonProperty("timeout")
    public Optional<Double> getTimeout() {
        return timeout;
    }

    /**
     * @return Whether to record the call.
     * Can be <code>true</code> to record the phone call, or <code>false</code> to not.
     * The default is <code>false</code>.
     * <p>@default false</p>
     */
    @JsonProperty("record")
    public Optional<Boolean> getRecord() {
        return record;
    }

    /**
     * @return The number of channels in the final recording.
     * Can be: <code>mono</code> or <code>dual</code>.
     * The default is <code>mono</code>.
     * <code>mono</code> records both legs of the call in a single channel of the recording file.
     * <code>dual</code> records each leg to a separate channel of the recording file.
     * The first channel of a dual-channel recording contains the parent call and the second channel contains the child call.
     * <p>@default 'mono'</p>
     */
    @JsonProperty("recordingChannels")
    public Optional<TransportConfigurationTwilioRecordingChannels> getRecordingChannels() {
        return recordingChannels;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransportConfigurationTwilio && equalTo((TransportConfigurationTwilio) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransportConfigurationTwilio other) {
        return timeout.equals(other.timeout)
                && record.equals(other.record)
                && recordingChannels.equals(other.recordingChannels);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.timeout, this.record, this.recordingChannels);
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
        private Optional<Double> timeout = Optional.empty();

        private Optional<Boolean> record = Optional.empty();

        private Optional<TransportConfigurationTwilioRecordingChannels> recordingChannels = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TransportConfigurationTwilio other) {
            timeout(other.getTimeout());
            record(other.getRecord());
            recordingChannels(other.getRecordingChannels());
            return this;
        }

        @JsonSetter(value = "timeout", nulls = Nulls.SKIP)
        public Builder timeout(Optional<Double> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(Double timeout) {
            this.timeout = Optional.ofNullable(timeout);
            return this;
        }

        @JsonSetter(value = "record", nulls = Nulls.SKIP)
        public Builder record(Optional<Boolean> record) {
            this.record = record;
            return this;
        }

        public Builder record(Boolean record) {
            this.record = Optional.ofNullable(record);
            return this;
        }

        @JsonSetter(value = "recordingChannels", nulls = Nulls.SKIP)
        public Builder recordingChannels(Optional<TransportConfigurationTwilioRecordingChannels> recordingChannels) {
            this.recordingChannels = recordingChannels;
            return this;
        }

        public Builder recordingChannels(TransportConfigurationTwilioRecordingChannels recordingChannels) {
            this.recordingChannels = Optional.ofNullable(recordingChannels);
            return this;
        }

        public TransportConfigurationTwilio build() {
            return new TransportConfigurationTwilio(timeout, record, recordingChannels, additionalProperties);
        }
    }
}
