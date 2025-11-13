package com.spring.core;

import com.spring.core.di.Appconfig;
import com.spring.core.di.SMSservice;
import com.spring.core.di.email;
import com.spring.core.di.messagesender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {


    public static void main(String[] args) {

//        vehicle v1 = new bike();
//        traveller t = new traveller(v1);
//        t.startjourney();
//        ApplicationContext App = new AnnotationConfigApplicationContext(Appconfig.class);
//        car c1 = App.getBean(car.class);
//        c1.move();
//
//        bike b1=App.getBean(bike.class);
//        b1.move();
//
//        cycle c=App.getBean(cycle.class);
//        c.move();
//
//        traveller t1=App.getBean(traveller.class);
//        t1.startjourney();


      String s="hello have a nice day";
//       SMSservice sms=new SMSservice();
//        email e=new email();
//        messagesender m=new messagesender(sms);
//        messagesender m2=new messagesender(e);
//        m.send(s);
//        m2.send(s);

        ApplicationContext app=new AnnotationConfigApplicationContext(Appconfig.class);
        messagesender m=app.getBean(messagesender.class);
        m.send(s);
    }
}
