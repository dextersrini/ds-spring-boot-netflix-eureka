package com.ds.service1.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ds")
@EnableEurekaClient
public class ServiceOneRunner {
	public static void main(String[] args) {
		SpringApplication.run(ServiceOneRunner.class, args);
	}
}
