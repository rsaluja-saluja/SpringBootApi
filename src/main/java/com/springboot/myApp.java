package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// below tells the spring boot this is starting point of application
@SpringBootApplication
public class myApp {

	public static void main(String[] args) {

		SpringApplication.run(myApp.class, args);
		
	}

}
