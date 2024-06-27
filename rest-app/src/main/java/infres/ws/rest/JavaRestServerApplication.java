package infres.ws.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "infres.ws.rest")
public class JavaRestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaRestServerApplication.class, args);
    }
}