package com.example.apirestcrudbackendspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.models"})
@EnableJpaRepositories(basePackages = {"com.example.repository"})
@ComponentScan(basePackages = {"com.example.controllers", "com.example.services"})
public class ApiRestCrudBackendSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestCrudBackendSpringbootApplication.class, args);
	}

}
