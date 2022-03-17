package com.zsh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsh.domian.Book;
import org.springframework.stereotype.Service;


public interface BookService  {

    boolean save(Book book);
}
