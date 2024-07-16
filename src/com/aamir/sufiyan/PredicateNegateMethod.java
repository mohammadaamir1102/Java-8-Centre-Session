package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateNegateMethod {
	// This method return a opposite of Predicate's boolean value
	public static void main(String[] args) {
		Predicate<Integer> isEven = number -> number % 2 == 0;
		Predicate<Integer> isOdd = isEven.negate();
		System.out.println(isOdd.test(3));
	}
}
