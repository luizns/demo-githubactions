package com.github.luizns.demogithubactions;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class DemoGithubactionsApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message")
                        .value("Hello from Java 21 + Spring Boot!"))
                .andExpect(jsonPath("$.ci")
                        .value("GitHub Actions"));
    }

}
