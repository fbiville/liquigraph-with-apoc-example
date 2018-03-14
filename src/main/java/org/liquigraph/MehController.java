package org.liquigraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MehController {

    @GetMapping(value = "/", produces = "text/plain")
    String home() {
        return "meh";
    }

    public static void main(String[] args) {
        SpringApplication.run(MehController.class, args);
    }
}