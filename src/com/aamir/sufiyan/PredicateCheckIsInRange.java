package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateCheckIsInRange {
	public static void main(String[] args) {
		Predicate<Integer> isInRange = n -> n >= 10 && n <= 20;
		System.out.println(isInRange.test(15)); // true
		System.out.println(isInRange.test(25)); // false
	}
}
