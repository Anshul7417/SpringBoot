package com.telusko.springsecdemo.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {   //custom configuration

		http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails user = User
				.withDefaultPasswordEncoder()         // simple encoding of passwords
				.username("anshul")
				.password("n@123")
				.roles("USER")
				.build();

		UserDetails admin = User
				.withDefaultPasswordEncoder()       //simple encoding of passswords
				.username("admin")
				.password("admin@789")
				.roles("ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user, admin);
	}

}
