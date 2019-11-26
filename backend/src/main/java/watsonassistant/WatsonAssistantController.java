package main.java.watsonassistant;

import org.springframework.web.bind.annotation.*;

@RestController
public class WatsonAssistantController {

    @RequestMapping(value="/send", method = RequestMethod.GET)
    public String send(@RequestParam("message") String message) {

        return message;

    }

}


