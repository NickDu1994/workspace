package com.dkingdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LaunchApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LaunchApplication.class);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(LaunchApplication.class, args);
	}

}
