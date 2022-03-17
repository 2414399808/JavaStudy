package com.zsh.service;

import com.zsh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserServiceImpl {
    User selectByUsernameAndPassword(String username,String password);
    User selectByUsername(String username);
    boolean add(User user);
}
