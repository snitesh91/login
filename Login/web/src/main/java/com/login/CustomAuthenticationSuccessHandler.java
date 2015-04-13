package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.login.service.UserService;

@Component("authenticationSuccessHandler")
public class CustomAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
	

@Autowired
private UserService userService;	

private static final String defaultTargetUrl = "/welcome"; 

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		if(authentication.getPrincipal() instanceof CustomUserDetails){
			this.setUserPropertes((CustomUserDetails)authentication.getPrincipal());
		}
		super.setDefaultTargetUrl(defaultTargetUrl);
		  super.onAuthenticationSuccess(request, response, authentication);	
	}

	private void setUserPropertes(CustomUserDetails userDetails) {
		userDetails.getUser().setFailedLoginCount(0);
		}
}
