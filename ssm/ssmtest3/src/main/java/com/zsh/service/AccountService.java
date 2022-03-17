package com.zsh.service;

import com.zsh.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    List<Account> findAll();
}
