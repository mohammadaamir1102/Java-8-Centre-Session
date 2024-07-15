package com.aamir.faiz;

import java.util.function.Predicate;

public class PredicateNegateMethod {

	public static void main(String[] args) {
		Predicate<Integer> isEven = value -> value % 2 == 0;
		Predicate<Integer> isOdd = isEven.negate();

		System.out.println(isOdd.test(11));

	}

}
