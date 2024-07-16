package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckStringEndsWith {
	public static void main(String[] args) {
		BiPredicate<String, String> endsWith = (a, b) -> a.endsWith(b);

		// Test cases
		System.out.println(endsWith.test("hello world", "world")); // true
		System.out.println(endsWith.test("hello world", "hello")); // false
		System.out.println(endsWith.test("Java programming", "programming")); // true
		System.out.println(endsWith.test("Java programming", "Java")); // false
	}
}
