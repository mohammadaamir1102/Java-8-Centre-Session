package com.aamir.PredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateCheckIfStringContainsSubString {

	public static void main(String[] args) {
		Predicate<String> contains = str1 -> str1.contains("khan");
		System.out.println(contains.test("Hello!! How are you faiz"));
	}

}
