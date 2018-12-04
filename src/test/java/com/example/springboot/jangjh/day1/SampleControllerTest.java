package com.example.springboot.jangjh.day1;

import lombok.extern.apachecommons.CommonsLog;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
@CommonsLog
public class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Ignore
    public void testHello() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world")).andReturn();

        log.debug("mvcResult : " + mvcResult);
    }
}
