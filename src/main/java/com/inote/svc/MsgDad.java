package com.inote.svc;

import com.inote.db.table.message.MessageDao;
import com.inote.db.table.message.MessageModel;

public class MsgDad {
	
	public MessageModel selectKey(String code) {
		MessageDao daoMessage = new MessageDao();
		return daoMessage.selectKey(code);
	}
	


}
