package com.boa.schoolSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.boa.courses.repos" )
@SpringBootApplication
@ComponentScan(basePackages="com.boa.courses")
public class SchoolSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolSpringApplication.class, args);
	}
}
