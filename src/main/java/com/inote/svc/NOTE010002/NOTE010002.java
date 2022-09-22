package com.inote.svc.NOTE010002;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.exception.MSGException;
import com.inote.svc.SvcDad;

public class NOTE010002 implements SvcDad<NOTE010002Req> {
	
	@Override
	public String doSvc(@RequestBody NOTE010002Req req) throws MSGException {
		System.out.println("***: "+req);
		NOTE010002Res res = new NOTE010002Res();
		
		if(reqCheck(req)==false) {
			res.setRc("M997");
			throw new MSGException("M997");
		}
        UserLoginModel model = new UserLoginModel();
        model.setUserName 	(req.getUserName	());
        model.setUserPass 	(req.getPass		());
        model.setCustName 	(req.getcCustName 	());
        model.setCustCell	(req.getcCustCell 	());
        model.setCustBirth 	(req.getcCustBirth	().replace("-", ""));

        UserLoginDao impl = new UserLoginDao();
        int i = impl.addUser(model);
        
        
        if(i==1) {
        	res.setRc("M000");	//insert成功
        	
        }
        else {
        	res.setRc("M999"); //insert失敗
        	
        }
        
        System.out.println("res.getRc(): "+res.getRc());
        return res.getRc();
	}
	
	private static boolean reqCheck(NOTE010002Req req) {
		return
				!req.userName.trim().equals("")  &&
				!req.pass.trim().equals("") 	 &&
				!req.cCustName.trim().equals("") &&
				!req.cCustCell.trim().equals("") &&
				!req.cCustBirth.trim().equals("") 
				? true : false ;
	}
}
