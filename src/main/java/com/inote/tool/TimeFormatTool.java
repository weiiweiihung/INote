package com.inote.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatTool {
	
	public static String getYyyyMmDdHhMmSsSss() {
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS").format(new Date());
	}
}
