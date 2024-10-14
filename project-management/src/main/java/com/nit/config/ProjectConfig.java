package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig {
	
	
	@Bean
	public UserDetailsService userDetailsService( PasswordEncoder encoder) {
		
		UserDetails admin= User.builder()
		.username("admin")
		.password(encoder.encode("system"))
		.build();

		UserDetails user= User.builder()
		.username("jamir")
		.password(encoder.encode("system"))
		.build();
		return new InMemoryUserDetailsManager(admin,user);
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		
		return new BCryptPasswordEncoder();
	}


}
