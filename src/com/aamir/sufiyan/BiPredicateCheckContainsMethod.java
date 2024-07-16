package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckContainsMethod {
	public static void main(String[] args) {
		BiPredicate<String, String> concatContains = (a, b) -> (a + b).contains("world");
		System.out.println(concatContains.test("hello", " world")); // true
		System.out.println(concatContains.test("hello", " Java")); // false
	}
}
