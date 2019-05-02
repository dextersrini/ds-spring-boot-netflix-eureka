package com.ds.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
public class ServiceOneController {

	@Autowired
	Environment env;

	public String test() {
		String name = env.getProperty("spring.application.name");
		return name + "is running successfully.";
	}
}
