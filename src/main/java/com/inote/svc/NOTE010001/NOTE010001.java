package com.inote.svc.NOTE010001;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.db.table.message.MessageDao;
import com.inote.db.table.message.MessageModel;
import com.inote.db.table.userLogin.UserLoginDao;
import com.inote.db.table.userLogin.UserLoginModel;
import com.inote.svc.SvcDadInterface;
import com.inote.svc.NOTE010001.NOTE010001MSG.NOTE010001CodeEnum;
import com.inote.tool.JacksonTool;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NOTE010001 implements SvcDadInterface<NOTE010001Req,NOTE010001Res> {

	@Override
	public NOTE010001Res doSvc(@RequestBody NOTE010001Req req){
		// Logger logger = LoggerFactory.getLogger(getClass());
		log.info("************ "+req);
		System.out.println("***: "+req);
        UserLoginDao impl = new UserLoginDao();
        UserLoginModel vo = impl.login(req.getUserName(), req.getPass()); // "many77", "abc123"
        
        NOTE010001Res res = new NOTE010001Res();
        NOTE010001MSG msg = new NOTE010001MSG();
        if(vo==null) {
        	 res.setRc("M999"); //登入失敗
        	
        } else {
        	String code = NOTE010001CodeEnum.M000.toString();
        	res.setRc(code);	//登入成功
        	res.setMsg(msg.selectKey(code).getMSGCh());	//登入成功
        }

		//NOTE010001Res deserializedWriter = mapper.readValue(jsonString, NOTE010001Res.class);
        
        //JacksonTool.toJsonRes(JacksonTool.getResJsonStr(res), NOTE010001Res.class)
        return res;
    }
}
