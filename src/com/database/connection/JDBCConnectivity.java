package com.database.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectivity {
	
	public static Connection connObj;
	public static String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=jewellery_shop;integratedSecurity=true";
    
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getDbConnection() {
		try {			
			connObj = DriverManager.getConnection(JDBC_URL,"sa","soundarrajan");
       
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return connObj;
	}
}
