package main.java.watsonassistant;

public class WatsonAssistantConfig {

    private String apikey;
    private String id;
    private String url;
    private String versionDate;

    // Getters
    public String getApikey() {
        return apikey;
    }
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getVersionDate() {
        return versionDate;
    }
    // Setters
    public void setApikey(String apikey) { this.apikey = apikey; }
    public void setId(String id) { this.id = id; }
    public void setUrl(String url) { this.url = url; }
    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }
}
