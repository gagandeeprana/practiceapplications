package com.gagan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 100;

	private String name = "Gagan";

	public void speak() {
		System.out.println(id + "  " + name);
	}

	@Autowired
	public void setId(@Value("1144") int id) {
		this.id = id;
	}

	@Autowired
	public void setName(@Value("Simi") String name) {
		this.name = name;
	}
}
