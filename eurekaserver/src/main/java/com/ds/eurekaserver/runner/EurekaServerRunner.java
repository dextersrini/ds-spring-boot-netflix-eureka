package com.ds.eurekaserver.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRunner {
	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(EurekaServerRunner.class, args);
//		System.out.println(((Environment) appCtx.getBean("Environment")).toString());
	}
}
