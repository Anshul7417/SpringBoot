package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create and getting a container
        // create xml file in resources folder only otherwise it will give error.
    	Alien obj = (Alien) context.getBean("alien");                // Now it will work because we have create spring.xml file
    	obj.code();
    	
    }
}
