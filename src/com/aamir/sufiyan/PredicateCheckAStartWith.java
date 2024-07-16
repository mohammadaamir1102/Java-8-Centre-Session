package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateCheckAStartWith {
	public static void main(String[] args) {
		Predicate<String> startsWith = s -> s.startsWith("J");
		System.out.println(startsWith.test("Java")); // true
		System.out.println(startsWith.test("Python")); // false
	}
}
