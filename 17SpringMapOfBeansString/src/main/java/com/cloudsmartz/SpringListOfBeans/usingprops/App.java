package com.cloudsmartz.SpringListOfBeans.usingprops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans2.xml");
		Car car = (Car) context.getBean("car");
		car.display();
	}
}
