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
	
	@GetMapping("/concat")
	public String concat() {
		String val1,val2,concat;
		val1="Hello";
		val2="World";
		return concat = val1 + val2;
	}
	
	@GetMapping("/boolean")
	public boolean bool() {
		return true;
	}
	
	@GetMapping("/parentage")
	public int parentage() {
		return 300*100/500;
	}
	
	@GetMapping("/squareRoot")
	public double squareRoot() {
		double a=100;
		return Math.sqrt(a);
	}
	
	@GetMapping("/square")
	public int square() {
		int a=10;
		return a*a;
	}
	
	@GetMapping("/round")
	public double round() {
		double a=79.56;
		return Math.round(a);
	}
}

