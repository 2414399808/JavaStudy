package com.zsh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsh.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    @Select("select * from account where id = #{id}")
    Account getById(Integer id);
}
