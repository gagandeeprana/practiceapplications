package com.gagan.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyLogger {

	private MyConsoleWriter myConsoleWriter;

	private MyFileWriter myFileWriter;

	@Autowired
//	@Qualifier("toConsole")
	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	@Autowired
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
