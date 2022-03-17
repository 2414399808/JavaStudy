package com.zsh.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zsh.controller.utils.R;
import com.zsh.domain.Book;
import com.zsh.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController2 {


    @Autowired
    private IBookService bookService;

    //查询全是get请求
    @GetMapping
    public R getAll(){
//        List<Book> list = bookService.list();
//        R r = new R(true,list);
//        r.setData(list);
//
//
//        return r;
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
//        boolean save = bookService.save(book);
//        R r=new R(save);
//        return r;
//        if(true) throw new IOException();
        return new R(bookService.save(book));

    }

    @PutMapping
    public R update(@RequestBody Book book){
//        boolean b = bookService.updateById(book);
//        R r=new R(b);
//
//        return r;
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
//        boolean b = bookService.removeById(id);
//        R r=new R(b);
//        return r;
        return new R(bookService.removeById(id));
    }


    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
//        Book byId = bookService.getById(id);
//        R r=new R(true,byId);
//        return r;
        return new R(true,bookService.getById(id));
    }


//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize){
////        IPage<Book> page = bookService.getPage(currentPage, pageSize);
////        return page;
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        //如果当前页码值大于了总页码之，那么重新执行查询操作，使用最大页码作为当前页码
//        if(currentPage>page.getPages()) {
//             page = bookService.getPage((int) page.getPages(), pageSize);
//        }
//        return new R(true,page);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize,Book book){
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        return page;
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于了总页码之，那么重新执行查询操作，使用最大页码作为当前页码
        if(currentPage>page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize,book);
        }
        return new R(true,page);
    }
}
