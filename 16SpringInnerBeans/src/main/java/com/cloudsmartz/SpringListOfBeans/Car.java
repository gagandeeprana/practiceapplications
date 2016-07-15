package com.cloudsmartz.SpringListOfBeans;

import java.util.List;
import java.util.ListIterator;

public class Car {

	private List<Wheel> wheels;

	public Car(List<Wheel> wheels) {
		super();
		this.wheels = wheels;
	}

	public void getAllWheels() {
		ListIterator<Wheel> li = wheels.listIterator();
		while (li.hasNext()) {
			Wheel wheel = li.next();
			System.out.println(wheel.getName());
			System.out.println(wheel.getType());
		}
	}
}
