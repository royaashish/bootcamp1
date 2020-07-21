package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService{
	
	CalculatorService cs = new CalculatorService();
	
	@Test
	public void testSum() {
		
		Assertions.assertEquals(20,cs.sum());
	}
	
	@Test
	public void testMultiply() {
		
		Assertions.assertEquals(100,cs.multiply());
	}
	
	@Test
	public void testSubtraction() {
		Assertions.assertEquals(0, cs.subtraction());
	}
	
	@Test
	public void testDivision() {
		Assertions.assertEquals(1, cs.division());
	}
}