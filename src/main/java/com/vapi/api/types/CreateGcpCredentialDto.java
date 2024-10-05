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
@JsonDeserialize(builder = CreateGcpCredentialDto.Builder.class)
public final class CreateGcpCredentialDto {
    private final Optional<String> name;

    private final GcpKey gcpKey;

    private final Optional<BucketPlan> bucketPlan;

    private final Map<String, Object> additionalProperties;

    private CreateGcpCredentialDto(
            Optional<String> name,
            GcpKey gcpKey,
            Optional<BucketPlan> bucketPlan,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.gcpKey = gcpKey;
        this.bucketPlan = bucketPlan;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "gcp";
    }

    /**
     * @return This is the name of the GCP credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the GCP key. This is the JSON that can be generated in the Google Cloud Console at https://console.cloud.google.com/iam-admin/serviceaccounts/details/&lt;service-account-id&gt;/keys.
     * <p>The schema is identical to the JSON that GCP outputs.</p>
     */
    @JsonProperty("gcpKey")
    public GcpKey getGcpKey() {
        return gcpKey;
    }

    /**
     * @return This is the bucket plan that can be provided to store call artifacts in GCP.
     */
    @JsonProperty("bucketPlan")
    public Optional<BucketPlan> getBucketPlan() {
        return bucketPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateGcpCredentialDto && equalTo((CreateGcpCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateGcpCredentialDto other) {
        return name.equals(other.name) && gcpKey.equals(other.gcpKey) && bucketPlan.equals(other.bucketPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.gcpKey, this.bucketPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static GcpKeyStage builder() {
        return new Builder();
    }

    public interface GcpKeyStage {
        _FinalStage gcpKey(@NotNull GcpKey gcpKey);

        Builder from(CreateGcpCredentialDto other);
    }

    public interface _FinalStage {
        CreateGcpCredentialDto build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage bucketPlan(Optional<BucketPlan> bucketPlan);

        _FinalStage bucketPlan(BucketPlan bucketPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements GcpKeyStage, _FinalStage {
        private GcpKey gcpKey;

        private Optional<BucketPlan> bucketPlan = Optional.empty();

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateGcpCredentialDto other) {
            name(other.getName());
            gcpKey(other.getGcpKey());
            bucketPlan(other.getBucketPlan());
            return this;
        }

        /**
         * <p>This is the GCP key. This is the JSON that can be generated in the Google Cloud Console at https://console.cloud.google.com/iam-admin/serviceaccounts/details/&lt;service-account-id&gt;/keys.</p>
         * <p>The schema is identical to the JSON that GCP outputs.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("gcpKey")
        public _FinalStage gcpKey(@NotNull GcpKey gcpKey) {
            this.gcpKey = Objects.requireNonNull(gcpKey, "gcpKey must not be null");
            return this;
        }

        /**
         * <p>This is the bucket plan that can be provided to store call artifacts in GCP.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage bucketPlan(BucketPlan bucketPlan) {
            this.bucketPlan = Optional.ofNullable(bucketPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bucketPlan", nulls = Nulls.SKIP)
        public _FinalStage bucketPlan(Optional<BucketPlan> bucketPlan) {
            this.bucketPlan = bucketPlan;
            return this;
        }

        /**
         * <p>This is the name of the GCP credential. This is just for your reference.</p>
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
        public CreateGcpCredentialDto build() {
            return new CreateGcpCredentialDto(name, gcpKey, bucketPlan, additionalProperties);
        }
    }
}
