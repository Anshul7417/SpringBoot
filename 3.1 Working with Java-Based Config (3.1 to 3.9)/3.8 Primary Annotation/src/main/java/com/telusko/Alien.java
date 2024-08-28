package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;
	
	//@Autowired
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
    @Qualifier("laptop")          // If we write both qualifier and primary, Qualifier will be preferred
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}
	
}
