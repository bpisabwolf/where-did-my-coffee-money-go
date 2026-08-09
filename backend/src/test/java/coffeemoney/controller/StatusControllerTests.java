package coffeemoney.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class StatusControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnApplicationStatus() throws Exception {
        mockMvc.perform(get("/api/status")).andExpect(status().isOk()).andExpect(jsonPath("$.status").value("Im trying"));
    }
}
