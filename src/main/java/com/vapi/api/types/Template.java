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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Template.Builder.class)
public final class Template {
    private final Optional<TemplateDetails> details;

    private final Optional<TemplateProviderDetails> providerDetails;

    private final Optional<ToolTemplateMetadata> metadata;

    private final Optional<TemplateVisibility> visibility;

    private final Optional<String> name;

    private final Optional<TemplateProvider> provider;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private Template(
            Optional<TemplateDetails> details,
            Optional<TemplateProviderDetails> providerDetails,
            Optional<ToolTemplateMetadata> metadata,
            Optional<TemplateVisibility> visibility,
            Optional<String> name,
            Optional<TemplateProvider> provider,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this.details = details;
        this.providerDetails = providerDetails;
        this.metadata = metadata;
        this.visibility = visibility;
        this.name = name;
        this.provider = provider;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("details")
    public Optional<TemplateDetails> getDetails() {
        return details;
    }

    @JsonProperty("providerDetails")
    public Optional<TemplateProviderDetails> getProviderDetails() {
        return providerDetails;
    }

    @JsonProperty("metadata")
    public Optional<ToolTemplateMetadata> getMetadata() {
        return metadata;
    }

    @JsonProperty("visibility")
    public Optional<TemplateVisibility> getVisibility() {
        return visibility;
    }

    @JsonProperty("type")
    public String getType() {
        return "tool";
    }

    /**
     * @return The name of the template. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("provider")
    public Optional<TemplateProvider> getProvider() {
        return provider;
    }

    /**
     * @return The unique identifier for the template.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The unique identifier for the organization that this template belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return The ISO 8601 date-time string of when the template was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return The ISO 8601 date-time string of when the template was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Template && equalTo((Template) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Template other) {
        return details.equals(other.details)
                && providerDetails.equals(other.providerDetails)
                && metadata.equals(other.metadata)
                && visibility.equals(other.visibility)
                && name.equals(other.name)
                && provider.equals(other.provider)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.details,
                this.providerDetails,
                this.metadata,
                this.visibility,
                this.name,
                this.provider,
                this.id,
                this.orgId,
                this.createdAt,
                this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);

        Builder from(Template other);
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
        Template build();

        _FinalStage details(Optional<TemplateDetails> details);

        _FinalStage details(TemplateDetails details);

        _FinalStage providerDetails(Optional<TemplateProviderDetails> providerDetails);

        _FinalStage providerDetails(TemplateProviderDetails providerDetails);

        _FinalStage metadata(Optional<ToolTemplateMetadata> metadata);

        _FinalStage metadata(ToolTemplateMetadata metadata);

        _FinalStage visibility(Optional<TemplateVisibility> visibility);

        _FinalStage visibility(TemplateVisibility visibility);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage provider(Optional<TemplateProvider> provider);

        _FinalStage provider(TemplateProvider provider);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<TemplateProvider> provider = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<TemplateVisibility> visibility = Optional.empty();

        private Optional<ToolTemplateMetadata> metadata = Optional.empty();

        private Optional<TemplateProviderDetails> providerDetails = Optional.empty();

        private Optional<TemplateDetails> details = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Template other) {
            details(other.getDetails());
            providerDetails(other.getProviderDetails());
            metadata(other.getMetadata());
            visibility(other.getVisibility());
            name(other.getName());
            provider(other.getProvider());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>The unique identifier for the template.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>The unique identifier for the organization that this template belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>The ISO 8601 date-time string of when the template was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>The ISO 8601 date-time string of when the template was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage provider(TemplateProvider provider) {
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<TemplateProvider> provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>The name of the template. This is just for your own reference.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public _FinalStage visibility(TemplateVisibility visibility) {
            this.visibility = Optional.ofNullable(visibility);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "visibility", nulls = Nulls.SKIP)
        public _FinalStage visibility(Optional<TemplateVisibility> visibility) {
            this.visibility = visibility;
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(ToolTemplateMetadata metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<ToolTemplateMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage providerDetails(TemplateProviderDetails providerDetails) {
            this.providerDetails = Optional.ofNullable(providerDetails);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "providerDetails", nulls = Nulls.SKIP)
        public _FinalStage providerDetails(Optional<TemplateProviderDetails> providerDetails) {
            this.providerDetails = providerDetails;
            return this;
        }

        @java.lang.Override
        public _FinalStage details(TemplateDetails details) {
            this.details = Optional.ofNullable(details);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "details", nulls = Nulls.SKIP)
        public _FinalStage details(Optional<TemplateDetails> details) {
            this.details = details;
            return this;
        }

        @java.lang.Override
        public Template build() {
            return new Template(
                    details,
                    providerDetails,
                    metadata,
                    visibility,
                    name,
                    provider,
                    id,
                    orgId,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}
