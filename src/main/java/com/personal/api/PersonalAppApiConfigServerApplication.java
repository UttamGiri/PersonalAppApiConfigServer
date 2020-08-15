package com.personal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PersonalAppApiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalAppApiConfigServerApplication.class, args) ;
		//here is the change second third third 4th 5th
	}

}
