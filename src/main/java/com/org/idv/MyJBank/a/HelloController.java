package com.org.idv.MyJBank.a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 public String getHello() {
		
        UserLoginImpl impl = new UserLoginImpl();
        UserLoginVO vo = impl.login("many77", "abc123");
        
        return vo.toString();
    }

}
