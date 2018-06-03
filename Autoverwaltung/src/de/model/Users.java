package de.model;

public class Users implements UserTypeEnum{
	private final String id;
	private final String pwd;
	public static String userType;
	public Users(String id, String pwd, String userType) {
		this.id = id;
		this.pwd = pwd;
		Users.userType = userType;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
}
