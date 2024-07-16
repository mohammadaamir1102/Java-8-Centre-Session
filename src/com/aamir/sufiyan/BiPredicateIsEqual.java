package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateIsEqual {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);
		System.out.println(isEqual.test(5, 5)); // true
		System.out.println(isEqual.test(5, 10)); // false
	}
}
