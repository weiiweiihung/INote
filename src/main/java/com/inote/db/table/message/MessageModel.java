package com.inote.db.table.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageModel {
	
	private String MSGCode 	 ; // VARCHAR (50) NOT NULL DEFAULT '' UNIQUE, --代碼
	private String MSGCh 	 ; // VARCHAR (50) NOT NULL DEFAULT '', --代碼中文
	private String MSGGrade  ; // VARCHAR (50) NOT NULL DEFAULT '', --等級(0一般通知,1輸入錯誤,2內部通知.....)
	private String MSGRemark ; // VARCHAR (50) NOT NULL DEFAULT '' --備註
	
}
