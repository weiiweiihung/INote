package com.org.idv.MyJBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author jenny
 * 啟動類
 */
@SpringBootApplication(scanBasePackages = "com.org.idv.MyJBank.a")
public class WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
