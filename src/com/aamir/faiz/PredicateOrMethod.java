package com.aamir.faiz;

import java.util.function.Predicate;

public class PredicateOrMethod {

	public static void main(String[] args) {
		Predicate<Integer> isEven = value -> value % 2 == 0;
		Predicate<Integer> isPositive = value -> value > 0;

		Predicate<Integer> isEvenOrisPositive = isEven.or(isPositive);

		System.out.println(isEvenOrisPositive.test(-21));

	}

}
