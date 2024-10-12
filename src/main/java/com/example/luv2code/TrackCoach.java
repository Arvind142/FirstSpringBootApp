package com.example.luv2code;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	public TrackCoach() {
		System.out.println("Class Initialized: "+getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkOut() throws RuntimeException {
		return "Run a hard 5K!";
	}
}
