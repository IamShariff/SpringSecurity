package com.finlcok.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.finlcok.*")
public class FinlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinlockApplication.class, args);
	}

}
