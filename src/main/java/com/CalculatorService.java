package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	@GetMapping("/sum")
	public int sum() {
		return 10+10;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		return 10*10;
	}
	
	@GetMapping("/subtraction")
	public int subtraction() {
		return 10-10;
	}
	
	@GetMapping("/division")
	public int division() {
		return 10/10;
	}
}

