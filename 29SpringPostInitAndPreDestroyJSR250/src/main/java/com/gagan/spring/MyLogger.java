package com.gagan.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class MyLogger {

	@Resource
	private MyConsoleWriter myConsoleWriter;

	@Resource
	private MyFileWriter myFileWriter;

	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	public void setMyFileWriter(MyFileWriter myFileWriter) {
		this.myFileWriter = myFileWriter;
	}

	public void writeConsole(String text) {
		myConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		myFileWriter.write(text);
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Init...");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Destroy...");
	}

}
