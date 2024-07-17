package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class AddTwoNumber {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isSumGreaterThan100 = (a, b) -> (a + b) > 100;

		int num1 = 10;
		int num2 = 45;

		boolean result = isSumGreaterThan100.test(num1, num2);

		System.out.println("Sum of " + num1 + " and " + num2 + " is greater than 100: " + result);
	}

}
