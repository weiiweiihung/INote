package com.org.idv.MyJBank.a;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.idv.MyJBank.a.entity.HelloReq;
import com.org.idv.MyJBank.a.entity.HelloRes;
import com.org.idv.MyJBank.db.impl.UserLoginImpl;
import com.org.idv.MyJBank.db.vo.UserLoginVO;

/**
 * 
 * @author jenny
 * TODO 測試主執行和controller
 * 
 *	url (http://localhost:8080/hello)
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	 public String getHello(@RequestBody HelloReq req) {
		
        UserLoginImpl impl = new UserLoginImpl();
        UserLoginVO vo = impl.login(req.getUserName(), req.getPass()); // "many77", "abc123"
        
        HelloRes res = new HelloRes();
        if(vo==null) {
        	 res.setRc("M999"); //登入失敗
        	
        } else {
        	res.setRc("M000");	//登入成功
        }
        
        return res.getRc();
    }

}
