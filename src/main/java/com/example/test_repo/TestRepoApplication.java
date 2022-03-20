package com.example.test_repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRepoApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World";
	}

}
