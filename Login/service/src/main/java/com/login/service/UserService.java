package com.login.service;

import com.login.User;

public interface UserService {
	
	public Integer insertNewUser(User user);
	
	public User getUserByEmailId(String email);

}
