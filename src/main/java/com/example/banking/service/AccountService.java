package com.example.banking.service;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

//    AccountDto withdraw(Long id, double amountToWithdraw);
}
