package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;

@Configuration
public class AppConfig {	
	@Bean
	public Alien alien(@Autowired Computer com) {
		// Now autowired annotation is not needed. It will directly insert Desktop which is implementation of computer into Alien
		Alien obj= new Alien();
		obj.setAge(25);
		obj.setCom(com);
		return obj;
		
	}

	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
