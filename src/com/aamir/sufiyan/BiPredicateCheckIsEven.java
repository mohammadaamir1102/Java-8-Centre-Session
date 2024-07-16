package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckIsEven {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
		System.out.println(isSumEven.test(2, 4)); // true
		System.out.println(isSumEven.test(2, 3)); // false
	}
}
