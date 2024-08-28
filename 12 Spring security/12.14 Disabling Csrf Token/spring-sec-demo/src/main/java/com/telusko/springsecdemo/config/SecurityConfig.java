package com.telusko.springsecdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf(customizer->customizer.disable());     //disabling csrf
		http.authorizeHttpRequests(request->request.anyRequest().authenticated());   //enabling security for the requests
		http.httpBasic(Customizer.withDefaults());       //give basic security things
		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  // create new session for every request
		
		return http.build();
	}

	// now we dont have to pass csrf token because every session is new
}
