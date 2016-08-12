package com.gagan.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

	// @RequestMapping("/")
	// public ModelAndView showHome() {
	// ModelAndView view = new ModelAndView("home");
	// Map<String, Object> model = view.getModel();
	// model.put("name", "<b>Gagandeep Singh</b>");
	// return view;
	// }

	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("name", "<b>Gagandeep Singh</b>");
		return "home";
	}
}
