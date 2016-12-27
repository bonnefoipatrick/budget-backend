/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.controller;

import com.cis.budget.entities.Message;
import com.cis.budget.services.impl.MessageService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonne_000
 */
@RestController
public class MessageController {
    private MessageService messageService;

	public MessageController(MessageService messageService) {
	    this.messageService = messageService;
    }

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/test/get/json", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Message> testGetJson() {
	    return this.messageService.getMessages();
	}
}
