package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.User;
import com.login.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByUserName(String userName) {
		User user = userDao.getUserByUserName(userName);
		return user;
	}

	public Integer insert(User user) {
		user.setFailedLoginCount(0);
		user.setActive(true);
		user.setLastLoginTime(null);
		Integer isSuccessfull = userDao.insert(user);
		return isSuccessfull;
	}

}
