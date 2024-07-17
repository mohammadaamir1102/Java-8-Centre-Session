package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class CheckStringContainsAnother {

	public static void main(String[] args) {

		BiPredicate<String, String> contains = (str, substr) -> str.contains(substr);

		System.out.println(contains.test("Hello world", "world"));

	}

}
