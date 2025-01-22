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

@JsonDeserialize(using = WorkflowNodesItem.Deserializer.class)
public final class WorkflowNodesItem {
    private final Object value;

    private final int type;

    private WorkflowNodesItem(Object value, int type) {
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
        return other instanceof WorkflowNodesItem && equalTo((WorkflowNodesItem) other);
    }

    private boolean equalTo(WorkflowNodesItem other) {
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

    public static WorkflowNodesItem of(Say value) {
        return new WorkflowNodesItem(value, 0);
    }

    public static WorkflowNodesItem of(Gather value) {
        return new WorkflowNodesItem(value, 1);
    }

    public static WorkflowNodesItem of(Object value) {
        return new WorkflowNodesItem(value, 2);
    }

    public static WorkflowNodesItem of(CreateWorkflowDto value) {
        return new WorkflowNodesItem(value, 3);
    }

    public interface Visitor<T> {
        T visit(Say value);

        T visit(Gather value);

        T visit(Object value);

        T visit(CreateWorkflowDto value);
    }

    static final class Deserializer extends StdDeserializer<WorkflowNodesItem> {
        Deserializer() {
            super(WorkflowNodesItem.class);
        }

        @java.lang.Override
        public WorkflowNodesItem deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
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
