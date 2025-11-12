package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class cycle implements vehicle{
    @Override
    public void move(){
        System.out.println("cycle is moving");
    }
}
