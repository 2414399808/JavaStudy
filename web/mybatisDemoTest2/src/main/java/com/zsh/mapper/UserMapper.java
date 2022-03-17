package com.zsh.mapper;

import com.zsh.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
}
