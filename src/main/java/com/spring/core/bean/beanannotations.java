package com.spring.core.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class student {
    private address address;

    public student(address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("student class method called");
        address.print();
    }

    public void init(){
        System.out.println("initializing logic ");
    }

    public void destroy(){
        System.out.println("destroying logic ");
    }
}


 class address{
    public void print(){
        System.out.println("address class method called");
    }
}

class Appconfig{

    @Bean(name="add")
    public address address(){
        return new address();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public student student(){
        return new student(address());
    }
}

public class beanannotations {
    static void main(String[] args) {
        try (var app=new AnnotationConfigApplicationContext(Appconfig.class)){
            student s=app.getBean(student.class);
            String[]arr=app.getBeanDefinitionNames();
            for(String a:arr) System.out.println(a);
            s.print();
        }
    }
}

