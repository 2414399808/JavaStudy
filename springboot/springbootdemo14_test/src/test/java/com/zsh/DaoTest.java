package com.zsh;

import com.zsh.domian.Book;
import com.zsh.service.BookService;
import com.zsh.testcase.domain.BookCase;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(true)//默认值是true 表示会发生回滚，如果传参是false 即使你添加了@Transactional也会添加成功
public class DaoTest {
    @Autowired
    private BookCase bookCase;

    @Autowired
    private BookService bookService;
    @Test
    public void testSave(){
        Book book=new Book();
        book.setType("springboot2");
        book.setName("springboot2");
        book.setDescription("springboot2");
        bookService.save(book);
    }

    @Test
    public void testCase(){
        System.out.println(bookCase);
    }
}
