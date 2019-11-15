package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starting Spring Boot
 * - Sets up default confiuration
 * - Starts Spring application context
 * - Performs classpath
 * - Starts Tomcat Server
 * 
 * 3 ways to create spring boot application
 * -Spring initializr
 * -Spring CLI
 * -STS IDE
 * 
 * @author tejasjethva
 *
 */
@SpringBootApplication
public class CourseApiApp 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(CourseApiApp.class, args);
	}

}
