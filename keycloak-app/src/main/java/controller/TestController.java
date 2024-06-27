package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Renvoie à la vue login.html
    }

}