/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeepgramTranscriberModel {
    NOVA_2("nova-2"),

    NOVA_2_GENERAL("nova-2-general"),

    NOVA_2_MEETING("nova-2-meeting"),

    NOVA_2_PHONECALL("nova-2-phonecall"),

    NOVA_2_FINANCE("nova-2-finance"),

    NOVA_2_CONVERSATIONALAI("nova-2-conversationalai"),

    NOVA_2_VOICEMAIL("nova-2-voicemail"),

    NOVA_2_VIDEO("nova-2-video"),

    NOVA_2_MEDICAL("nova-2-medical"),

    NOVA_2_DRIVETHRU("nova-2-drivethru"),

    NOVA_2_AUTOMOTIVE("nova-2-automotive"),

    NOVA("nova"),

    NOVA_GENERAL("nova-general"),

    NOVA_PHONECALL("nova-phonecall"),

    NOVA_MEDICAL("nova-medical"),

    ENHANCED("enhanced"),

    ENHANCED_GENERAL("enhanced-general"),

    ENHANCED_MEETING("enhanced-meeting"),

    ENHANCED_PHONECALL("enhanced-phonecall"),

    ENHANCED_FINANCE("enhanced-finance"),

    BASE("base"),

    BASE_GENERAL("base-general"),

    BASE_MEETING("base-meeting"),

    BASE_PHONECALL("base-phonecall"),

    BASE_FINANCE("base-finance"),

    BASE_CONVERSATIONALAI("base-conversationalai"),

    BASE_VOICEMAIL("base-voicemail"),

    BASE_VIDEO("base-video");

    private final String value;

    DeepgramTranscriberModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
