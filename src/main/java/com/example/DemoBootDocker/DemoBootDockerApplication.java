package com.example.DemoBootDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBootDockerApplication {

	public static void main(String[] args) {
		System.out.println("Boot started . . .");
		SpringApplication.run(DemoBootDockerApplication.class, args);
		System.out.println("Boot Ended . . . ");
	}
}
