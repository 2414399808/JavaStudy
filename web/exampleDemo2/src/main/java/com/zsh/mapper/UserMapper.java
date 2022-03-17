package com.zsh.mapper;

import com.zsh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
    User selectByUsername(String username);
    void addUser(User user);
}
