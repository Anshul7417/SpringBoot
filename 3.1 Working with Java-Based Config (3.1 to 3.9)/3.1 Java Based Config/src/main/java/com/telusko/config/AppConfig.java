package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.telusko.Desktop;

@Configuration
// To tell that it is configuration file
public class AppConfig {

	@Bean
	// To tell that it is a bean
	public Desktop desktop() {
		return new Desktop();        
	}
}
