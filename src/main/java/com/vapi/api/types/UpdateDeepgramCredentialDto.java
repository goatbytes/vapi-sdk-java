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
@JsonDeserialize(builder = UpdateDeepgramCredentialDto.Builder.class)
public final class UpdateDeepgramCredentialDto {
    private final String apiKey;

    private final Optional<String> apiUrl;

    private final Map<String, Object> additionalProperties;

    private UpdateDeepgramCredentialDto(
            String apiKey, Optional<String> apiUrl, Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.apiUrl = apiUrl;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "deepgram";
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @return This can be used to point to an onprem Deepgram instance. Defaults to api.deepgram.com.
     */
    @JsonProperty("apiUrl")
    public Optional<String> getApiUrl() {
        return apiUrl;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateDeepgramCredentialDto && equalTo((UpdateDeepgramCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateDeepgramCredentialDto other) {
        return apiKey.equals(other.apiKey) && apiUrl.equals(other.apiUrl);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.apiUrl);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ApiKeyStage builder() {
        return new Builder();
    }

    public interface ApiKeyStage {
        _FinalStage apiKey(@NotNull String apiKey);

        Builder from(UpdateDeepgramCredentialDto other);
    }

    public interface _FinalStage {
        UpdateDeepgramCredentialDto build();

        _FinalStage apiUrl(Optional<String> apiUrl);

        _FinalStage apiUrl(String apiUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ApiKeyStage, _FinalStage {
        private String apiKey;

        private Optional<String> apiUrl = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UpdateDeepgramCredentialDto other) {
            apiKey(other.getApiKey());
            apiUrl(other.getApiUrl());
            return this;
        }

        /**
         * <p>This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("apiKey")
        public _FinalStage apiKey(@NotNull String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey, "apiKey must not be null");
            return this;
        }

        /**
         * <p>This can be used to point to an onprem Deepgram instance. Defaults to api.deepgram.com.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage apiUrl(String apiUrl) {
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "apiUrl", nulls = Nulls.SKIP)
        public _FinalStage apiUrl(Optional<String> apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        @java.lang.Override
        public UpdateDeepgramCredentialDto build() {
            return new UpdateDeepgramCredentialDto(apiKey, apiUrl, additionalProperties);
        }
    }
}
