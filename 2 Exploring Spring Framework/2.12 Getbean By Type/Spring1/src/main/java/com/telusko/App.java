package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
    	Alien obj1 = context.getBean("alien1",Alien.class);
		// In above line we dont have to typecast as we are mentioning that we want Alien.class object.
    	System.out.println(obj1.getAge());
    	
    	obj1.code();
//    	
//    	Alien obj2 = (Alien) context.getBean("alien1");                 //here we are typecasting
//    	System.out.println(obj2.age);
//    	//obj2.code();
   
    	
//       Computer com =	context.getBean( Desktop.class);               // it search by type. If two desktop are presnt then primary
    	//Computer is interface hence it is also allowed
        Computer com =	context.getBean( Computer.class);              // if both laptop and desktop are present then primary
    	
    }
}
