package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class CheckNumberEvenOdd {

	public static void main(String[] args) {

		Predicate<Integer> isEven = num -> num % 2 == 0;

		System.out.println(isEven.test(7));

		if (isEven.test(10))
			System.out.println(" is even.");
		else
			System.out.println(" is not even.");

	}

}
