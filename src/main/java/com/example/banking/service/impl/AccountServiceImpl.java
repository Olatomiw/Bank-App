package com.example.banking.service.impl;

import com.example.banking.Mapper.AccountMapper;
import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;
import com.example.banking.repository.AccountRepository;
import com.example.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }
}