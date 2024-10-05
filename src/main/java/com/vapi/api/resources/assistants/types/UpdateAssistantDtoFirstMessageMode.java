/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.assistants.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UpdateAssistantDtoFirstMessageMode {
    ASSISTANT_SPEAKS_FIRST("assistant-speaks-first"),

    ASSISTANT_SPEAKS_FIRST_WITH_MODEL_GENERATED_MESSAGE("assistant-speaks-first-with-model-generated-message"),

    ASSISTANT_WAITS_FOR_USER("assistant-waits-for-user");

    private final String value;

    UpdateAssistantDtoFirstMessageMode(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
