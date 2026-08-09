package com.github.luizns.demogithubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello from Java 21 + Spring Boot!",
                "java", System.getProperty("java.version"),
                "ci", "GitHub Actions"
        );
    }
}
