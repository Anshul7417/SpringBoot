package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Desktop dt = context.getBean("desktop",Desktop.class);
		dt.compile();
		
		Desktop dt1 = context.getBean("desktop",Desktop.class);
		dt1.compile();
	}
}
