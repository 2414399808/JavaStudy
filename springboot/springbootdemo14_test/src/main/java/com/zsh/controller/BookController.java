package com.zsh.controller;

import com.zsh.domian.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {



//    @GetMapping
//    public String getById(){
//        System.out.println("getById running");
//        return "spring boot";
//    }

    @GetMapping
    public Book getById(){
        System.out.println("getById running");
        Book book =new Book();
        book.setId(1);
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        return book;
    }


}
