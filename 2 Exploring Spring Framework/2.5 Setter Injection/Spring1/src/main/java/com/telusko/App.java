package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
    	Alien obj1 = (Alien) context.getBean("alien1");
//    	obj1.setAge(21);        we are using setter injection
    	System.out.println(obj1.getAge());
    	
    	obj1.code();

    	
    }
}
