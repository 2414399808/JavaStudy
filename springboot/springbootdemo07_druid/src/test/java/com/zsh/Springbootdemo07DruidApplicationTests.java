package com.zsh;

import com.zsh.domain.Account;
import com.zsh.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootdemo07DruidApplicationTests {


    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {

        Account account = accountMapper.getById(3);
        System.out.println(account);
    }

}
