package com.retail.productAddModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.*")
public class RegistrationModuleApplication {

	public static void main(String[] args) {
		System.out.println("ProductAddModuleApplication!!!!!");
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(RegistrationModuleApplication.class, args);
	}
}
