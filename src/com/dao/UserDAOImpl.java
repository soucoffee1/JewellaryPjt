package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Users;
import com.database.connection.JDBCConnectivity;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean findUser(String Username) throws SQLException {
		// TODO Auto-generated method stub
		List<Users> userList = new ArrayList<>();
		Connection con = JDBCConnectivity.getDbConnection();
		PreparedStatement ps = con.prepareStatement("Select id,Name,password from Users where Users.Name = '"+Username+"'");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			Users user = new Users(id, name, password);
			userList.add(user);
		}
		
		if(userList.size() == 1) {
			return true;
		}else {
			return false;
		}
	}

}
