/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.services.impl;

import com.cis.budget.entities.Account;
import com.cis.budget.repositories.AccountRepository;
import com.cis.budget.services.IAccountService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService implements IAccountService {
    
    private Logger logger = LoggerFactory.getLogger(AccountService.class);
    
    @Autowired
    private AccountRepository accountRepository;
    
    @Override
    public Account getAccount(Long id) {
        logger.debug("getAccount " + id);
        return accountRepository.findOne(id);
    }
    
    @Override
    public List<Account> findAllAccounts () {
        List<Account> accounts = accountRepository.findAll();
        return accounts;
    }
    
    @Override
    public void saveAccount(Account account) {
        accountRepository.saveAndFlush(account);
    };
    
    @Override
    public void deleteAccount(Long id) {
        accountRepository.delete(id);
    };
    
}
