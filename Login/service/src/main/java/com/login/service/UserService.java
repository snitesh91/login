package com.login.service;

import com.login.User;

public interface UserService {
	
	public User getUserByUserName(String userName);
	
	public Integer insert(User user);

}
