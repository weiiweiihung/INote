package com.inote.svc;

import org.springframework.web.bind.annotation.RequestBody;
import com.inote.exception.MSGException;

public interface ControllerDadInterface<TReq extends ReqDad, TRes extends ResDad> {

	public TRes doController (@RequestBody TReq req) throws MSGException;
}
