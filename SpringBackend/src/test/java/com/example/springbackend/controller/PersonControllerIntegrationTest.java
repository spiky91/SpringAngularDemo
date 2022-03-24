package com.example.springbackend.controller;

import com.example.springbackend.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService service;

    @Test()
    public void whenTestMvcController_thenRetrieveExpectedResult() throws Exception {
        // ...

//        this.mockMvc.perform(get("/foos")
//                .andExpect(...);
    }
}
