package com.zsh.test;

import com.zsh.config.JdbcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringAnnotionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext("config");
        JdbcTemplate template = (JdbcTemplate) app.getBean("jdbcTemplate");
        System.out.println(template);
    }
}
