package com.example.luv2code.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.luv2code.Coach;
import com.example.luv2code.SwimCoach;

@Configuration
public class SupportConfig {
	
	@Bean
	Coach swimCoach() {
		return new SwimCoach();
	}
}
