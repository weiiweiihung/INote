package com.inote.svc.NOTE010001;

import com.inote.svc.ResDad;
import com.inote.tool.JacksonTool;

import lombok.Getter;
import lombok.Setter;


@Getter 
@Setter
public class NOTE010001Res extends ResDad {

	public NOTE010001result result;
	
	@Getter 
	@Setter
	public static class NOTE010001result {
		private String a;
		private String b;
		private String c;
 
	}

//	@Override
//	public String toString() {
//		return JacksonTool.writeValueToString(this);
//	}

	
}
