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
	@Test
	public void testConcat() {
		Assertions.assertEquals("HelloWorld", cs.concat());
	}
	
	@Test
	public void testBool() {
		Assertions.assertEquals(true, cs.bool());
	}
	
	@Test
	public void testParentage() {
		Assertions.assertEquals(60, cs.parentage());
	}
	
	@Test
	public void testSquareRoot() {
		Assertions.assertEquals(10, cs.squareRoot());
	}
	
	@Test
	public void testSquare() {
		Assertions.assertEquals(100, cs.square());
	}
	
	@Test
	public void testRound() {
		Assertions.assertEquals(80, cs.round());
	}
}