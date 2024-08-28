package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

        public static void main(String[] args) {

                ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

                Alien obj;
                obj = context.getBean(Alien.class);
                obj.code();

                // Laptop lap =context.getBean(Laptop.class);         //it is running means object is present in IOC Container but if we are using in Alien class it is not functioning means we have to use autowired which means plss find it in IOC container and inject it here.
                // lap.compile();
        }

}
