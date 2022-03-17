package com.zsh;

import com.zsh.dao.BookDao;
import com.zsh.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class Springbootdemo15SqlApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    @Test
    public void testJdbcTemplate(){
        List<Book> query = jdbcTemplate.query("select * from tb1_book", new BeanPropertyRowMapper<Book>(Book.class));
        System.out.println(query);
    }


    @Test
    public void testJdbcTemplateSave(){
        jdbcTemplate.update("insert into TB1_BOOK  values(3,'springboot3','springboot3','springboot3')");
    }

}
