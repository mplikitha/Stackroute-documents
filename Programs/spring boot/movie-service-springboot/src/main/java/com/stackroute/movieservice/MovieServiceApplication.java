package com.stackroute.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieServiceApplication {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext context = SpringApplication.run(MovieServiceApplication.class, args);
	}
}
