package com.inote.svc;

import com.inote.tool.TimeFormatTool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResDad {
	private String rc;
	private String msg;
	private String time = TimeFormatTool.getYyyyMmDdHhMmSsSss();

}
