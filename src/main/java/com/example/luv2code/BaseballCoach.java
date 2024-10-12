package com.example.luv2code;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	public BaseballCoach() {
		System.out.println("Class Initialized: "+getClass().getSimpleName());
	}
	
    @Override
    public String getDailyWorkOut() throws RuntimeException {
        return "Practice Pitch 50 times!";
    }
}
