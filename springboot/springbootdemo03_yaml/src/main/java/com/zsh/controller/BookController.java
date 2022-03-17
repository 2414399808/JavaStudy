package com.zsh.controller;

import com.zsh.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {


    //读取yaml数据中的单一数据
    @Value("${country}")
    private String country1;

    @Value("${user2.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes;

    @Value("${users[1].age}")
    private String users1;

    @Value("${tempDir}")
    private String dir1;

    //使用自动装配将所有的数据封装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;



    @GetMapping
    public String getById(){
//        System.out.println(dir1);
//        System.out.println(users1);
//        System.out.println(likes);
//        System.out.println(name1);
//        System.out.println(country1);
        System.out.println("springboot is running");
//        System.out.println(env.getProperty("users[1].age"));
        System.out.println(myDataSource);
        return "Springboot si running";
    }
}
