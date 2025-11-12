package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle{
    @Override
    public void move(){
        System.out.println("bike moves");
    }
}
