package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class NumberComprision {

	public static void main(String[] args) {

	BiPredicate<Integer, Integer> isGreaterThan = (num1, num2) -> num1 > num2;
	
	System.out.println(isGreaterThan.test(8,10));
	
	if (isGreaterThan.test(8, 10)) 
		System.out.println("first number is greater than 2nd number");
	 else 
		 System.out.println("Second number is greater than first number");
	
	}

}
