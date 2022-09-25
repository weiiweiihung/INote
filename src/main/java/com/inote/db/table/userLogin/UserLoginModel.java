package com.inote.db.table.userLogin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginModel {
	
	private String UserName  ;  // VARCHAR (50) NOT NULL DEFAULT '', --帳號(信箱)
	private String UserPass  ;	// VARCHAR (50) NOT NULL DEFAULT '', --密碼
	
	private String CustName  ;	// VARCHAR (50) NOT NULL DEFAULT '', --姓名
	private String CustCell	 ;	// VARCHAR (50) NOT NULL DEFAULT '', --手機
	private String CustBirth ;	// VARCHAR (50) NOT NULL DEFAULT ''  --西元出生年月日
	
}
