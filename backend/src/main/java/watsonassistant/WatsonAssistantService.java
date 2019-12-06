package watsonassistant;

import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.*;
import org.springframework.stereotype.Service;

@Service
public class WatsonAssistantService {

    private final WatsonAssistantConfig config;
    private SessionResponse session;
    private Assistant service;

    public WatsonAssistantService(WatsonAssistantConfig config) {
        this.config = config;
    }

    private Assistant connect() {

        try {
            Authenticator authenticator = new IamAuthenticator(config.getApikey());
            Assistant service = new Assistant(config.getVersionDate(), authenticator);
            service.setServiceUrl(config.getUrl());

            return service;
        } catch (Error e) {
            throw new Error(e);
        }
    }

}

