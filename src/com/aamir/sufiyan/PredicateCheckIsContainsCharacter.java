package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateCheckIsContainsCharacter {
	public static void main(String[] args) {
		Predicate<String> contains = s -> s.contains("a");
		System.out.println(contains.test("apple")); // true
		System.out.println(contains.test("berry")); // false
	}
}
