package com.login;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class CustomUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		if(username.equalsIgnoreCase("")){
			return null;
		}
		User user = userService.getUserByUserName(username);
		return user;
	}

}
