package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("messagesender")
public class messagesender implements messagerservice{
    private messagerservice m1;

    private messagerservice m2;

//    @Autowired
//    public messagesender(@Qualifier("SMSservice") messagerservice m){
//        this.m=m;
//    }

    @Autowired
    public void setM(@Qualifier("email") messagerservice m1) {
        this.m1 = m1;
        System.out.println("setter DI 1");
    }

    @Autowired
    public void setM2(@Qualifier("SMSservice") messagerservice m2) {
        this.m2 = m2;
        System.out.println("setter DI 2");
    }

    @Override
    public void send(String s){
       this.m1.send("done"+s);
       this.m2.send("bla bla bla"+s);
    }


}
