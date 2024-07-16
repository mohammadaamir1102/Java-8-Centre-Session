package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateUsingOrMethod {
	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Predicate<Integer> isGreaterThan = n -> n > 10;
		Predicate<Integer> combined = isEven.or(isGreaterThan);

		System.out.println(combined.test(12)); // true
		System.out.println(combined.test(9)); // false
		System.out.println(combined.test(11)); // true
	}
}
