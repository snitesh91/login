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
	public Integer insertNewUser(User user) {
		user.setFailedLoginCount(0);
		user.setActive(true);
		user.setLastLoginTime(null);
		Integer isSuccessfull = userDao.insertNewUser(user);
		return isSuccessfull;
	}

	@Override
	public User getUserByEmailId(String emailId) {
		return userDao.getUserByEmailId(emailId);
	}

}
