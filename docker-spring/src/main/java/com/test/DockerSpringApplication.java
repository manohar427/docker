package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@SpringBootApplication
@RestController
public class DockerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}
	
	@RequestMapping("/test")
	public String getName() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
		return "Spring-Docker:"+new Date();
	}

}
