package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class car implements vehicle{
    @Override
    public void move(){
        System.out.println("car is running");
    }
}
