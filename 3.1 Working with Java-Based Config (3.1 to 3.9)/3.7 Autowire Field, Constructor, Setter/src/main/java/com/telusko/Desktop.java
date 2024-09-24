package com.telusko;

import org.springframework.stereotype.Component;
//@Component("com2")  insert it in component attribute then it will be your bean name
@Component
public class Desktop implements Computer {

	public  Desktop() {
		System.out.println("Desktop  Object Created");
	}
	@Override
	public void compile() {
		System.out.println("Compiling using Desktop");
	}
}
