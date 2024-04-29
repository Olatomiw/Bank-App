package com.example.banking.service;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
