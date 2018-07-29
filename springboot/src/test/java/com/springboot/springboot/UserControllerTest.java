package com.springboot.springboot;

import static org.junit.Assert.*;

import java.awt.print.Printable;

import org.apache.tomcat.jni.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.equalTo;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*; 
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    
    @Autowired
    private WebApplicationContext context;
    
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
        initData();
    }

    public void initData() throws Exception{

        mvc.perform(
                MockMvcRequestBuilders.post("/User")
                        .param("id", "100")
                        .param("loginName", "yoyo")
                        .param("passWord", "123")
                        .accept(MediaType.APPLICATION_FORM_URLENCODED)
    ).andExpect(status().isOk())
        .andExpect(content().string(equalTo("success")));
                
               
    }
    @Test
    public void testTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/User")
                .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andDo(print());
    }

}
