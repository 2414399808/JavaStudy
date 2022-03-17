package com.zsh.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsh.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao extends BaseMapper<Book> {
        List<Book> aaa();

}
