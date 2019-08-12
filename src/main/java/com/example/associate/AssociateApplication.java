package com.example.associate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class AssociateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociateApplication.class, args);
	}

}
