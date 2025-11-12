package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {


    public static void main(String[] args) {

//        vehicle v1 = new bike();
//        traveller t = new traveller(v1);
//        t.startjourney();
        ApplicationContext App = new AnnotationConfigApplicationContext(Appconfig.class);
        car c1 = App.getBean(car.class);
        c1.move();

        bike b1=App.getBean(bike.class);
        b1.move();

        cycle c=App.getBean(cycle.class);
        c.move();

        traveller t1=App.getBean(traveller.class);
        t1.startjourney();
    }
}
