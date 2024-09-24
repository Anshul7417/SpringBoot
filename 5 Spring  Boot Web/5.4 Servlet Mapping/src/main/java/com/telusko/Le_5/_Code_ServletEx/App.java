package com.telusko.Le_5._Code_ServletEx;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);     // change port
        
        
        Context context=tomcat.addContext("", null);                      
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());      // we can change name of servlet but on both lines
        context.addServletMappingDecoded("/hello", "HelloServlet");        // here also
        
        tomcat.start();
        tomcat.getServer().await();


        // Basically we are learning embedded tomcat here, but when we are using external tomcat then we can easily do mapping using @Webservlet annotation.
    }
}
