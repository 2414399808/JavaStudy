package com.zsh.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsh.Dao.BookDao;
import com.zsh.domain.Book;
import com.zsh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Boolean save(Book book) {
        int insert = bookDao.insert(book);
        return insert>0;
    }

    @Override
    public Boolean update(Book book) {
        int i = bookDao.updateById(book);
        return i > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        int i = bookDao.deleteById(id);
        return i > 0;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.selectById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        List<Book> bookList = bookDao.selectList(null);
        return bookList;
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize) {
        IPage page = new Page<>(currentPage,pageSize);

        bookDao.selectPage(page,null);
        return page;
    }
}
