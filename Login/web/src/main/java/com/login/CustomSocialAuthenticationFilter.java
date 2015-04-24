package com.login;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.social.UserIdSource;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.security.SocialAuthenticationFilter;
import org.springframework.social.security.SocialAuthenticationServiceLocator;

public class CustomSocialAuthenticationFilter extends SocialAuthenticationFilter{

	public CustomSocialAuthenticationFilter(AuthenticationManager authManager,
			UserIdSource userIdSource,
			UsersConnectionRepository usersConnectionRepository,
			SocialAuthenticationServiceLocator authServiceLocator) {
		super(authManager, userIdSource, usersConnectionRepository, authServiceLocator);
	}

}
