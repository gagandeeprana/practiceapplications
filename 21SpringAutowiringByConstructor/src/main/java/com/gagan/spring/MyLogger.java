package com.gagan.spring;

public class MyLogger {

	private MyWriter myConsoleWriter;
	private MyWriter myFileWriter;

	public MyLogger(MyConsoleWriter myConsoleWriter, MyFileWriter myFileWriter) {
		this.myConsoleWriter = myConsoleWriter;
		this.myFileWriter = myFileWriter;
	}

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
