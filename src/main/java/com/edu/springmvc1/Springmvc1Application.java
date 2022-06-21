package com.edu.springmvc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Springmvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springmvc1Application.class, args);
	}

}
