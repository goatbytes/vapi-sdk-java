/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PlayHtVoiceEmotion {
    FEMALE_HAPPY("female_happy"),

    FEMALE_SAD("female_sad"),

    FEMALE_ANGRY("female_angry"),

    FEMALE_FEARFUL("female_fearful"),

    FEMALE_DISGUST("female_disgust"),

    FEMALE_SURPRISED("female_surprised"),

    MALE_HAPPY("male_happy"),

    MALE_SAD("male_sad"),

    MALE_ANGRY("male_angry"),

    MALE_FEARFUL("male_fearful"),

    MALE_DISGUST("male_disgust"),

    MALE_SURPRISED("male_surprised");

    private final String value;

    PlayHtVoiceEmotion(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
