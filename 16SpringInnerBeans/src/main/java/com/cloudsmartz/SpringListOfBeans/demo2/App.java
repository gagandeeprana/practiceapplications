package com.cloudsmartz.SpringListOfBeans.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans2.xml");
		Car car = (Car) context.getBean("car");
		car.printEngine();
	}
}
