package com.cloudsmartz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {
		System.out.println("111111111111");
		ModelAndView model = new ModelAndView();
		System.out.println("22222222222");

		model.addObject("title", "Spring Security Remember Me");
		model.addObject("message", "This is default page!");
		model.setViewName("admin");
		System.out.println("33333333333333");

		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Remember Me");
		model.addObject("message", "This page is for ROLE_ADMIN only!");
		model.setViewName("admin");

		return model;

	}

	/**
	 * This update page is for user login with password only. If user is login
	 * via remember me cookie, send login to ask for password again. To avoid
	 * stolen remember me cookie to update info
	 */
	@RequestMapping(value = "/admin/update**", method = RequestMethod.GET)
	public ModelAndView updatePage(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();

		if (isRememberMeAuthenticated()) {
			// send login for update
			setRememberMeTargetUrlToSession(request);
			model.addObject("loginUpdate", true);
			model.setViewName("/login");

		} else {
			model.setViewName("update");
		}

		return model;

	}

	/**
	 * both "normal login" and "login for update" shared this form.
	 * 
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			HttpServletRequest request) {
		System.out.println("Hereee");
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
			System.out.println("Hereee in error");

			// login form for update page
			// if login error, get the targetUrl from session again.
			String targetUrl = getRememberMeTargetUrlFromSession(request);
			System.out.println("TARGET URL::: " + targetUrl);
			if (StringUtils.hasText(targetUrl)) {
				System.out.println("StringUTILSSS");
				model.addObject("targetUrl", targetUrl);
				model.addObject("loginUpdate", true);
			}

		}

		if (logout != null) {
			System.out.println("44444444444444444444");

			model.addObject("msg", "You've been logged out successfully.");
		}
		System.out.println("VIEW is LOGIN");
		model.setViewName("login");

		return model;

	}

	/**
	 * Check if user is login by remember me cookie, refer
	 * org.springframework.security
	 * .authentication.AuthenticationTrustResolverImpl
	 */
	private boolean isRememberMeAuthenticated() {

		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		if (authentication == null) {
			return false;
		}

		return RememberMeAuthenticationToken.class
				.isAssignableFrom(authentication.getClass());
	}

	/**
	 * save targetURL in session
	 */
	private void setRememberMeTargetUrlToSession(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.setAttribute("targetUrl", "/admin/update");
		}
	}

	/**
	 * get targetURL from session
	 */
	private String getRememberMeTargetUrlFromSession(HttpServletRequest request) {
		String targetUrl = "";
		HttpSession session = request.getSession(false);
		if (session != null) {
			targetUrl = session.getAttribute("targetUrl") == null ? ""
					: session.getAttribute("targetUrl").toString();
		}
		System.out.println("Checking target url ::: " + targetUrl);
		return targetUrl;
	}

}