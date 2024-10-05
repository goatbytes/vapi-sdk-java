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
@JsonDeserialize(builder = RimeAiVoice.Builder.class)
public final class RimeAiVoice {
    private final Optional<Boolean> fillerInjectionEnabled;

    private final RimeAiVoiceId voiceId;

    private final Optional<RimeAiVoiceModel> model;

    private final Optional<Double> speed;

    private final Optional<ChunkPlan> chunkPlan;

    private final Map<String, Object> additionalProperties;

    private RimeAiVoice(
            Optional<Boolean> fillerInjectionEnabled,
            RimeAiVoiceId voiceId,
            Optional<RimeAiVoiceModel> model,
            Optional<Double> speed,
            Optional<ChunkPlan> chunkPlan,
            Map<String, Object> additionalProperties) {
        this.fillerInjectionEnabled = fillerInjectionEnabled;
        this.voiceId = voiceId;
        this.model = model;
        this.speed = speed;
        this.chunkPlan = chunkPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This determines whether fillers are injected into the model output before inputting it into the voice provider.
     * <p>Default <code>false</code> because you can achieve better results with prompting the model.</p>
     */
    @JsonProperty("fillerInjectionEnabled")
    public Optional<Boolean> getFillerInjectionEnabled() {
        return fillerInjectionEnabled;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public RimeAiVoiceId getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the model that will be used. Defaults to 'v1' when not specified.
     */
    @JsonProperty("model")
    public Optional<RimeAiVoiceModel> getModel() {
        return model;
    }

    /**
     * @return This is the speed multiplier that will be used.
     */
    @JsonProperty("speed")
    public Optional<Double> getSpeed() {
        return speed;
    }

    /**
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RimeAiVoice && equalTo((RimeAiVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RimeAiVoice other) {
        return fillerInjectionEnabled.equals(other.fillerInjectionEnabled)
                && voiceId.equals(other.voiceId)
                && model.equals(other.model)
                && speed.equals(other.speed)
                && chunkPlan.equals(other.chunkPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.fillerInjectionEnabled, this.voiceId, this.model, this.speed, this.chunkPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull RimeAiVoiceId voiceId);

        Builder from(RimeAiVoice other);
    }

    public interface _FinalStage {
        RimeAiVoice build();

        _FinalStage fillerInjectionEnabled(Optional<Boolean> fillerInjectionEnabled);

        _FinalStage fillerInjectionEnabled(Boolean fillerInjectionEnabled);

        _FinalStage model(Optional<RimeAiVoiceModel> model);

        _FinalStage model(RimeAiVoiceModel model);

        _FinalStage speed(Optional<Double> speed);

        _FinalStage speed(Double speed);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private RimeAiVoiceId voiceId;

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Double> speed = Optional.empty();

        private Optional<RimeAiVoiceModel> model = Optional.empty();

        private Optional<Boolean> fillerInjectionEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RimeAiVoice other) {
            fillerInjectionEnabled(other.getFillerInjectionEnabled());
            voiceId(other.getVoiceId());
            model(other.getModel());
            speed(other.getSpeed());
            chunkPlan(other.getChunkPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull RimeAiVoiceId voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        /**
         * <p>This is the plan for chunking the model output before it is sent to the voice provider.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage chunkPlan(ChunkPlan chunkPlan) {
            this.chunkPlan = Optional.ofNullable(chunkPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "chunkPlan", nulls = Nulls.SKIP)
        public _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan) {
            this.chunkPlan = chunkPlan;
            return this;
        }

        /**
         * <p>This is the speed multiplier that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage speed(Double speed) {
            this.speed = Optional.ofNullable(speed);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "speed", nulls = Nulls.SKIP)
        public _FinalStage speed(Optional<Double> speed) {
            this.speed = speed;
            return this;
        }

        /**
         * <p>This is the model that will be used. Defaults to 'v1' when not specified.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage model(RimeAiVoiceModel model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<RimeAiVoiceModel> model) {
            this.model = model;
            return this;
        }

        /**
         * <p>This determines whether fillers are injected into the model output before inputting it into the voice provider.</p>
         * <p>Default <code>false</code> because you can achieve better results with prompting the model.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fillerInjectionEnabled(Boolean fillerInjectionEnabled) {
            this.fillerInjectionEnabled = Optional.ofNullable(fillerInjectionEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fillerInjectionEnabled", nulls = Nulls.SKIP)
        public _FinalStage fillerInjectionEnabled(Optional<Boolean> fillerInjectionEnabled) {
            this.fillerInjectionEnabled = fillerInjectionEnabled;
            return this;
        }

        @java.lang.Override
        public RimeAiVoice build() {
            return new RimeAiVoice(fillerInjectionEnabled, voiceId, model, speed, chunkPlan, additionalProperties);
        }
    }
}
