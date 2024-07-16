package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateIsPositive {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isProductPositive = (a, b) -> (a * b) > 0;
		System.out.println(isProductPositive.test(5, 3)); // true
		System.out.println(isProductPositive.test(-5, 3)); // false
	}
}
