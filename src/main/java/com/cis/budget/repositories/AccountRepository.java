/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.repositories;

import com.cis.budget.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bonne_000
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
