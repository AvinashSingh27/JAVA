package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop")          // Although laptop is primary but it will prefer desktop as primary due to qualifier....
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        com.compile();
        //System.out.println("Coding");
    }
}
