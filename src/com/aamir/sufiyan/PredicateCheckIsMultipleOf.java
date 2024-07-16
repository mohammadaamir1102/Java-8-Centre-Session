package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateCheckIsMultipleOf {
	public static void main(String[] args) {
		Predicate<Integer> isMultipleOf = n -> n % 5 == 0;
		System.out.println(isMultipleOf.test(10)); // true
		System.out.println(isMultipleOf.test(12)); // false
	}
}
