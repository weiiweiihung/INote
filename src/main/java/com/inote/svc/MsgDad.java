package com.inote.svc;

import com.inote.db.table.message.MessageDao;
import com.inote.db.table.message.MessageModel;
import com.inote.svc.NOTE010001.NOTE010001Res;

public class MsgDad<TRes extends ResDad> {
	
	public static MessageModel selectKey(String code) {
		MessageDao daoMessage = new MessageDao();
		return daoMessage.selectKey(code);
	}
	
	public void setMessage(TRes res,String code) {
		res.setRc(code);	//登入成功       	
    	res.setMsg(MsgDad.selectKey(code).getMSGCh());	//登入成功
	}
}
