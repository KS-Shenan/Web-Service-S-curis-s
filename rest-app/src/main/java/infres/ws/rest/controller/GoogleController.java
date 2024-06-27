package infres.ws.rest.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GoogleController {

    @GetMapping("/callGoogleApi")
    public String callGoogleApi(@RegisteredOAuth2AuthorizedClient("google") OAuth2AuthorizedClient authorizedClient,
                                @AuthenticationPrincipal OidcUser oidcUser) {
        OAuth2AccessToken accessToken = authorizedClient.getAccessToken();

        // Vous pouvez maintenant utiliser le jeton pour appeler l'API Google
        String url = "https://www.googleapis.com/oauth2/v3/userinfo";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url + "?access_token=" + accessToken.getTokenValue(), String.class);

        return result;
    }

    @GetMapping("/testKeys")
    public String testKey() {
        return "Keycloak configuration is successful!";
    }
}