package com.gagan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyLogger {

	@Autowired
	private MyConsoleWriter myConsoleWriter;

	@Autowired
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

}
