package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloController.class)//測試HelloControllerAPI
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello_ReturnHello() throws Exception {

        mockMvc.perform(get("/hello"))//測試get或post
                .andExpect(status().isOk())//如果打通
                .andExpect(content().string("Hello World"));//抓回傳值是否一樣 如一樣則顯示PASS
    }
}