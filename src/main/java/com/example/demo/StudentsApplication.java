package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@SpringBootApplication
public class StudentsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

}
