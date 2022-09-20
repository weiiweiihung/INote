CREATE DATABASE APDATA

CREATE TABLE UserLogin(
    UserName 	VARCHAR (50) NOT NULL DEFAULT '', --帳號(信箱)
    UserPass 	VARCHAR (50) NOT NULL DEFAULT '', --密碼
	
	CustName 	VARCHAR (50) NOT NULL DEFAULT '', --姓名
	CustCell	VARCHAR (50) NOT NULL DEFAULT '', --手機
	CustBirth 	VARCHAR (50) NOT NULL DEFAULT ''  --西元出生年月日
	)


