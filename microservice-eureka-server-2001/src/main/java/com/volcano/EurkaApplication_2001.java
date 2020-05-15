package com.volcano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkaApplication_2001 {
	
	public static void main(String[] args) {
		SpringApplication.run(EurkaApplication_2001.class, args);
	}

}
