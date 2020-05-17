package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@EnableEurekaServer
@SpringBootApplication
public class EurakaApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(EurakaApplication.class, args);
	}

}
