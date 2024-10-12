package com.example.luv2code.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.luv2code.Coach;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

	private Coach myCoach;
	
	public DemoController(@Qualifier("cricketCoach")Coach coach) {
		System.out.println("Class Initialized: "+getClass().getSimpleName());
		this.myCoach=coach;
	}

    @GetMapping(path = "/dailyworkout")
    public String getWorkOut() {
        return myCoach.getDailyWorkOut();
    }
}
