package com.test;

import com.zsh.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringAnnotionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate template = (JdbcTemplate) app.getBean("jdbcTemplate");
        int zhangsan = template.update("insert into account values(?,?,?)", null, "zhangsan", 111);
        System.out.println(zhangsan);

    }
}

