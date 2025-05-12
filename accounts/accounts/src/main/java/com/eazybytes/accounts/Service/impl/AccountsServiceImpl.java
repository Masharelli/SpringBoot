package com.eazybytes.accounts.Service.impl;

import com.eazybytes.accounts.Service.IAccountsService;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepostory;
import com.eazybytes.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepostory accountsRepostory;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
