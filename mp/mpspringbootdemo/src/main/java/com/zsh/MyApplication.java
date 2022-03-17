package com.zsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@MapperScan("com.zsh.mapper")//设置mapper接口的扫描包
// @SpringBootApplication
public class MyApplication
{
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}