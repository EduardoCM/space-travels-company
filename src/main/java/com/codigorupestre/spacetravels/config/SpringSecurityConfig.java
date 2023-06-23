package com.codigorupestre.spacetravels.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
	
	
	 @Bean
	  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        
		return http.
				csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/api/version/**").permitAll())
				.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.build();
		    
		    
	 }
	 
	
	@Bean
	public UserDetailsService userDetailsService(){
		
		UserDetails userAdmin = User.builder()
				.username("eduardo")
				.password(passwordEncoder().encode("passwordTravels"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(userAdmin);
	}
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
