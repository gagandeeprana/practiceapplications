package com.cloudsmartz.SpringListOfBeans.demo2;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void printEngine() {
		System.out.println(engine);
	}

}
