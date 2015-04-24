package com.login;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

import com.login.service.UserService;

public class CustomSocialUserDetailsService implements SocialUserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public SocialUserDetails loadUserByUserId(String emailId)
			throws UsernameNotFoundException, DataAccessException {
		User user = userService.getUserByEmailId(emailId);
		SocialUserDetails socialUserDetails  = new CustomSocialUserDetails(user);
		return socialUserDetails;
	}

}
