package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Java Based config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean("desktop",Desktop.class);  // Looking for the type of the bean i.e Desktop
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();


        Alien obj1 = context.getBean(Alien.class);
        //obj1.setAge(12);
        System.out.println(obj1.getAge());
        obj1.Code();












//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj = (Alien) context.getBean("alien");
//        obj.Code();


    }
}
