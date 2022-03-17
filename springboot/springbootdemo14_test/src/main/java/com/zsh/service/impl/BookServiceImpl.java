package com.zsh.service.impl;

import com.zsh.dao.BookDao;
import com.zsh.domian.Book;
import com.zsh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        int insert = bookDao.insert(book);
        return insert>0;
    }
}
