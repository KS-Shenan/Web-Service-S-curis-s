package infres.ws.rest.example.config;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        packages("infres.ws.rest.service");
    }
}