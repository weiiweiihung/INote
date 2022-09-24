package com.inote.svc;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.exception.MSGException;
import com.inote.svc.NOTE010001.NOTE010001Res;

public interface SvcDadInterface<T extends ReqDad,T1 extends ResDad> {
	public T1 doSvc (@RequestBody T req) throws MSGException;

}
