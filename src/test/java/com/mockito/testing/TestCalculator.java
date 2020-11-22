package com.mockito.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	Calculator calculator;
	
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		calculator = new Calculator(service);
	}

	@Test
	public void testPerformAddition() {
		
		// We are testing the performAddition method not the add method.
		// so this is why we are giving add static values.
		Mockito.when(service.add(2, 3)).thenReturn(5);
		
		assertEquals(10, calculator.performAddition(2, 3));
		
		Mockito.verify(service).add(2, 3); // this is to check that we are calling the mock service
		
	}
	
	@Test
	public void testPerformSubtraction() {
		
		// We are testing the performSubtraction method not the subtract method
		
		Mockito.when(service.subtract(1, 1)).thenReturn(0);
		
		assertEquals(0, calculator.performSubtraction(1, 1));
		
		Mockito.verify(service).subtract(1, 1); 
	}
}
