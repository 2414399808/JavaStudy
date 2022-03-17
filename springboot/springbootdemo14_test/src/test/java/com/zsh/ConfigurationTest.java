package com.zsh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigurationTest {
    @Autowired
    private String msg;
    @Test
    public void test(){
        System.out.println(msg);
    }
}
