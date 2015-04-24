package com.login;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.social.security.SocialUserDetails;

public class CustomSocialUserDetails implements SocialUserDetails {
	
	private User user;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
		if (user.isAdmin() == true) {
			authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		}
		return authorities;

 	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmailId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		if (user.getFailedLoginCount() > 5) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return user.isActive();
	}

	@Override
	public String getUserId() {
		return user.getEmailId();
	}
	
	public CustomSocialUserDetails(User user){
		this.user = user;
	}

}
