package com.bean;

public class Users {

	private int id;
	private String Username;
	private String password;
	
	public Users(int id, String username, String password) {
		super();
		this.id = id;
		Username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
