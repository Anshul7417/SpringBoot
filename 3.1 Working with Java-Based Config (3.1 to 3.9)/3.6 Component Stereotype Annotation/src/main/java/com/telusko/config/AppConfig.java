package com.telusko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.telusko")    
public class AppConfig {
// In here we just told spring to scan the package using cs and try to find component which spring will manage a nd create objects by itself.

}
