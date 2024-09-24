package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;
	
	//@Autowired
	//@Qualifier("laptop")
	//@Qualifier("com2")
	private Computer com;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {   
		this.age = age;
	}
	
	public Computer getCom() {
		return com;
	}
	
	
	@Autowired
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}


	// three types of autowire
	// Constructor, setter, field injection. Write on top of these to invoke
	
}
