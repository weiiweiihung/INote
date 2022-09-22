package com.inote.svc.NOTE010001;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.exception.MSGException;
import com.inote.svc.SvcDad;
import com.inote.svc.NOTE010002.NOTE010002;
import com.inote.svc.NOTE010002.NOTE010002Req;

/**
 * 
 * @author jenny
 * 登入
 * 
 *	url (http://localhost:8080/NOTE010001)
 */
@RestController
public class NOTE010001Controller implements SvcDad<NOTE010001Req> {
	@Override
	@RequestMapping("/NOTE010001")
	public String doSvc(@RequestBody NOTE010001Req req) throws MSGException {
		NOTE010001 note010001 = new NOTE010001();
		return note010001.doSvc(req);
    }
}
