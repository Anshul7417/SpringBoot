package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age = 21;
        System.out.println(obj1.age);      //21
        
        //obj1.code();
        
        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);        //21 because same object
        //obj2.code();



        // There are many types of scope----
        //singleton, prototype, session and request (last 2 used in web and websockets)
        // Now default is singleton means how many times you call getbean only one obj is created to change this change in spring.xml file scope prototype. now object is created only when you call getbean and if scope is prototype then if only one bean in spring.xml and two get bean then two objects are created.

        //Singleton m applicationcontext call hote hi Object bn jata h 
    	
    }
}
