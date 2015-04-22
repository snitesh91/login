package com.login.dao;

import com.login.User;

public interface UserDao{

	public Integer insert(User user);

	public User getUserByEmailId(String emailId);

}
