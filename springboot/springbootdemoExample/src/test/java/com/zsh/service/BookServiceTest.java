package com.zsh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zsh.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;


    @Test
    public void testGetById(){

        Book byId = bookService.getById(2);
        System.out.println(byId);
    }
    @Test
    public void testSelectList(){
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);
    }


    @Test
    public void testSave(){
        Book book=new Book();
        book.setName("测试数据123");
        book.setType("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);

    }

    @Test
    public void testUpdate(){
        Book book=new Book();
        book.setId(13);
        book.setName("测试数据456");
         bookService.update(book);

    }

    @Test
    public void testDelete(){
      bookService.delete(13);

    }
    @Test
    public void testGetByPage(){
        IPage<Book> page = bookService.getPage(3, 5);
        System.out.println(page.getRecords());
    }

}
