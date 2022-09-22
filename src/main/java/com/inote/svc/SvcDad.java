package com.inote.svc;

import org.springframework.web.bind.annotation.RequestBody;
import com.inote.exception.MSGException;

public interface SvcDad<T extends ReqDad> {

	public String doSvc (@RequestBody T req) throws MSGException;
}
