package com.gagan.spring;

import org.springframework.stereotype.Component;

@Component
public class MyConsoleWriter implements MyWriter{

	public void write(String text) {
		System.out.println("Writing into console: " + text);
	}
}
