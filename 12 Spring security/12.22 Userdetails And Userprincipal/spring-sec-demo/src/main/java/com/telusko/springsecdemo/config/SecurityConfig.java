package com.telusko.springsecdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public AuthenticationProvider authProvider() {                              // we want to verify the user from the db
		// So basically if we want to login from the db we have to change our authentication provider
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();    //Class that has Database access
		provider.setUserDetailsService(userDetailsService);                      //
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}

	//Now the authpro will ask for Userdetailsservice which is ainterface and we have to implement it

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(customizer -> customizer.disable())
				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return http.build();
	}

	/*
	 * @Bean public UserDetailsService userDetailsService() {
	 * 
	 * UserDetails user=User .withDefaultPasswordEncoder() .username("navin")
	 * .password("n@123") .roles("USER") .build();
	 * 
	 * UserDetails admin=User .withDefaultPasswordEncoder() .username("admin")
	 * .password("admin@789") .roles("ADMIN") .build();
	 * 
	 * return new InMemoryUserDetailsManager(user,admin); }
	 */

}
