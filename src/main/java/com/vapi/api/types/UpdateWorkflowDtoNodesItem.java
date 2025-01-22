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

@JsonDeserialize(using = UpdateWorkflowDtoNodesItem.Deserializer.class)
public final class UpdateWorkflowDtoNodesItem {
    private final Object value;

    private final int type;

    private UpdateWorkflowDtoNodesItem(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((Say) this.value);
        } else if (this.type == 1) {
            return visitor.visit((Gather) this.value);
        } else if (this.type == 2) {
            return visitor.visit((Object) this.value);
        } else if (this.type == 3) {
            return visitor.visit((CreateWorkflowDto) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateWorkflowDtoNodesItem && equalTo((UpdateWorkflowDtoNodesItem) other);
    }

    private boolean equalTo(UpdateWorkflowDtoNodesItem other) {
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

    public static UpdateWorkflowDtoNodesItem of(Say value) {
        return new UpdateWorkflowDtoNodesItem(value, 0);
    }

    public static UpdateWorkflowDtoNodesItem of(Gather value) {
        return new UpdateWorkflowDtoNodesItem(value, 1);
    }

    public static UpdateWorkflowDtoNodesItem of(Object value) {
        return new UpdateWorkflowDtoNodesItem(value, 2);
    }

    public static UpdateWorkflowDtoNodesItem of(CreateWorkflowDto value) {
        return new UpdateWorkflowDtoNodesItem(value, 3);
    }

    public interface Visitor<T> {
        T visit(Say value);

        T visit(Gather value);

        T visit(Object value);

        T visit(CreateWorkflowDto value);
    }

    static final class Deserializer extends StdDeserializer<UpdateWorkflowDtoNodesItem> {
        Deserializer() {
            super(UpdateWorkflowDtoNodesItem.class);
        }

        @java.lang.Override
        public UpdateWorkflowDtoNodesItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Say.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Gather.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, Object.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, CreateWorkflowDto.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
