package com.inote.svc.NOTE010002;

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
public class NOTE010002Controller {

	@RequestMapping("/NOTE010002")
	 public String getHello(@RequestBody NOTE010002Req req) {
		System.out.println("***: "+req);
        
        UserLoginModel model = new UserLoginModel();
        model.setUserName 	(req.getUserName	());
        model.setUserPass 	(req.getPass		());
        model.setCustName 	(req.getcCustName 	());
        model.setCustCell	(req.getcCustCell 	());
        model.setCustBirth 	(req.getcCustBirth	());

        UserLoginDao impl = new UserLoginDao();
        int i = impl.addUser(model);
        
        NOTE010002Res res = new NOTE010002Res();
        if(i==1) {
        	res.setRc("M000");	//insert成功
        	
        } else {
        	res.setRc("M999"); //insert失敗
        	
        }
        
        return res.getRc();
    }

}
