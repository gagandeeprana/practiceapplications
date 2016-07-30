package com.gagan.spring;

import org.springframework.stereotype.Component;

@Component
public class MyFileWriter implements MyWriter {

	public void write(String text) {
		System.out.println("Writing into File: " + text);
	}
}
