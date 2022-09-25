package com.inote.svc.NOTE010001;

import com.inote.svc.ReqDad;
import com.inote.tool.JacksonTool;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
public class NOTE010001Req extends ReqDad {
	private String userName;
	private String pass;
	
	@Override
	public String toString() {
		return JacksonTool.writeValueToString(this);
	}
}
