package com.gagan.spring.SpringAutowiringByType;

public class MyConsoleWriter implements MyWriter{

	public void write(String text) {
		System.out.println("Writing into console: " + text);
	}
}
