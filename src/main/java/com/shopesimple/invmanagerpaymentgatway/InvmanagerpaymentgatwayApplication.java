package com.shopesimple.invmanagerpaymentgatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shopesimple.invmanagerpaymentgatway")
public class InvmanagerpaymentgatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvmanagerpaymentgatwayApplication.class, args);
	}

}
