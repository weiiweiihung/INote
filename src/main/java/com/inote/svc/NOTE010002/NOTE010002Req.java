package com.inote.svc.NOTE010002;

import com.inote.svc.ReqDad;

public class NOTE010002Req extends ReqDad {
	protected String userName;
	protected String pass;
	protected String cCustName ;
	protected String cCustCell ;
	protected String cCustBirth;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getcCustName() {
		return cCustName;
	}
	public void setcCustName(String cCustName) {
		this.cCustName = cCustName;
	}
	public String getcCustCell() {
		return cCustCell;
	}
	public void setcCustCell(String cCustCell) {
		this.cCustCell = cCustCell;
	}
	public String getcCustBirth() {
		return cCustBirth;
	}
	public void setcCustBirth(String cCustBirth) {
		this.cCustBirth = cCustBirth;
	}
	@Override
	public String toString() {
		return "NOTE010002Req [userName=" + userName + ", pass=" + pass + ", cCustName=" + cCustName + ", cCustCell="
				+ cCustCell + ", cCustBirth=" + cCustBirth + "]";
	}
	
}
