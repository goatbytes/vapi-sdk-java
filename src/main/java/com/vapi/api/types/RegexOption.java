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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = RegexOption.Builder.class)
public final class RegexOption {
    private final RegexOptionType type;

    private final boolean enabled;

    private final Map<String, Object> additionalProperties;

    private RegexOption(RegexOptionType type, boolean enabled, Map<String, Object> additionalProperties) {
        this.type = type;
        this.enabled = enabled;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of the regex option. Options are:
     * <ul>
     * <li><code>ignore-case</code>: Ignores the case of the text being matched.</li>
     * <li><code>whole-word</code>: Matches whole words only.</li>
     * <li><code>multi-line</code>: Matches across multiple lines.</li>
     * </ul>
     */
    @JsonProperty("type")
    public RegexOptionType getType() {
        return type;
    }

    /**
     * @return This is whether to enable the option.
     * <p>@default false</p>
     */
    @JsonProperty("enabled")
    public boolean getEnabled() {
        return enabled;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RegexOption && equalTo((RegexOption) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RegexOption other) {
        return type.equals(other.type) && enabled == other.enabled;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.enabled);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        EnabledStage type(@NotNull RegexOptionType type);

        Builder from(RegexOption other);
    }

    public interface EnabledStage {
        _FinalStage enabled(boolean enabled);
    }

    public interface _FinalStage {
        RegexOption build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, EnabledStage, _FinalStage {
        private RegexOptionType type;

        private boolean enabled;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RegexOption other) {
            type(other.getType());
            enabled(other.getEnabled());
            return this;
        }

        /**
         * <p>This is the type of the regex option. Options are:</p>
         * <ul>
         * <li><code>ignore-case</code>: Ignores the case of the text being matched.</li>
         * <li><code>whole-word</code>: Matches whole words only.</li>
         * <li><code>multi-line</code>: Matches across multiple lines.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("type")
        public EnabledStage type(@NotNull RegexOptionType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * <p>This is whether to enable the option.</p>
         * <p>@default false</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("enabled")
        public _FinalStage enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        @java.lang.Override
        public RegexOption build() {
            return new RegexOption(type, enabled, additionalProperties);
        }
    }
}
