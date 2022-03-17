package com.zsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootdemo12HotDeployApplication {


    public static void main(String[] args) {
       System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(Springbootdemo12HotDeployApplication.class, args);
    }

}
