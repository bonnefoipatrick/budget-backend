/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author bonne_000
 */
@Entity(name = "account")
@Data
@ToString
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id", nullable = false)
    private Long id;
    
    @Column(name="account_name", length=45, nullable = false)
    private String name;
    
    @Column(name="account_type", length=11, nullable = false)
    private Integer type;
    
    @Column(name="account_iban", length=48, nullable = false)
    private String IBAN;
    
    @Column(name="account_bic", length=15, nullable = false)
    private String BIC;
    
    @Column(name="account_dt_opening", nullable = false)
    private Date date_ouverture;
    
    @Column(name="account_dt_closing", nullable = true)
    private Date date_fermeture;
    
    @Column(name="account_solde", nullable = false)   
    private BigDecimal solde;
}
