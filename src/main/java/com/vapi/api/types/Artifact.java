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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Artifact.Builder.class)
public final class Artifact {
    private final Optional<List<ArtifactMessagesItem>> messages;

    private final Optional<List<OpenAiMessage>> messagesOpenAiFormatted;

    private final Optional<String> recordingUrl;

    private final Optional<String> stereoRecordingUrl;

    private final Optional<String> videoRecordingUrl;

    private final Optional<Double> videoRecordingStartDelaySeconds;

    private final Optional<String> transcript;

    private final Map<String, Object> additionalProperties;

    private Artifact(
            Optional<List<ArtifactMessagesItem>> messages,
            Optional<List<OpenAiMessage>> messagesOpenAiFormatted,
            Optional<String> recordingUrl,
            Optional<String> stereoRecordingUrl,
            Optional<String> videoRecordingUrl,
            Optional<Double> videoRecordingStartDelaySeconds,
            Optional<String> transcript,
            Map<String, Object> additionalProperties) {
        this.messages = messages;
        this.messagesOpenAiFormatted = messagesOpenAiFormatted;
        this.recordingUrl = recordingUrl;
        this.stereoRecordingUrl = stereoRecordingUrl;
        this.videoRecordingUrl = videoRecordingUrl;
        this.videoRecordingStartDelaySeconds = videoRecordingStartDelaySeconds;
        this.transcript = transcript;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the messages that were spoken during the call.
     */
    @JsonProperty("messages")
    public Optional<List<ArtifactMessagesItem>> getMessages() {
        return messages;
    }

    /**
     * @return These are the messages that were spoken during the call, formatted for OpenAI.
     */
    @JsonProperty("messagesOpenAIFormatted")
    public Optional<List<OpenAiMessage>> getMessagesOpenAiFormatted() {
        return messagesOpenAiFormatted;
    }

    /**
     * @return This is the recording url for the call. To enable, set <code>assistant.artifactPlan.recordingEnabled</code>.
     */
    @JsonProperty("recordingUrl")
    public Optional<String> getRecordingUrl() {
        return recordingUrl;
    }

    /**
     * @return This is the stereo recording url for the call. To enable, set <code>assistant.artifactPlan.recordingEnabled</code>.
     */
    @JsonProperty("stereoRecordingUrl")
    public Optional<String> getStereoRecordingUrl() {
        return stereoRecordingUrl;
    }

    /**
     * @return This is video recording url for the call. To enable, set <code>assistant.artifactPlan.videoRecordingEnabled</code>.
     */
    @JsonProperty("videoRecordingUrl")
    public Optional<String> getVideoRecordingUrl() {
        return videoRecordingUrl;
    }

    /**
     * @return This is video recording start delay in ms. To enable, set <code>assistant.artifactPlan.videoRecordingEnabled</code>. This can be used to align the playback of the recording with artifact.messages timestamps.
     */
    @JsonProperty("videoRecordingStartDelaySeconds")
    public Optional<Double> getVideoRecordingStartDelaySeconds() {
        return videoRecordingStartDelaySeconds;
    }

    /**
     * @return This is the transcript of the call. This is derived from <code>artifact.messages</code> but provided for convenience.
     */
    @JsonProperty("transcript")
    public Optional<String> getTranscript() {
        return transcript;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Artifact && equalTo((Artifact) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Artifact other) {
        return messages.equals(other.messages)
                && messagesOpenAiFormatted.equals(other.messagesOpenAiFormatted)
                && recordingUrl.equals(other.recordingUrl)
                && stereoRecordingUrl.equals(other.stereoRecordingUrl)
                && videoRecordingUrl.equals(other.videoRecordingUrl)
                && videoRecordingStartDelaySeconds.equals(other.videoRecordingStartDelaySeconds)
                && transcript.equals(other.transcript);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.messages,
                this.messagesOpenAiFormatted,
                this.recordingUrl,
                this.stereoRecordingUrl,
                this.videoRecordingUrl,
                this.videoRecordingStartDelaySeconds,
                this.transcript);
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
        private Optional<List<ArtifactMessagesItem>> messages = Optional.empty();

        private Optional<List<OpenAiMessage>> messagesOpenAiFormatted = Optional.empty();

        private Optional<String> recordingUrl = Optional.empty();

        private Optional<String> stereoRecordingUrl = Optional.empty();

        private Optional<String> videoRecordingUrl = Optional.empty();

        private Optional<Double> videoRecordingStartDelaySeconds = Optional.empty();

        private Optional<String> transcript = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Artifact other) {
            messages(other.getMessages());
            messagesOpenAiFormatted(other.getMessagesOpenAiFormatted());
            recordingUrl(other.getRecordingUrl());
            stereoRecordingUrl(other.getStereoRecordingUrl());
            videoRecordingUrl(other.getVideoRecordingUrl());
            videoRecordingStartDelaySeconds(other.getVideoRecordingStartDelaySeconds());
            transcript(other.getTranscript());
            return this;
        }

        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public Builder messages(Optional<List<ArtifactMessagesItem>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(List<ArtifactMessagesItem> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @JsonSetter(value = "messagesOpenAIFormatted", nulls = Nulls.SKIP)
        public Builder messagesOpenAiFormatted(Optional<List<OpenAiMessage>> messagesOpenAiFormatted) {
            this.messagesOpenAiFormatted = messagesOpenAiFormatted;
            return this;
        }

        public Builder messagesOpenAiFormatted(List<OpenAiMessage> messagesOpenAiFormatted) {
            this.messagesOpenAiFormatted = Optional.ofNullable(messagesOpenAiFormatted);
            return this;
        }

        @JsonSetter(value = "recordingUrl", nulls = Nulls.SKIP)
        public Builder recordingUrl(Optional<String> recordingUrl) {
            this.recordingUrl = recordingUrl;
            return this;
        }

        public Builder recordingUrl(String recordingUrl) {
            this.recordingUrl = Optional.ofNullable(recordingUrl);
            return this;
        }

        @JsonSetter(value = "stereoRecordingUrl", nulls = Nulls.SKIP)
        public Builder stereoRecordingUrl(Optional<String> stereoRecordingUrl) {
            this.stereoRecordingUrl = stereoRecordingUrl;
            return this;
        }

        public Builder stereoRecordingUrl(String stereoRecordingUrl) {
            this.stereoRecordingUrl = Optional.ofNullable(stereoRecordingUrl);
            return this;
        }

        @JsonSetter(value = "videoRecordingUrl", nulls = Nulls.SKIP)
        public Builder videoRecordingUrl(Optional<String> videoRecordingUrl) {
            this.videoRecordingUrl = videoRecordingUrl;
            return this;
        }

        public Builder videoRecordingUrl(String videoRecordingUrl) {
            this.videoRecordingUrl = Optional.ofNullable(videoRecordingUrl);
            return this;
        }

        @JsonSetter(value = "videoRecordingStartDelaySeconds", nulls = Nulls.SKIP)
        public Builder videoRecordingStartDelaySeconds(Optional<Double> videoRecordingStartDelaySeconds) {
            this.videoRecordingStartDelaySeconds = videoRecordingStartDelaySeconds;
            return this;
        }

        public Builder videoRecordingStartDelaySeconds(Double videoRecordingStartDelaySeconds) {
            this.videoRecordingStartDelaySeconds = Optional.ofNullable(videoRecordingStartDelaySeconds);
            return this;
        }

        @JsonSetter(value = "transcript", nulls = Nulls.SKIP)
        public Builder transcript(Optional<String> transcript) {
            this.transcript = transcript;
            return this;
        }

        public Builder transcript(String transcript) {
            this.transcript = Optional.ofNullable(transcript);
            return this;
        }

        public Artifact build() {
            return new Artifact(
                    messages,
                    messagesOpenAiFormatted,
                    recordingUrl,
                    stereoRecordingUrl,
                    videoRecordingUrl,
                    videoRecordingStartDelaySeconds,
                    transcript,
                    additionalProperties);
        }
    }
}
