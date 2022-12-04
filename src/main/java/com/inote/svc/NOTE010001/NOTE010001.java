package com.inote.svc.NOTE010001;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.svc.SvcDadInterface;
import com.inote.svc.NOTE010001.NOTE010001MSG.NOTE010001CodeEnum;
import com.inote.svc.NOTE010002.NOTE010002MSG.NOTE010002CodeEnum;

import lombok.extern.log4j.Log4j2;

/**
 * 登入
 * @author jenny
 *
 */
@Log4j2
public class NOTE010001 implements SvcDadInterface<NOTE010001Req,NOTE010001Res> {
	
	final String cN0100011 = NOTE010001CodeEnum.N0100011.toString();//成功
	final String cN0100012 = NOTE010001CodeEnum.N0100012.toString();//失敗
	final String cN0100013 = NOTE010002CodeEnum.N0100023.toString();//輸入異常
	
	@Override
	public NOTE010001Res doSvc(@RequestBody NOTE010001Req req){
		log.info("req: "+req);
        UserLoginDao impl = new UserLoginDao();
        UserLoginModel vo = impl.login(req.getUserName(), req.getPass()); // "many77", "abc123"
System.out.println("*** "+vo);        
        NOTE010001Res res = new NOTE010001Res();
        NOTE010001MSG msg = new NOTE010001MSG();
        
        if(vo==null) {
        	msg.setMessage(res, cN0100012);
        	
        } else {
        	msg.setMessage(res, cN0100011);
        }

		//NOTE010001Res deserializedWriter = mapper.readValue(jsonString, NOTE010001Res.class);       
        //JacksonTool.toJsonRes(JacksonTool.getResJsonStr(res), NOTE010001Res.class)
        
        return res;
    }
}
