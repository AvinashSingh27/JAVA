package org.example.config;


import org.example.Alien;
import org.example.Desktop;
import org.example.Computer;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {


//    //@Bean(name={"com2","beast1","beast2"})    // we can use more than one name for particular bean
//    @Bean
//    //@Scope("prototype")   // Now Desktop scope is changed to prototype
//    public Desktop desktop(){    // method name = default name of bean
//        return new Desktop();
//    }
//
//    // Let create bean for laptop as well
//    @Bean
//    @Primary                 //Now laptop will get the first preference
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//
//    // Let create bean for alien
//    @Bean
//    public Alien alien(Computer com){      //@Qualifier("desktop")
//        // making here loosely coupled....
//
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
}
