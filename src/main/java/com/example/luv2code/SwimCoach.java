package com.example.luv2code;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("Class Initialized: "+getClass().getSimpleName());
	}
	
    @Override
    public String getDailyWorkOut() throws RuntimeException {
        return "Compelted 10 laps!";
    }
    
    @PostConstruct
    public void myInitMethod() {
    	System.out.println("MyInitMethod Called: "+getClass().getSimpleName());
    }
    
    @PreDestroy
    public void doCleanUp() {
    	System.out.println("MyDestrory Called: "+getClass().getSimpleName());
    }
}
