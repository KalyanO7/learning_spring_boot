package com.spring.core;

import com.spring.core.controller.democontroller;
import com.spring.core.repository.demorepository;
import com.spring.core.service.demoservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class democlient {
  public  static void main(String[] args) {
      ApplicationContext App=new AnnotationConfigApplicationContext(Appconfig.class);
      democontroller c1=App.getBean(democontroller.class);
      demoservice s1=App.getBean(demoservice.class);
      demorepository r1=App.getBean(demorepository.class);
      System.out.println(c1.hello());
      System.out.println(s1.hello());
      System.out.println(r1.hello());
    }
}
