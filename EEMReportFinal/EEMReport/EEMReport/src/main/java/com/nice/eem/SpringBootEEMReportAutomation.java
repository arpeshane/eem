package com.nice.eem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 
 * @author ajit.p
 *
 */

@EnableJpaRepositories
@SpringBootApplication
@ComponentScan(basePackages = "com.nice.eem")
@EntityScan(basePackages = "com.nice.eem.entity")
public class SpringBootEEMReportAutomation {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEEMReportAutomation.class, args);
	}
}
