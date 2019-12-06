package watsonassistant;

import com.fasterxml.jackson.databind.JsonNode;

public class WatsonAssistantMessage {
    private JsonNode output;
    private JsonNode generic;
    private JsonNode intents;
    private JsonNode entities;
    private String sessionId;

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public JsonNode getIntents() {
        return this.output.get("intents");
    }

    public void setIntents(JsonNode intents) {
        this.intents = intents;
    }

    public JsonNode getEntities() {
        return this.output.get("entities");
    }

    public void setEntities(JsonNode entities) {
        this.entities = entities;
    }

    public JsonNode getOutput() {
        return output;
    }

    public void setOutput(JsonNode output) {
        this.output = output;
    }

    public JsonNode getGeneric() {
        return this.output.get("generic");
    }

    public void setGeneric(JsonNode generic) {
        this.generic = generic;
    }
}
