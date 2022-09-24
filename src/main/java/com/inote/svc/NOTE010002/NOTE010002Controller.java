package com.inote.svc.NOTE010002;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.exception.MSGException;
import com.inote.svc.ControllerDadInterface;
import com.inote.svc.NOTE010001.NOTE010001Req;
import com.inote.svc.NOTE010001.NOTE010001Res;

/**
 * 
 * @author jenny
 * 登入
 * 
 *	url (http://localhost:8080/NOTE010001)
 */
@RestController
public class NOTE010002Controller implements ControllerDadInterface<NOTE010002Req,NOTE010002Res> {

	@Override
	@RequestMapping("/NOTE010002")
	public NOTE010002Res doController(@RequestBody NOTE010002Req req) throws MSGException {
		NOTE010002 note010002 = new NOTE010002();
		return note010002.doSvc(req);
    }

}
