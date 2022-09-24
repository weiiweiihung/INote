CREATE TABLE Message(
    MSGCode 	VARCHAR (50) NOT NULL DEFAULT '' UNIQUE, --代碼
    MSGCh 		VARCHAR (50) NOT NULL DEFAULT '', --代碼中文
	
	MSGGrade 	VARCHAR (50) NOT NULL DEFAULT '', --等級(0一般通知,1輸入錯誤,2內部通知.....)
	MSGRemark	VARCHAR (50) NOT NULL DEFAULT '' --備註
	)


