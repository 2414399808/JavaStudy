package com.zsh;

import com.zsh.domain.Account;
import com.zsh.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootdemo05MybatisApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {

        System.out.println(accountMapper);
        Account byId = accountMapper.getById(1);
        System.out.println(byId);

    }

}
