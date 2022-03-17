package com.zsh.test;

import com.zsh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringComponetscan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext("com.zsh.config");
        UserService userService = (UserService) app.getBean("myuserService");
        userService.save();
    }
}
