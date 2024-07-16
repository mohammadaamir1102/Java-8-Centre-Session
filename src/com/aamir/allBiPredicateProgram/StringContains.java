package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class StringContains {

	public static void main(String[] args) {
		BiPredicate<String, String> contains = (str1, substring) -> str1.contains(substring);
		System.out.println(contains.test("hello", "hello hello"));

	}

}
