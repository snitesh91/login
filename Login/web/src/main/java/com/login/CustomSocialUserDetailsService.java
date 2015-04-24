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
import org.springframework.stereotype.Service;

import com.login.service.UserService;

@Service("socialUserDetailsService")
public class CustomSocialUserDetailsService implements SocialUserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public SocialUserDetails loadUserByUserId(String emailId)
			throws UsernameNotFoundException, DataAccessException {
		if(emailId==null){
			throw new UsernameNotFoundException("Email Id is cannot be null.");
		}
		User user = userService.getUserByEmailId(emailId);
		if(user == null){
			throw new UsernameNotFoundException("Email id doesnot exist.");
		}
		SocialUserDetails socialUserDetails  = new CustomSocialUserDetails(user);
		return socialUserDetails;
	}

}
