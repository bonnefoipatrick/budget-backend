/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.services.impl;

import com.cis.budget.entities.Person;
import com.cis.budget.services.IPersonService;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements IPersonService {

    @Override
    public Person getPersonDetail(Integer id) {
        Person p = new Person();
        p.setId(id);
        p.setLocation("Varanasi");
        p.setName("Ram");
        return p;
    }

}
