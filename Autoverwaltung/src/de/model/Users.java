package de.model;

import de.enums.UserTypeEnum;

public class Users implements UserTypeEnum{
	private final String id;
	private final String pwd;
	public static String userType;
	public Users(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
}
