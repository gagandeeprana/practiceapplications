package com.cloudsmartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "HELLO CONTROLLER";
		System.out.println("Heloooo..........");
		return new ModelAndView("data", "message", message);
	}
}