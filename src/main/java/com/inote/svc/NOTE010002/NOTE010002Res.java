package com.inote.svc.NOTE010002;

import com.inote.svc.ResDad;
import com.inote.tool.JacksonTool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NOTE010002Res extends ResDad {
	
	@Override
	public String toString() {
		return JacksonTool.writeValueToString(this);		
	}
}
