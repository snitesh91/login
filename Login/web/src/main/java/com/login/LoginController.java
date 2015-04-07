package com.login;

import javax.swing.UIManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController
{
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(final Model model,final User user){
		return "login";
	}
	
	@RequestMapping(value="/loginfailed", method= RequestMethod.GET)
	public String loginFailed(){
		
		return "login";
	}


}