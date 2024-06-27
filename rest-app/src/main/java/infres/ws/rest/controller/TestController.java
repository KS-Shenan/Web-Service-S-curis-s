package infres.ws.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testKey")
    public String testKey() {
        return "Keycloak configuration is successful!";
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint";
    }
}