/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.services.impl;

import com.cis.budget.entities.Message;
import com.cis.budget.services.IMessageService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonne_000
 */
@Service
public class MessageService implements IMessageService {
    
    @Override
    public List<Message> getMessages() {
        ArrayList<Message> messages = new ArrayList<Message>();

        messages.add(new Message("Message1", "Hello, world!"));
        messages.add(new Message("Message2", "Another one!"));

        return messages;
    }
}
