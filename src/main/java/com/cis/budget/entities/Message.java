/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cis.budget.entities;

/**
 *
 * @author bonne_000
 */
public class Message {

    public String title;
    public String message;

    public Message(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return this.title;
    }

    public String getMessage() {
        return this.message;
    }
}
