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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TrieveKnowledgeBaseCreate.Builder.class)
public final class TrieveKnowledgeBaseCreate {
    private final List<TrieveKnowledgeBaseChunkPlan> chunkPlans;

    private final Map<String, Object> additionalProperties;

    private TrieveKnowledgeBaseCreate(
            List<TrieveKnowledgeBaseChunkPlan> chunkPlans, Map<String, Object> additionalProperties) {
        this.chunkPlans = chunkPlans;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the chunk plans used to create the dataset.
     */
    @JsonProperty("chunkPlans")
    public List<TrieveKnowledgeBaseChunkPlan> getChunkPlans() {
        return chunkPlans;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TrieveKnowledgeBaseCreate && equalTo((TrieveKnowledgeBaseCreate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TrieveKnowledgeBaseCreate other) {
        return chunkPlans.equals(other.chunkPlans);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.chunkPlans);
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
        private List<TrieveKnowledgeBaseChunkPlan> chunkPlans = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TrieveKnowledgeBaseCreate other) {
            chunkPlans(other.getChunkPlans());
            return this;
        }

        @JsonSetter(value = "chunkPlans", nulls = Nulls.SKIP)
        public Builder chunkPlans(List<TrieveKnowledgeBaseChunkPlan> chunkPlans) {
            this.chunkPlans.clear();
            this.chunkPlans.addAll(chunkPlans);
            return this;
        }

        public Builder addChunkPlans(TrieveKnowledgeBaseChunkPlan chunkPlans) {
            this.chunkPlans.add(chunkPlans);
            return this;
        }

        public Builder addAllChunkPlans(List<TrieveKnowledgeBaseChunkPlan> chunkPlans) {
            this.chunkPlans.addAll(chunkPlans);
            return this;
        }

        public TrieveKnowledgeBaseCreate build() {
            return new TrieveKnowledgeBaseCreate(chunkPlans, additionalProperties);
        }
    }
}
