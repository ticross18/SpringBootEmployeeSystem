package com.system.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.system.spring.repos.EmployeeRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {EmployeeRepository.class})
public class EmploymentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentSystemApplication.class, args);
	}

}


