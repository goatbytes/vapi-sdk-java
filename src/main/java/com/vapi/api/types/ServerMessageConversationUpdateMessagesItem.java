/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.vapi.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = ServerMessageConversationUpdateMessagesItem.Deserializer.class)
public final class ServerMessageConversationUpdateMessagesItem {
    private final Object value;

    private final int type;

    private ServerMessageConversationUpdateMessagesItem(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((UserMessage) this.value);
        } else if (this.type == 1) {
            return visitor.visit((SystemMessage) this.value);
        } else if (this.type == 2) {
            return visitor.visit((BotMessage) this.value);
        } else if (this.type == 3) {
            return visitor.visit((ToolCallMessage) this.value);
        } else if (this.type == 4) {
            return visitor.visit((ToolCallResultMessage) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageConversationUpdateMessagesItem
                && equalTo((ServerMessageConversationUpdateMessagesItem) other);
    }

    private boolean equalTo(ServerMessageConversationUpdateMessagesItem other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static ServerMessageConversationUpdateMessagesItem of(UserMessage value) {
        return new ServerMessageConversationUpdateMessagesItem(value, 0);
    }

    public static ServerMessageConversationUpdateMessagesItem of(SystemMessage value) {
        return new ServerMessageConversationUpdateMessagesItem(value, 1);
    }

    public static ServerMessageConversationUpdateMessagesItem of(BotMessage value) {
        return new ServerMessageConversationUpdateMessagesItem(value, 2);
    }

    public static ServerMessageConversationUpdateMessagesItem of(ToolCallMessage value) {
        return new ServerMessageConversationUpdateMessagesItem(value, 3);
    }

    public static ServerMessageConversationUpdateMessagesItem of(ToolCallResultMessage value) {
        return new ServerMessageConversationUpdateMessagesItem(value, 4);
    }

    public interface Visitor<T> {
        T visit(UserMessage value);

        T visit(SystemMessage value);

        T visit(BotMessage value);

        T visit(ToolCallMessage value);

        T visit(ToolCallResultMessage value);
    }

    static final class Deserializer extends StdDeserializer<ServerMessageConversationUpdateMessagesItem> {
        Deserializer() {
            super(ServerMessageConversationUpdateMessagesItem.class);
        }

        @java.lang.Override
        public ServerMessageConversationUpdateMessagesItem deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, UserMessage.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SystemMessage.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, BotMessage.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ToolCallMessage.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ToolCallResultMessage.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
