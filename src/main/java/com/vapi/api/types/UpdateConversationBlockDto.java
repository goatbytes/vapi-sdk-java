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
@JsonDeserialize(builder = UpdateConversationBlockDto.Builder.class)
public final class UpdateConversationBlockDto {
    private final Optional<List<UpdateConversationBlockDtoMessagesItem>> messages;

    private final Optional<JsonSchema> inputSchema;

    private final Optional<JsonSchema> outputSchema;

    private final Optional<String> name;

    private final Optional<String> instruction;

    private final Map<String, Object> additionalProperties;

    private UpdateConversationBlockDto(
            Optional<List<UpdateConversationBlockDtoMessagesItem>> messages,
            Optional<JsonSchema> inputSchema,
            Optional<JsonSchema> outputSchema,
            Optional<String> name,
            Optional<String> instruction,
            Map<String, Object> additionalProperties) {
        this.messages = messages;
        this.inputSchema = inputSchema;
        this.outputSchema = outputSchema;
        this.name = name;
        this.instruction = instruction;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the pre-configured messages that will be spoken to the user while the block is running.
     */
    @JsonProperty("messages")
    public Optional<List<UpdateConversationBlockDtoMessagesItem>> getMessages() {
        return messages;
    }

    /**
     * @return This is the input schema for the block. This is the input the block needs to run. It's given to the block as <code>steps[0].input</code>
     * <p>These are accessible as variables:</p>
     * <ul>
     * <li>({{input.propertyName}}) in context of the block execution (step)</li>
     * <li>({{stepName.input.propertyName}}) in context of the workflow</li>
     * </ul>
     */
    @JsonProperty("inputSchema")
    public Optional<JsonSchema> getInputSchema() {
        return inputSchema;
    }

    /**
     * @return This is the output schema for the block. This is the output the block will return to the workflow (<code>{{stepName.output}}</code>).
     * <p>These are accessible as variables:</p>
     * <ul>
     * <li>({{output.propertyName}}) in context of the block execution (step)</li>
     * <li>({{stepName.output.propertyName}}) in context of the workflow (read caveat #1)</li>
     * <li>({{blockName.output.propertyName}}) in context of the workflow (read caveat #2)</li>
     * </ul>
     * <p>Caveats:</p>
     * <ol>
     * <li>a workflow can execute a step multiple times. example, if a loop is used in the graph. {{stepName.output.propertyName}} will reference the latest usage of the step.</li>
     * <li>a workflow can execute a block multiple times. example, if a step is called multiple times or if a block is used in multiple steps. {{blockName.output.propertyName}} will reference the latest usage of the block. this liquid variable is just provided for convenience when creating blocks outside of a workflow with steps.</li>
     * </ol>
     */
    @JsonProperty("outputSchema")
    public Optional<JsonSchema> getOutputSchema() {
        return outputSchema;
    }

    /**
     * @return This is the name of the block. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the instruction to the model.
     * <p>You can reference any variable in the context of the current block execution (step):</p>
     * <ul>
     * <li>&quot;{{input.your-property-name}}&quot; for the current step's input</li>
     * <li>&quot;{{your-step-name.output.your-property-name}}&quot; for another step's output (in the same workflow; read caveat #1)</li>
     * <li>&quot;{{your-step-name.input.your-property-name}}&quot; for another step's input (in the same workflow; read caveat #1)</li>
     * <li>&quot;{{your-block-name.output.your-property-name}}&quot; for another block's output (in the same workflow; read caveat #2)</li>
     * <li>&quot;{{your-block-name.input.your-property-name}}&quot; for another block's input (in the same workflow; read caveat #2)</li>
     * <li>&quot;{{workflow.input.your-property-name}}&quot; for the current workflow's input</li>
     * <li>&quot;{{global.your-property-name}}&quot; for the global context</li>
     * </ul>
     * <p>This can be as simple or as complex as you want it to be.</p>
     * <ul>
     * <li>&quot;say hello and ask the user about their day!&quot;</li>
     * <li>&quot;collect the user's first and last name&quot;</li>
     * <li>&quot;user is {{input.firstName}} {{input.lastName}}. their age is {{input.age}}. ask them about their salary and if they might be interested in buying a house. we offer {{input.offer}}&quot;</li>
     * </ul>
     * <p>Caveats:</p>
     * <ol>
     * <li>a workflow can execute a step multiple times. example, if a loop is used in the graph. {{stepName.output/input.propertyName}} will reference the latest usage of the step.</li>
     * <li>a workflow can execute a block multiple times. example, if a step is called multiple times or if a block is used in multiple steps. {{blockName.output/input.propertyName}} will reference the latest usage of the block. this liquid variable is just provided for convenience when creating blocks outside of a workflow with steps.</li>
     * </ol>
     */
    @JsonProperty("instruction")
    public Optional<String> getInstruction() {
        return instruction;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateConversationBlockDto && equalTo((UpdateConversationBlockDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateConversationBlockDto other) {
        return messages.equals(other.messages)
                && inputSchema.equals(other.inputSchema)
                && outputSchema.equals(other.outputSchema)
                && name.equals(other.name)
                && instruction.equals(other.instruction);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.messages, this.inputSchema, this.outputSchema, this.name, this.instruction);
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
        private Optional<List<UpdateConversationBlockDtoMessagesItem>> messages = Optional.empty();

        private Optional<JsonSchema> inputSchema = Optional.empty();

        private Optional<JsonSchema> outputSchema = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> instruction = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateConversationBlockDto other) {
            messages(other.getMessages());
            inputSchema(other.getInputSchema());
            outputSchema(other.getOutputSchema());
            name(other.getName());
            instruction(other.getInstruction());
            return this;
        }

        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public Builder messages(Optional<List<UpdateConversationBlockDtoMessagesItem>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(List<UpdateConversationBlockDtoMessagesItem> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @JsonSetter(value = "inputSchema", nulls = Nulls.SKIP)
        public Builder inputSchema(Optional<JsonSchema> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }

        public Builder inputSchema(JsonSchema inputSchema) {
            this.inputSchema = Optional.ofNullable(inputSchema);
            return this;
        }

        @JsonSetter(value = "outputSchema", nulls = Nulls.SKIP)
        public Builder outputSchema(Optional<JsonSchema> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public Builder outputSchema(JsonSchema outputSchema) {
            this.outputSchema = Optional.ofNullable(outputSchema);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "instruction", nulls = Nulls.SKIP)
        public Builder instruction(Optional<String> instruction) {
            this.instruction = instruction;
            return this;
        }

        public Builder instruction(String instruction) {
            this.instruction = Optional.ofNullable(instruction);
            return this;
        }

        public UpdateConversationBlockDto build() {
            return new UpdateConversationBlockDto(
                    messages, inputSchema, outputSchema, name, instruction, additionalProperties);
        }
    }
}
