package com.telusko.app;

import org.springframework.stereotype.Component;

//component tells spring to create object of this class because there are hundereds of class and we dont want spring to create object of each class
@Component
public class Alien {
    public  void code() {
        System.out.println("Coding");
    }
    }

