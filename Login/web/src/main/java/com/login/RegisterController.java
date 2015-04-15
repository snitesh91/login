package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.service.UserServiceImpl;

@Controller
public class RegisterController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/create-account" ,method=RequestMethod.POST)
	public String registerNewUser(@ModelAttribute User user,Model model){
		if(userServiceImpl.getUserByUserName(user.getUserName())!=null){
			model.addAttribute("error",true);
			model.addAttribute("errorMessage","User Name already exits.");
			return "redirect:register";
		}
		
		Integer isSuccessfull = userServiceImpl.insert(user);
		if(isSuccessfull==0){
			model.addAttribute("error",true);
			model.addAttribute("errorMessage","Unexpexted Error.Please try after some time");
			return "redirect:register";
		}
		return "login";
		
	}
}
