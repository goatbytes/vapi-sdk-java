/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.logs.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LogsGetRequestType {
    API("API"),

    WEBHOOK("Webhook"),

    CALL("Call"),

    PROVIDER("Provider");

    private final String value;

    LogsGetRequestType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
