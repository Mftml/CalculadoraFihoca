package com.privalia.presentation.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.privalia.presentation.iCalculator;
import com.privalia.presentation.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		iCalculator calculator = new Calculator();
		assertTrue(calculator.add(2, 2) == 4);
	}

	@Test
	public void testSubstract() {
		iCalculator calculator = new Calculator();
		assertTrue(calculator.substract(2, 2) == 0);
	}

	@Test
	public void testMultiply() {
		iCalculator calculator = new Calculator();
		assertTrue(calculator.multiply(2, 2) == 4);
	}

	@Test
	public void testDivide() {
		iCalculator calculator = new Calculator();
		assertTrue(calculator.divide(2, 2) == 1);
	}

}
