package com.gagan.spring;

public class MyFileWriter implements MyWriter {

	public void write(String text) {
		System.out.println("Writing into File: " + text);
	}
}
