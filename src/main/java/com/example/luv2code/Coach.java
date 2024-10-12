package com.example.luv2code;

public interface Coach {
    default String getDailyWorkOut() throws RuntimeException {
        throw new RuntimeException("Pending Implementation!!");
    }
}
