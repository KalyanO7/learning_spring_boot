package com.spring.core.di;

import org.springframework.stereotype.Component;

@Component("SMSservice")
public class SMSservice implements messagerservice{

    @Override
    public void send(String s){
        System.out.println("message has been sent"+s);
    }
}
