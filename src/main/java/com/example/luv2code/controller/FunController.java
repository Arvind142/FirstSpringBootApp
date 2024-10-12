package com.example.luv2code.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FunController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping(path = "/teamInfo")
    public String getTeamInfo() {
        return "Team Name:  " + teamName + "|| Coach Name: " + coachName;
    }

    @GetMapping(path = "/")
    public String init() {
        log.info("Init called");
        return "Hello World!";
    }
}
