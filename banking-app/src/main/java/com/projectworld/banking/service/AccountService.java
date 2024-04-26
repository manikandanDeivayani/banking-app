package com.projectworld.banking.service;

import com.projectworld.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAcount(AccountDto accountDto);

    AccountDto  getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
