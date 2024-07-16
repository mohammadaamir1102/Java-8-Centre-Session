package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class SumComprision {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isSumGreaterThan = (num1, num2) -> (num1 + num2) >= 20;

		

		// System.out.println(isSumGreaterThan.test(num1, num2));

		if (isSumGreaterThan.test(10,2))
			System.out.println("Sum of numbers is greater than 20.");
		else
			System.out.println("Sum of numbers is not greater than 20.");

	}

}
