package com.zsh.mapper;

import com.zsh.domain.Account;

import java.util.List;

public interface AccountMapper {
    void save(Account account);

    List<Account> findAll();
}
