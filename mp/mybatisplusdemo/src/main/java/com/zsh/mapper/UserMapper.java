package com.zsh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsh.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> findAll();
}
