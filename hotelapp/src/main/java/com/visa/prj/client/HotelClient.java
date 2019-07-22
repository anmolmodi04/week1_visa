package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.visa");
		ctx.refresh();
	
	}

}
