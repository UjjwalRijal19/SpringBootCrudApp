package com.example.SpringBootCrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAppApplication.class, args);
	}

}
