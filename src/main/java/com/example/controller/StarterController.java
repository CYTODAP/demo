package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.NumberData;
import com.example.service.StarterService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/starter")
public class StarterController {
	@Autowired
	StarterService starterService;
	@GetMapping
	public String home() {
		return "Starter Page!";
	}
	@GetMapping("/sum")
	public String sum(@RequestParam String number1,@RequestParam String number2 ) {
		return starterService.sum(number1, number2);
	}
	@GetMapping("/multiply")
	public String mul(@RequestBody NumberData numberData) {
		return starterService.mul(numberData);
	}
	
}
