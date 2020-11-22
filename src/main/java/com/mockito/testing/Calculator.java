package com.mockito.testing;

public class Calculator {
	
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		
		this.service = service;
		
	}
	
	public int performAddition(int i, int j) {
		
		return service.add(i, j) * i;
		
		// return (i + j) * i; // checking to see how do we know if we are using our service
		
	}
	
	public int performSubtraction(int i, int j) {
		
		return service.subtract(i, j);
		
//		return i - j + 1;
		
	}

}
