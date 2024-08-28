package com.telusko.app.service;

import org.springframework.stereotype.Service;

import com.telusko.app.model.Laptop;

@Service          // This annotation behaves just like component but for the sake of clarity we are using it. It helps us to understand that we are working with Service class
public class LaptopService {

	public void add(Laptop laptop) {
		System.out.println("method called");
		
	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
	
}
