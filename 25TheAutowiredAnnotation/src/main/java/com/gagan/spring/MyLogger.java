package com.gagan.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MyLogger {

	private MyConsoleWriter myConsoleWriter;

	private MyFileWriter myFileWriter;

	@Autowired
	public MyLogger(MyConsoleWriter myConsoleWriter, MyFileWriter myFileWriter) {
		super();
		this.myConsoleWriter = myConsoleWriter;
		this.myFileWriter = myFileWriter;
	}

	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	// @Autowired
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
