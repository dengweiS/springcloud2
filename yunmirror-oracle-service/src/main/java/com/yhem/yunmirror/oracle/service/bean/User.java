package com.yhem.yunmirror.oracle.service.bean;



public class User {
	private int id;
	private String userName;
	private int age;
	private String password;

	public User() {
	}

	public User(String username, int age) {
		this.userName = username;
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}