package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class DivisilibityCheck {

	public static void main(String[] args) {
		Predicate<Integer> isDivisibleBy3And5 = num -> num % 3 == 0 || num % 5 == 0;

		System.out.println(isDivisibleBy3And5.test(21));

		if (isDivisibleBy3And5.test(5))
			System.out.println(" is divisible by 3 and 5.");
		else
			System.out.println(" is not divisible by 3 and 5.");

	}

}
