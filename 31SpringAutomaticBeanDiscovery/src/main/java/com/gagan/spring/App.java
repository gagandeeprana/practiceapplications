package com.gagan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyLogger logger = (MyLogger) context.getBean(MyLogger.class);
		logger.writeConsole("CONSOLE>>................");
		logger.writeFile("FILE>>................");
		((ClassPathXmlApplicationContext) context).close();
	}
}
