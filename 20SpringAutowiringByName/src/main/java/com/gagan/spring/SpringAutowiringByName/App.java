package com.gagan.spring.SpringAutowiringByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyLogger myLogger = (MyLogger) context.getBean("logger");
		myLogger.writeConsole("CONSOLE>>>>>");
		myLogger.writeFile("FILE>>>>>");
		((ClassPathXmlApplicationContext) context).close();
	}
}
