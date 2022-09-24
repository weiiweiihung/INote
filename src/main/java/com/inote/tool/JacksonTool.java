package com.inote.tool;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inote.svc.ResDad;

public class JacksonTool {
	
	 public static <T> T toJsonRes(String jsonString, Class<T> object){
	        if (jsonString == null || object == null){
	        	System.out.println("fromJSONString format error");
	            return null;
	        }

	        try{
	            ObjectMapper mapper = new ObjectMapper();
	            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
	            return mapper.readValue(jsonString, object);
	        }
	        catch (Exception e) {
	        	e.printStackTrace();
	            return null;
	        }
	    }
	 
//	 public static<T extends ReqDad> String writeValueToString(NOTE010001Res note010001Res) {
	 public static String writeValueToString(Object str) {
		 try {
			 ObjectMapper mapper = new ObjectMapper();
			 return mapper.writeValueAsString(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return null;
	 }
	 
	 public static<T extends ResDad> String getResJsonStr(T res) {
		 ObjectMapper mapper = null;
		 try {
			 mapper = new ObjectMapper();
			 return mapper.writeValueAsString(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return null;
	 }
} 
