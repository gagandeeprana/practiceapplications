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
	public void setId(@Value("#{123456}") int id) {
		this.id = id;
	}

	@Autowired
	public void setName(@Value("#{new java.util.Date().toString() +'  '+ T(Math).PI + '  '+ T(Math).sin(5) +'  ' + 2^2 + '  ' + (2 le 4 ? 'Ghat aa' : 'Wadh aa..')}") String name) {
		this.name = name;
	}
}
