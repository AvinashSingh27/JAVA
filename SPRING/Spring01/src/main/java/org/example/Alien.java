package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")         //basically you are injecting the value from outside the code.
    private  int age;

    //@Autowired
//    @Qualifier("com2")
    //@Qualifier("desktop")
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public  Alien(){
        System.out.println("Alien Object Created");
    }

    public void Code()
    {
        System.out.println("Coding");
        com.compile();
    }
}
