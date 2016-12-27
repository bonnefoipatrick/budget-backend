/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.services;

import com.cis.budget.entities.Message;
import java.util.List;

/**
 *
 * @author bonne_000
 */
public interface IMessageService {
 
    
    public List<Message> getMessages();
}
