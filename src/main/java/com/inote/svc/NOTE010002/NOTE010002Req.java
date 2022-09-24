package com.inote.svc.NOTE010002;

import com.inote.svc.ReqDad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NOTE010002Req extends ReqDad {
	private String userName;
	private String pass;
	private String custName ;
	private String custCell ;
	private String custBirth;
	
	@Override
	public String toString() {
		return "NOTE010002Req [userName=" + userName + ", pass=" + pass + ", custName=" + custName + ", custCell="
				+ custCell + ", custBirth=" + custBirth + "]";
	}
}
