package com.zsh.mapper;

import com.zsh.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface AccountMapper {
    @Select("select * from account where id = #{id}")
    Account getById(Integer id);
}
