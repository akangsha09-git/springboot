package com.project.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.project.ak.repository.*"})
@EntityScan(basePackages = {"com.project.ak.entities"})
@SpringBootApplication(scanBasePackages={"com.project.ak.*"})
@ComponentScan(basePackages = {"com.project.ak.*"})
public class AkApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkApplication.class, args);
	}

}
