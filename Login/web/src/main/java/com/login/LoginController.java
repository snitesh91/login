package com.login;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.UIManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private Exception getException(HttpServletRequest request) {
		Exception exception = (Exception) request.getSession().getAttribute(
				"SPRING_SECURITY_LAST_EXCEPTION");
		return exception;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(final Model model, final User user,
			Principal principal, HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		// User is already loged in
		if (principal != null) {
			response.sendRedirect("welcome");
			return null;
		}

		model.addAttribute("pageType", "loginPage");
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginFailed(HttpServletRequest request, final Model model,Principal  principal, HttpServletResponse  response ) throws IOException {
		Exception exception = this.getException(request);
		// Exception occured while login
		if (exception != null) {
			String errorMessage = exception.getMessage();
			model.addAttribute("error", true);
			model.addAttribute("errorMessage", errorMessage);
		}

		// User is already loged in
		if (principal != null) {
			response.sendRedirect("welcome");
			return null;
		}

		model.addAttribute("pageType", "loginfailed");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(final Model model, Principal principal , HttpServletResponse  response ) throws IOException {

		// User is already loged in
		if (principal != null) {
			response.sendRedirect("welcome");
			return null;
		}

		model.addAttribute("pageType", "logout");
		return "login";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {

		return "welcome";
	}

}