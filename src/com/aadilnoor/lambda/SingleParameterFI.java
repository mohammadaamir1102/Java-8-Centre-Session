package com.aadilnoor.lambda;

interface SPI{
	void digit(int number);
}

public class SingleParameterFI {

	public static void main(String[] args) {
		
		SPI spi = (num) -> System.out.println(num);
		
		spi.digit(786);
	}
}
