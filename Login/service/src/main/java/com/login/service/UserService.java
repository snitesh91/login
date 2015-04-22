package com.login.service;

import com.login.User;

public interface UserService {
	
	public Integer insert(User user);
	
	public User getUserByEmailId(String email);

}
