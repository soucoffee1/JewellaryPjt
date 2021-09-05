package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Users;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;


public class UsersDetailsImpl implements UserDetails{

	private UserDAO userDao = new UserDAOImpl();
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findUser(String Username) {
		// TODO Auto-generated method stub
		boolean user_valid = false;
		try {
			user_valid = userDao.findUser(Username);
		}catch (Exception e){
			
		}
		return user_valid;
	}
	

}
