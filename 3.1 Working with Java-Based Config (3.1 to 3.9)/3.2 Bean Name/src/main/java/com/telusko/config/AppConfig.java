package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.telusko.Desktop;

@Configuration
public class AppConfig {

//	@Bean(name = {"Beast","desktop","com1"})       Multiple name of single bean
//  @Bean(name = "Com")    Single name
// changing name of bean 
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
}
