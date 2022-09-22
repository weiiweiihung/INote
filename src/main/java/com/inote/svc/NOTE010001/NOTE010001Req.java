package com.inote.svc.NOTE010001;

import com.inote.svc.ReqDad;

public class NOTE010001Req extends ReqDad {
	protected String userName;
	protected String pass;
	
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
	
	
}
