package com.gagan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id;
	private String name;

	@Autowired(required = false)
	public void setId(int id) {
		this.id = id;
	}

	@Autowired(required = false)
	public void setName(@Value("${jdbc.username}") String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("Id is: " + id + "  Name: " + name);
	}
}
