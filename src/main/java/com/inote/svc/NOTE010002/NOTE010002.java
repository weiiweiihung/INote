package com.inote.svc.NOTE010002;

import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.exception.MSGException;
import com.inote.svc.SvcDadInterface;
import com.inote.svc.NOTE010001.NOTE010001Req;
import com.inote.svc.NOTE010001.NOTE010001Res;
import com.inote.tool.JacksonTool;

public class NOTE010002 implements SvcDadInterface<NOTE010002Req,NOTE010002Res> {
	
	@Override
	public NOTE010002Res doSvc(@RequestBody NOTE010002Req req) throws MSGException {
		System.out.println("***: "+req);
		NOTE010002Res res = new NOTE010002Res();
		
		if(reqCheck(req)==false) {
			res.setRc("M997");
			throw new MSGException("M997");
		}
        UserLoginModel model = new UserLoginModel();
        model.setUserName 	(req.getUserName	());
        model.setUserPass 	(req.getPass		());
        model.setCustName 	(req.getCustName	());
        model.setCustCell	(req.getCustCell	());
        model.setCustBirth 	(req.getCustBirth	().replace("-", ""));

        UserLoginDao impl = new UserLoginDao();
        int i = impl.addUser(model);
        
        
        if(i==1) {
        	res.setRc("M000");	//insert成功
        	
        }
        else {
        	res.setRc("M999"); //insert失敗
        	
        }
	
        // JacksonTool.toJsonRes(JacksonTool.getResJsonStr(res), NOTE010002Res.class);
        return res;
	}
	
	private static boolean reqCheck(NOTE010002Req req) {
		return
				!req.getUserName().trim().equals("")  &&
				!req.getPass().trim().equals("") 	 &&
				!req.getCustName().trim().equals("") &&
				!req.getCustCell().trim().equals("") &&
				!req.getCustBirth().trim().equals("") 
				? true : false ;
	}
}
