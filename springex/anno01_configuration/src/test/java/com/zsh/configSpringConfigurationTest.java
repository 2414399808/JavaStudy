package com.zsh;

import com.zsh.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class configSpringConfigurationTest {
    public static void main(String[] args) {
        //1传入要被扫描的包的方式
//        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext("com.zsh.config");
//        SpringConfiguration springConfiguration = app.getBean(SpringConfiguration.class);
//        System.out.println(springConfiguration);
        //2传入被注解的类的字节码的方式 以此种方式传入参数可以不些config注解
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SpringConfiguration springConfiguration = app.getBean(SpringConfiguration.class);
        System.out.println(springConfiguration);
    }
}
