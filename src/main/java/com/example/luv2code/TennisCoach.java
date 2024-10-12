package com.example.luv2code;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("Class Initialized: "+getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkOut() throws RuntimeException {
		return "Practive backhand volley!";
	}
}
