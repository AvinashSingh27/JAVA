package com.example.demo;

import com.example.demo.model.Alien;
import com.example.demo.model.Laptop;
import com.example.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		// it activates your spring framework, it also has something called a container where you can create your spring beans
		//System.out.println("Hello Spring");


		//Alien obj = new Alien();
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());

//		Alien obj1 = context.getBean(Alien.class);
//		obj.code();

		// Service Class

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);    //the job of Service class is to do any processing with the laptop.

	}

}
