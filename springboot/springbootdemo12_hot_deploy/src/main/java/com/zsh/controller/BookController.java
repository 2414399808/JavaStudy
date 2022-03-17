package com.zsh.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zsh.domain.Book;
import com.zsh.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private IBookService bookService;

    //查询全是get请求
    @GetMapping
    public List<Book> getAll(){
        List<Book> list = bookService.list();
        return list;
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        boolean save = bookService.save(book);
        return save;

    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
       return bookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }


    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        Book byId = bookService.getById(id);
        return byId;
    }


    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        return page;
    }
}
