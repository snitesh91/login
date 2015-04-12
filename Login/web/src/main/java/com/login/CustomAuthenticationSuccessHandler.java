package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.login.service.UserService;

@Component("authenticationSuccessHandler")
public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
	
@Autowired
private UserService userService;	

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		this.setUserPropertes(authentication.getPrincipal().toString());
		  super.onAuthenticationSuccess(request, response, authentication);	
	}

	private void setUserPropertes(String userName) {
		User user = userService.getUserByUserName(userName);
		user.setFailedLoginCount(0);
		
	}
	

}
