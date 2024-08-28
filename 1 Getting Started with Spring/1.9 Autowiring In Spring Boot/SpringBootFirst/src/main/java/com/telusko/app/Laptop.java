package com.telusko.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    //since we are using component it is creating object in IOC container but object is not available in Alien class. To do so we have to use autowired attribute.
    public void compile(){
        System.out.println("compiling");
    }
}
