package com.inote.svc.NOTE010002;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.exception.MSGException;
import com.inote.svc.SvcDadInterface;
import com.inote.svc.NOTE010002.NOTE010002MSG.NOTE010002CodeEnum;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NOTE010002 implements SvcDadInterface<NOTE010002Req,NOTE010002Res> {
	
	final String cN0100021 = NOTE010002CodeEnum.N0100021.toString();//失敗
	final String cN0100022 = NOTE010002CodeEnum.N0100022.toString();//成功
	final String cN0100023 = NOTE010002CodeEnum.N0100023.toString();//輸入異常
	
	@Override
	public NOTE010002Res doSvc(@RequestBody NOTE010002Req req) throws MSGException {
		log.info("req: "+req);
		
        UserLoginDao impl = new UserLoginDao();
        
		NOTE010002Res res = new NOTE010002Res();
        NOTE010002MSG msg = new NOTE010002MSG();

		if(reqCheck(req)==false) {
			msg.setMessage(res, cN0100023);
			throw new MSGException();
		}

        int iAddUser = impl.addUser(setResModel(req));      
        if(iAddUser==1) {
        	msg.setMessage(res, cN0100021);        	
        }
        else {
        	msg.setMessage(res, cN0100022);       	
        }
	    return res;
	}
	
	private UserLoginModel setResModel(NOTE010002Req req) {
		UserLoginModel model = new UserLoginModel();
        model.setUserName 	(req.getUserName	());
        model.setUserPass 	(req.getPass		());
        model.setCustName 	(req.getCustName	());
        model.setCustCell	(req.getCustCell	());
        model.setCustBirth 	(req.getCustBirth	().replace("-", ""));
        return model;
	}
	
	private boolean reqCheck(NOTE010002Req req) {
		return
				!req.getUserName().trim().equals("")  &&
				!req.getPass().trim().equals("") 	 &&
				!req.getCustName().trim().equals("") &&
				!req.getCustCell().trim().equals("") &&
				!req.getCustBirth().trim().equals("") 
				? true : false ;
	}
}
