package com.zsh;

import com.zsh.domain.Account;
import com.zsh.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springbootdemo06MybatisPlusApplicationTests {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        Account account = accountMapper.selectById(2);
        System.out.println(account);
    }


    @Test
    public void testGetAll(){
        List<Account> accountList = accountMapper.selectList(null);
        System.out.println(accountList);
    }

}
