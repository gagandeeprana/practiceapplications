package com.gagan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/gagan/spring/test/beans.xml");
		MyLogger logger = (MyLogger) context.getBean("logger");
		logger.writeConsole("CONSOLE>>................");
		logger.writeFile("FILE>>................");
		((ClassPathXmlApplicationContext) context).close();
	}
}
