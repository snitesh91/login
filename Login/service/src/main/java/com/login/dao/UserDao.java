package com.login.dao;

import com.login.User;

public interface UserDao{

	public User getUserByUserName(String userName);

	public Integer insert(User user);

}
