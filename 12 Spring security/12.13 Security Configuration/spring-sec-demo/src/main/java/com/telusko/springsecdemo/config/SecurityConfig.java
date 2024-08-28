package com.telusko.springsecdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity    // enable web security
public class SecurityConfig {

	// we have to create a configuration file if we want to do certain things


	@Bean
	//if you want to cahnge config return SecurityFilterChain and HttpSecurity
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		
		
		return http.build(); //returning object
	}
}


//no we are doing nothing so security removed
