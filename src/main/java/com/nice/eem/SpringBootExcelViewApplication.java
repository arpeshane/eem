package com.nice.eem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringBootExcelViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExcelViewApplication.class, args);
	}
}
