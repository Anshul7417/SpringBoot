package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.telusko.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")         // same as xml
	public Desktop desktop() {
		return new Desktop();
	}
}
