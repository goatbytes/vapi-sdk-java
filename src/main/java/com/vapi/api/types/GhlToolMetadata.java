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
@JsonDeserialize(builder = GhlToolMetadata.Builder.class)
public final class GhlToolMetadata {
    private final Optional<String> workflowId;

    private final Optional<String> locationId;

    private final Map<String, Object> additionalProperties;

    private GhlToolMetadata(
            Optional<String> workflowId, Optional<String> locationId, Map<String, Object> additionalProperties) {
        this.workflowId = workflowId;
        this.locationId = locationId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("workflowId")
    public Optional<String> getWorkflowId() {
        return workflowId;
    }

    @JsonProperty("locationId")
    public Optional<String> getLocationId() {
        return locationId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GhlToolMetadata && equalTo((GhlToolMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GhlToolMetadata other) {
        return workflowId.equals(other.workflowId) && locationId.equals(other.locationId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.workflowId, this.locationId);
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
        private Optional<String> workflowId = Optional.empty();

        private Optional<String> locationId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GhlToolMetadata other) {
            workflowId(other.getWorkflowId());
            locationId(other.getLocationId());
            return this;
        }

        @JsonSetter(value = "workflowId", nulls = Nulls.SKIP)
        public Builder workflowId(Optional<String> workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public Builder workflowId(String workflowId) {
            this.workflowId = Optional.ofNullable(workflowId);
            return this;
        }

        @JsonSetter(value = "locationId", nulls = Nulls.SKIP)
        public Builder locationId(Optional<String> locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder locationId(String locationId) {
            this.locationId = Optional.ofNullable(locationId);
            return this;
        }

        public GhlToolMetadata build() {
            return new GhlToolMetadata(workflowId, locationId, additionalProperties);
        }
    }
}
