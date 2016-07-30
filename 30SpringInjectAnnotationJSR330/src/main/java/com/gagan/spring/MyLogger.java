package com.gagan.spring;

import javax.inject.Inject;
import javax.inject.Named;

public class MyLogger {

	private MyConsoleWriter myConsoleWriter;

	private MyFileWriter myFileWriter;

	@Inject
	@Named(value = "myConsoleWriter")
	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	@Inject
	public void setMyFileWriter(MyFileWriter myFileWriter) {
		this.myFileWriter = myFileWriter;
	}

	public void writeConsole(String text) {
		myConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		myFileWriter.write(text);
	}

}
