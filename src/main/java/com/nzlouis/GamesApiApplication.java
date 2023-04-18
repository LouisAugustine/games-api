package com.nzlouis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class GamesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesApiApplication.class, args);
	}

}
