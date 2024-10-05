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
@JsonDeserialize(builder = VoiceLibraryVoiceResponse.Builder.class)
public final class VoiceLibraryVoiceResponse {
    private final String voiceId;

    private final String name;

    private final Optional<String> publicOwnerId;

    private final Optional<String> description;

    private final Optional<String> gender;

    private final Optional<Map<String, Object>> age;

    private final Optional<String> accent;

    private final Map<String, Object> additionalProperties;

    private VoiceLibraryVoiceResponse(
            String voiceId,
            String name,
            Optional<String> publicOwnerId,
            Optional<String> description,
            Optional<String> gender,
            Optional<Map<String, Object>> age,
            Optional<String> accent,
            Map<String, Object> additionalProperties) {
        this.voiceId = voiceId;
        this.name = name;
        this.publicOwnerId = publicOwnerId;
        this.description = description;
        this.gender = gender;
        this.age = age;
        this.accent = accent;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("voiceId")
    public String getVoiceId() {
        return voiceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("publicOwnerId")
    public Optional<String> getPublicOwnerId() {
        return publicOwnerId;
    }

    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @JsonProperty("gender")
    public Optional<String> getGender() {
        return gender;
    }

    @JsonProperty("age")
    public Optional<Map<String, Object>> getAge() {
        return age;
    }

    @JsonProperty("accent")
    public Optional<String> getAccent() {
        return accent;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VoiceLibraryVoiceResponse && equalTo((VoiceLibraryVoiceResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VoiceLibraryVoiceResponse other) {
        return voiceId.equals(other.voiceId)
                && name.equals(other.name)
                && publicOwnerId.equals(other.publicOwnerId)
                && description.equals(other.description)
                && gender.equals(other.gender)
                && age.equals(other.age)
                && accent.equals(other.accent);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.voiceId, this.name, this.publicOwnerId, this.description, this.gender, this.age, this.accent);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        NameStage voiceId(@NotNull String voiceId);

        Builder from(VoiceLibraryVoiceResponse other);
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);
    }

    public interface _FinalStage {
        VoiceLibraryVoiceResponse build();

        _FinalStage publicOwnerId(Optional<String> publicOwnerId);

        _FinalStage publicOwnerId(String publicOwnerId);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);

        _FinalStage gender(Optional<String> gender);

        _FinalStage gender(String gender);

        _FinalStage age(Optional<Map<String, Object>> age);

        _FinalStage age(Map<String, Object> age);

        _FinalStage accent(Optional<String> accent);

        _FinalStage accent(String accent);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, NameStage, _FinalStage {
        private String voiceId;

        private String name;

        private Optional<String> accent = Optional.empty();

        private Optional<Map<String, Object>> age = Optional.empty();

        private Optional<String> gender = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<String> publicOwnerId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(VoiceLibraryVoiceResponse other) {
            voiceId(other.getVoiceId());
            name(other.getName());
            publicOwnerId(other.getPublicOwnerId());
            description(other.getDescription());
            gender(other.getGender());
            age(other.getAge());
            accent(other.getAccent());
            return this;
        }

        @java.lang.Override
        @JsonSetter("voiceId")
        public NameStage voiceId(@NotNull String voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage accent(String accent) {
            this.accent = Optional.ofNullable(accent);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "accent", nulls = Nulls.SKIP)
        public _FinalStage accent(Optional<String> accent) {
            this.accent = accent;
            return this;
        }

        @java.lang.Override
        public _FinalStage age(Map<String, Object> age) {
            this.age = Optional.ofNullable(age);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "age", nulls = Nulls.SKIP)
        public _FinalStage age(Optional<Map<String, Object>> age) {
            this.age = age;
            return this;
        }

        @java.lang.Override
        public _FinalStage gender(String gender) {
            this.gender = Optional.ofNullable(gender);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "gender", nulls = Nulls.SKIP)
        public _FinalStage gender(Optional<String> gender) {
            this.gender = gender;
            return this;
        }

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

        @java.lang.Override
        public _FinalStage publicOwnerId(String publicOwnerId) {
            this.publicOwnerId = Optional.ofNullable(publicOwnerId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "publicOwnerId", nulls = Nulls.SKIP)
        public _FinalStage publicOwnerId(Optional<String> publicOwnerId) {
            this.publicOwnerId = publicOwnerId;
            return this;
        }

        @java.lang.Override
        public VoiceLibraryVoiceResponse build() {
            return new VoiceLibraryVoiceResponse(
                    voiceId, name, publicOwnerId, description, gender, age, accent, additionalProperties);
        }
    }
}
