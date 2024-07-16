package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class CheckPositiveNumber {

	public static void main(String[] args) {
		Predicate<Integer> isPositive = num -> num > 0;

    System.out.println(isPositive.test(-5));

        if (isPositive.test(5)) {
            System.out.println(" number is positive.");
        } else {
            System.out.println(" number is not positive.");
        }
	}

}
