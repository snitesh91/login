package com.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.service.UserServiceImpl;

@Service("userDetailsService")
public class CustomUserDetailService implements UserDetailsService{

	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		if(username.equalsIgnoreCase("")){
			throw new UsernameNotFoundException("User not found");
		}
		User user = userServiceImpl.getUserByUserName(username);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		UserDetails userDetails = new CustomUserDetails(user);
		return userDetails;
	}

}
