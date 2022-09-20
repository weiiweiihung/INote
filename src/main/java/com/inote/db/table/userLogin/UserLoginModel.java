package com.inote.db.table.userLogin;

public class UserLoginModel {
	
	private String UserName  ;  // VARCHAR (50) NOT NULL DEFAULT '', --帳號(信箱)
	private String UserPass  ;	// VARCHAR (50) NOT NULL DEFAULT '', --密碼
	
	private String CustName  ;	// VARCHAR (50) NOT NULL DEFAULT '', --姓名
	private String CustCell	 ;	// VARCHAR (50) NOT NULL DEFAULT '', --手機
	private String CustBirth ;	// VARCHAR (50) NOT NULL DEFAULT ''  --西元出生年月日
	
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
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCustCell() {
		return CustCell;
	}
	public void setCustCell(String custCell) {
		CustCell = custCell;
	}
	public String getCustBirth() {
		return CustBirth;
	}
	public void setCustBirth(String custBirth) {
		CustBirth = custBirth;
	}
	@Override
	public String toString() {
		return "UserLoginModel [UserName=" + UserName + ", UserPass=" + UserPass + ", CustName=" + CustName
				+ ", CustCell=" + CustCell + ", CustBirth=" + CustBirth + "]";
	}
	
	
}
