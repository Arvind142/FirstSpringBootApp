package com.example.luv2code.configuration;

import com.example.luv2code.interceptors.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer{

    RequestInterceptor requestInterceptor;

    public MvcConfigurer(RequestInterceptor requestInterceptor) {
    	System.out.println("Class Initialized: "+getClass().getSimpleName());
    	this.requestInterceptor=requestInterceptor;
	}
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor);
    }
}