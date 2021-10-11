package com.telusko.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello World!"); Car car = new Car(); car.driver(); Bike
		 * bike = new Bike(); bike.driver();
		 */
		// tight coupling
		// both cR bd bike are vechile creating interface as vechile
		// Vechile vc=new Bike();
		// Vechile vc=new Car();
		// BeanFactory for small applications
		// fpr entireprise based application we use ApplicationContext

		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Vechile obj = (Vechile) context.getBean("car");
		//obj.driver();
		// Tyre t=(Tyre) context.getBean("tyre");
		// System.out.println(t);

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();

	}
}
