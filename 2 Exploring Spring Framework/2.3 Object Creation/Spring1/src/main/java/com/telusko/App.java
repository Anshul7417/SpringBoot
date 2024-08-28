package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container, and creates object using spring.xml file. It means object is created here
		
//    	Alien obj = (Alien) context.getBean("alien");          // object are just getting here from spring container
    	
		Alien obj1 = (Alien) context.getBean("alien1");        // Only one object is created
    	obj1.code();
    	
    	Alien obj2 = (Alien) context.getBean("alien1");        // Only one object is created because same bean name
    	obj2.code();



		// How many beans you write in xml file that many objects will be created
    	
    }
}
