/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClientInboundMessageControlControl {
    MUTE_ASSISTANT("mute-assistant"),

    UNMUTE_ASSISTANT("unmute-assistant"),

    SAY_FIRST_MESSAGE("say-first-message");

    private final String value;

    ClientInboundMessageControlControl(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
