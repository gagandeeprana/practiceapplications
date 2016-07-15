package com.cloudsmartz.SpringListOfBeans;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Car {

	private String carName;

	private Map<String, String> drivers;

	public Car(String carName, Map<String, String> drivers) {
		super();
		this.carName = carName;
		this.drivers = drivers;
	}

	public void display() {
		System.out.println("Name of the Car: " + carName);
		Set<String> entry = drivers.keySet();
		Iterator<String> itr = entry.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("First Name: " + key);
			String value = drivers.get(key);
			System.out.println("Last Name: " + value);
		}
	}
}
