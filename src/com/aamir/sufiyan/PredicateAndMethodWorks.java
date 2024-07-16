package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateAndMethodWorks {
	public static void main(String[] args) {
		// And=This method combines two predicates into single one that return boolean
		// value.
		Predicate<Integer> isEven = number -> number % 2 == 0; // true
		Predicate<Integer> isPositive = number -> number > 0; // true

		// true,true and -> true
		// below use and method
		Predicate<Integer> isEvenAndIsPositive = isEven.and(isPositive);
		System.out.println(isEvenAndIsPositive.test(4));

	}

}
