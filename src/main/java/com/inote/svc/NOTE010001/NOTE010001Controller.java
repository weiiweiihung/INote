package com.inote.svc.NOTE010001;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;

/**
 * 
 * @author jenny
 * 登入
 * 
 *	url (http://localhost:8080/NOTE010001)
 */
@RestController
public class NOTE010001Controller {

	@RequestMapping("/NOTE010001")
	 public String getHello(@RequestBody NOTE010001Req req) {
		
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
