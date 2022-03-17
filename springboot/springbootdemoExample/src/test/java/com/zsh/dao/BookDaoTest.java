package com.zsh.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsh.Dao.BookDao;
import com.zsh.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testSelectList(){
        List<Book> bookList = bookDao.selectList(null);
        System.out.println(bookList);
    }

    @Test
    public void testSelectById(){
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }



    @Test
    public void testSave(){
        Book book=new Book();
        book.setName("测试数据123");
        book.setType("测试数据123");
        book.setDescription("测试数据123");
        int insert = bookDao.insert(book);
        System.out.println(insert);
    }

    @Test
    public void testUpdate(){
        Book book=new Book();
        book.setId(13);
        book.setName("测试数据456");
        int i = bookDao.updateById(book);
        System.out.println(i);
    }

    @Test
    public void testDelete(){
        int i = bookDao.deleteById(13);
        System.out.println(i);
    }

    @Test
    public void testGetPage(){
        Page page =new Page(1,5);
        //此方法返回值是一个IPage对象 需要调用api获取页面数据
        bookDao.selectPage(page, null);
        System.out.println(page.getPages());//总页数
        System.out.println(page.getCurrent());//当前页号
        System.out.println(page.getTotal());//总条目数
        System.out.println(page.getSize());//页面条数
        System.out.println(page.getRecords());//页面数据

    }
    @Test
    public void testGetCondition(){

        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("type","计算机理论");
        //qw.equals()
        //qw.ne()//notequals
        bookDao.selectList(qw);
    }

    @Test
    public void testGetCondition2(){
        String name=null;

//        QueryWrapper<Book> qw=new QueryWrapper<>();
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();

        //当给到判断条件为null时会自动拼接“null”的字符串 所以要判断name是否为空
//        if(name!=null)
//        lqw.like(Book::getName,name);
        lqw.like(name!=null,Book::getName,name);

        //qw.equals()
        //qw.ne()//notequals
        bookDao.selectList(lqw);
    }

    @Test
    public void testAAA(){
        List<Book> aaa = bookDao.aaa();
        System.out.println(aaa);
    }

}
