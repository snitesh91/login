package com.login.Utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationUtils{

	public static String getEmailId(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email = auth.getName();
		return email;
	}
	
}