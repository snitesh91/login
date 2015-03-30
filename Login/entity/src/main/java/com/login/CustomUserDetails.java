package com.login;

import org.springframework.security.core.userdetails.UserDetails;


public final class CustomUserDetails implements UserDetails{
	private User user;
	private String[] authorities;

}
