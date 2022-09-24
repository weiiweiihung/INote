package com.inote.svc;

import org.springframework.web.bind.annotation.RequestBody;

import com.inote.exception.MSGException;
import com.inote.svc.NOTE010001.NOTE010001Res;

public interface SvcDadInterface<TReq extends ReqDad,TRes extends ResDad> {
	public TRes doSvc (@RequestBody TReq req) throws MSGException;

}
