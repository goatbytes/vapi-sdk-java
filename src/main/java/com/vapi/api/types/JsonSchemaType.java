/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JsonSchemaType {
    STRING("string"),

    NUMBER("number"),

    INTEGER("integer"),

    BOOLEAN("boolean"),

    ARRAY("array"),

    OBJECT("object");

    private final String value;

    JsonSchemaType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
