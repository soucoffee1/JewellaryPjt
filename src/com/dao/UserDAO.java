package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.bean.Users;

public interface UserDAO {
	public boolean findUser(String Username) throws SQLException;
}
