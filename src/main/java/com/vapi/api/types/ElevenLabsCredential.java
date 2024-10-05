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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ElevenLabsCredential.Builder.class)
public final class ElevenLabsCredential {
    private final String apiKey;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private ElevenLabsCredential(
            String apiKey,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "11labs";
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @return This is the unique identifier for the credential.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the org that this credential belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the credential was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the assistant was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ElevenLabsCredential && equalTo((ElevenLabsCredential) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ElevenLabsCredential other) {
        return apiKey.equals(other.apiKey)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.id, this.orgId, this.createdAt, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ApiKeyStage builder() {
        return new Builder();
    }

    public interface ApiKeyStage {
        IdStage apiKey(@NotNull String apiKey);

        Builder from(ElevenLabsCredential other);
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ElevenLabsCredential build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ApiKeyStage, IdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String apiKey;

        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ElevenLabsCredential other) {
            apiKey(other.getApiKey());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("apiKey")
        public IdStage apiKey(@NotNull String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey, "apiKey must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the credential.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the org that this credential belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the credential was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the assistant was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        public ElevenLabsCredential build() {
            return new ElevenLabsCredential(apiKey, id, orgId, createdAt, updatedAt, additionalProperties);
        }
    }
}
