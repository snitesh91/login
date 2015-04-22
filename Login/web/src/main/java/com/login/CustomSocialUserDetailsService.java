package com.login;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

public class CustomSocialUserDetailsService implements SocialUserDetailsService {

	@Override
	public SocialUserDetails loadUserByUserId(String arg0)
			throws UsernameNotFoundException, DataAccessException {

		return null;
	}

}
