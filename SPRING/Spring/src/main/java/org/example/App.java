package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ApplicationContext is not a part of java, this is the part of Spring
        // So we have to some packages that means we have to add spring dependencies...
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Once we get context object, it will container for you.

        Alien obj = (Alien) context.getBean("alien");
        obj.coding();
    }
}
