package com.cloudsmartz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "WELCOME CONTROLLER";
		System.out.println("Welcome.........");
		return new ModelAndView("gagandeep", "message", message);
	}
}