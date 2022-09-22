package com.inote.svc.NOTE010001;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.svc.SvcDad;

public class NOTE010001 implements SvcDad<NOTE010001Req> {

	@Override
	public String doSvc(@RequestBody NOTE010001Req req) {
		System.out.println("***: "+req);
        UserLoginDao impl = new UserLoginDao();
        UserLoginModel vo = impl.login(req.getUserName(), req.getPass()); // "many77", "abc123"
        
        NOTE010001Res res = new NOTE010001Res();
        if(vo==null) {
        	 res.setRc("M999"); //登入失敗
        	
        } else {
        	res.setRc("M000");	//登入成功
        }
        
        return res.getRc();
    }
}
