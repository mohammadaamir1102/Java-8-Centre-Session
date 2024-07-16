package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class CheckRang {

	public static void main(String[] args) {
		Predicate<Integer> isInRange = num -> num >= 10 && num <= 50;

		if (isInRange.test(50)) {
			System.out.println( "number is within the range.");
		} else {
			System.out.println("number is not within the range.");
		}
	}

}
