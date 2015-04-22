package com.login;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.enums.SocialMediaService;
import com.login.service.UserServiceImpl;

@Controller
public class RegisterController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute("loginMechanism",SocialMediaService.None);
		return "register";
	}
	
	@RequestMapping(value="/create-account" ,method=RequestMethod.POST)
	public String registerNewUser(@ModelAttribute RegistrationForm registrationForm,Model model){
		User user =userServiceImpl.getUserByEmailId(registrationForm.getEmailId());
		if(user != null){
			model.addAttribute("error",true);
			model.addAttribute("errorMessage","Email Id is already used to create a account.");
			return "redirect:register";
		}
		if(!registrationForm.getPassword().equals(registrationForm.getPasswordVerification())){
			model.addAttribute("error",true);
			model.addAttribute("errorMessage","Passport mismatch.");
			return "redirect:register";
			
		}
		user = new User();
		user.setFirstName(registrationForm.getFirstName());
		user.setLastName(registrationForm.getLastName());
		user.setEmailId(registrationForm.getEmailId());
		user.setPassword(registrationForm.getPassword());
		user.setLoginMechanism(registrationForm.getSocialMediaService().getId());
		
		Integer isSuccessfull = userServiceImpl.insert(user);
		if(isSuccessfull==0){
			model.addAttribute("error",true);
			model.addAttribute("errorMessage","Unexpexted Error.Please try after some time");
			return "redirect:register";
		}
		
		return "redirect:login";
	}
}
