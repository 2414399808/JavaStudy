package com.zsh.service.impl;

import com.zsh.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("save ......");
    }
}
