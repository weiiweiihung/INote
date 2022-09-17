package com.org.idv.MyJBank.db.vo;

public class UserLoginVO {
	protected String UserName;
	protected String UserPass;

	public UserLoginVO() {
		super();
	}
	public UserLoginVO(String userName, String userPass) {
		super();
		UserName = userName;
		UserPass = userPass;
	}


	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	@Override
	public String toString() {
		return "UserLoginVO [UserName=" + UserName + ", UserPass=" + UserPass + "]";
	}
	
	
}
