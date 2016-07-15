package com.cloudsmartz.SpringListOfBeans.demo2;

public class Engine {

	private int engineId;
	private String name;
	private long horsePower;

	public Engine(int engineId, String name, long horsePower) {
		super();
		this.engineId = engineId;
		this.name = name;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", name=" + name
				+ ", horsePower=" + horsePower + "]";
	}
}
