/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AssistantClientMessagesItem {
    CONVERSATION_UPDATE("conversation-update"),

    FUNCTION_CALL("function-call"),

    FUNCTION_CALL_RESULT("function-call-result"),

    HANG("hang"),

    LANGUAGE_CHANGED("language-changed"),

    METADATA("metadata"),

    MODEL_OUTPUT("model-output"),

    SPEECH_UPDATE("speech-update"),

    STATUS_UPDATE("status-update"),

    TRANSCRIPT("transcript"),

    TOOL_CALLS("tool-calls"),

    TOOL_CALLS_RESULT("tool-calls-result"),

    USER_INTERRUPTED("user-interrupted"),

    VOICE_INPUT("voice-input");

    private final String value;

    AssistantClientMessagesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
