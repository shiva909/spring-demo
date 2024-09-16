package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplication {

	public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	public  init(){
		logger.info("Application Started......._:)");
	}


	@GetMapping("/")
	public  String home(){
		return "Welcome to AWS First Deployment";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
