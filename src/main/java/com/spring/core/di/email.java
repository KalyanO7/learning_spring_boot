package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component("email")
public class email implements messagerservice{
    @Override
    public void send(String message) {
        System.out.println("mail has been sent to"+message);
    }
}
