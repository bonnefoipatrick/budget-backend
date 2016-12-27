/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.controller;

import com.cis.budget.entities.Person;
import com.cis.budget.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonne_000
 */
@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping("/person")
    public Person getPersonDetail(@RequestParam(value = "id", required = false,
                                                defaultValue = "0") Integer id) {
        Person p = personService.getPersonDetail(id);
        return p;
    }
}
