package com.gagan.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MyLogger {

<<<<<<< HEAD
	private MyConsoleWriter myConsoleWriter;

	private MyFileWriter myFileWriter;

	@Autowired
	public MyLogger(MyConsoleWriter myConsoleWriter, MyFileWriter myFileWriter) {
		super();
		this.myConsoleWriter = myConsoleWriter;
		this.myFileWriter = myFileWriter;
	}

=======
	@Autowired(required = false)
	private MyConsoleWriter myConsoleWriter;

	@Autowired
	private MyFileWriter myFileWriter;

	
	
>>>>>>> 2fab57220d157df6006b77f3189ddd1716d2be31
	public void setMyConsoleWriter(MyConsoleWriter myConsoleWriter) {
		this.myConsoleWriter = myConsoleWriter;
	}

	// @Autowired
	public void setMyFileWriter(MyFileWriter myFileWriter) {
		this.myFileWriter = myFileWriter;
	}

	public void writeConsole(String text) {
		if(myConsoleWriter!=null)
		myConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		myFileWriter.write(text);
	}

}
