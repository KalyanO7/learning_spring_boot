package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class traveller {
    vehicle v1;
@Autowired
    public traveller( vehicle v1){
        this.v1=v1;
    }
    public void startjourney(){
        this.v1.move();
    }
}
