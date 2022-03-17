package com.zsh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsh.Dao.BookDao;
import com.zsh.domain.Book;
import com.zsh.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {

        return bookDao.selectPage(new Page<Book>(currentPage,pageSize),null);

    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like(Strings.isNotEmpty(book.getName()),"name",book.getName());
        qw.like(Strings.isNotEmpty(book.getType()),"type",book.getName());
        qw.like(Strings.isNotEmpty(book.getDescription()),"description",book.getDescription());


        return bookDao.selectPage(new Page<Book>(currentPage,pageSize),qw);
    }

}
