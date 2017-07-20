package com.retail.productAddModule1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan("com.*")
public class ProductAddModule1Application {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "product-add-server");
		SpringApplication.run(ProductAddModule1Application.class, args);
	}
}
