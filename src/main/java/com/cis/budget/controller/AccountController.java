/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.controller;

import com.cis.budget.entities.Account;
import com.cis.budget.services.IAccountService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonne_000
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Account> getAccountDetail(//@RequestParam(value = "id", required = false, defaultValue = "0") 
            @PathVariable(value = "id") Long id, HttpServletRequest req) {
        Account account = accountService.getAccount(id);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    //@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    //@ResponseBody
    public ResponseEntity<List> findAll() {

        List<Account> accounts = accountService.findAllAccounts();
        if (accounts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        System.out.println("com.cis.budget.controller.AccountController.createAccount()");
        System.out.println(account.getIBAN());
        accountService.saveAccount(account);

        return new ResponseEntity(account, HttpStatus.OK);
        //return new ResponseEntity<>(accountService.saveAccount(account), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<Account> updateAccount(@RequestBody Account account) {
        System.out.println("com.cis.budget.controller.AccountController.updateAccount()");
        System.out.println(account.getIBAN());
        accountService.saveAccount(account);

        return new ResponseEntity(account, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Account> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);

        Account user = accountService.getAccount(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }

        accountService.deleteAccount(id);
        return new ResponseEntity<Account>(HttpStatus.NO_CONTENT);
    }
}
