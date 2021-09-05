package com.service;

import java.util.List;

import com.bean.Users;

public interface UserDetails {
 
	public List<Users> findAll();
	public boolean findUser(String Username);

}
