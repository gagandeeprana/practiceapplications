package com.cloudsmartz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("name")
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadWelcomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ModelAndView authenticate(@RequestParam("txtUsername") String un,
			@RequestParam("txtPassword") String pwd, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		if (un.equals("admin") && pwd.equals("admin")) {
			session.setAttribute("un", un);
			modelAndView.setViewName("welcome");
		} else {
			modelAndView.setViewName("login");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public ModelAndView loadForwardPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "New User");
		modelAndView.setViewName("Forward");
		return modelAndView;
	}

}
