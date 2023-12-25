package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages={"com.example"})
//@RestController
@EnableAutoConfiguration
public class DemoApplication {
	
//	@GetMapping("/")
//    String home() {
//        return "Hello World!";
//    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
