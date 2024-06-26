package infres.ws.rest.controller;

//import org.hibernate.mapping.Map;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class OAuth2Controller {

    @GetMapping("/loginSuccess")
    public String getLoginInfo(OAuth2AuthenticationToken authentication) {
        DefaultOidcUser oidcUser = (DefaultOidcUser) authentication.getPrincipal();
        Map<String, Object> userAttributes = oidcUser.getAttributes();
        return "User Info: " + userAttributes.toString();
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page. <a href='/oauth2/authorization/google'>Login with Google</a>";
    }
}
