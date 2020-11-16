package com.sunsoft.SpringBootAssignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.sunsoft.controller",  "com.sunsoft.dao"})
@EnableJpaRepositories("com.sunsoft.repository")
@EntityScan(basePackages = 	{"com.sunsoft.model"})
public class SpringBootAssignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignment2Application.class, args);
	}

}

