package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		System.out.println("welcome to boot");
		Alien alien=context.getBean(Alien.class);
		alien.show();
		/*
		 * Alien alien1 = context.getBean(Alien.class); alien1.show();
		 */
	}

}
