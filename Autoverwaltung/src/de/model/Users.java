package de.model;

import de.enums.UserTypeConst;

public class Users implements UserTypeConst{
	private final String id;
	private final String pwd;
	private final String email;
	public static String userType;
	public static int loginState = 0;
	public Users(String id, String pwd, String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
}
