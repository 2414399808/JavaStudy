package com.zsh.service.impl;

import com.zsh.domain.Account;
import com.zsh.mapper.AccountMapper;
import com.zsh.service.AccountService;
import com.zsh.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
        @Autowired
        private AccountMapper accountMapper;
//        private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public void save(Account account) {
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//        mapper.save(account);
//        sqlSession.close();
        accountMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        return accountMapper.findAll();
    }
}
