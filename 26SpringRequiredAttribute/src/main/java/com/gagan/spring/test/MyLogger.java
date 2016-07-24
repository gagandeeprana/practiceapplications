package com.gagan.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class MyLogger {

	@Autowired(required = false)
	private MyConsoleWriter myConsoleWriter;

	@Autowired
	private MyFileWriter myFileWriter;

	public MyLogger(MyConsoleWriter myConsoleWriter, MyFileWriter myFileWriter) {
		super();
		this.myConsoleWriter = myConsoleWriter;
		this.myFileWriter = myFileWriter;
	}

	//
	public MyLogger() {
		// TODO Auto-generated constructor stub
	}

	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	public void setMyFileWriter(MyFileWriter myFileWriter) {
		this.myFileWriter = myFileWriter;
	}

	public void writeConsole(String text) {
		if (myConsoleWriter != null)
			myConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		myFileWriter.write(text);
	}

}
