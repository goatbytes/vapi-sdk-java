/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InviteUserDtoRole {
    ADMIN("admin"),

    EDITOR("editor"),

    VIEWER("viewer");

    private final String value;

    InviteUserDtoRole(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
