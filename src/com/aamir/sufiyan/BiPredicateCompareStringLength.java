package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCompareStringLength {
	public static void main(String[] args) {
		BiPredicate<String, String> isLengthGreater = (a, b) -> a.length() > b.length();
		System.out.println(isLengthGreater.test("hello", "world!")); // false
		System.out.println(isLengthGreater.test("hello!", "world")); // true
	}
}
