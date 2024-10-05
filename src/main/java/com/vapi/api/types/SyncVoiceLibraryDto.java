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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SyncVoiceLibraryDto.Builder.class)
public final class SyncVoiceLibraryDto {
    private final Optional<List<SyncVoiceLibraryDtoProvidersItem>> providers;

    private final Map<String, Object> additionalProperties;

    private SyncVoiceLibraryDto(
            Optional<List<SyncVoiceLibraryDtoProvidersItem>> providers, Map<String, Object> additionalProperties) {
        this.providers = providers;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return List of providers you want to sync.
     */
    @JsonProperty("providers")
    public Optional<List<SyncVoiceLibraryDtoProvidersItem>> getProviders() {
        return providers;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SyncVoiceLibraryDto && equalTo((SyncVoiceLibraryDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SyncVoiceLibraryDto other) {
        return providers.equals(other.providers);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.providers);
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
        private Optional<List<SyncVoiceLibraryDtoProvidersItem>> providers = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SyncVoiceLibraryDto other) {
            providers(other.getProviders());
            return this;
        }

        @JsonSetter(value = "providers", nulls = Nulls.SKIP)
        public Builder providers(Optional<List<SyncVoiceLibraryDtoProvidersItem>> providers) {
            this.providers = providers;
            return this;
        }

        public Builder providers(List<SyncVoiceLibraryDtoProvidersItem> providers) {
            this.providers = Optional.ofNullable(providers);
            return this;
        }

        public SyncVoiceLibraryDto build() {
            return new SyncVoiceLibraryDto(providers, additionalProperties);
        }
    }
}
