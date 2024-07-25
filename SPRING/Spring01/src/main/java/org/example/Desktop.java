package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("com2")
@Component
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop(){                       // Constructor
        System.out.println("Desktop Object Created");
    }
    public void compile(){
        System.out.println("Compling using Desktop");
    }
}
