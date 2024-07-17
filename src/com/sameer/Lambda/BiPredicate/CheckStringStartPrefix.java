package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class CheckStringStartPrefix {
	public static void main(String[] args) {

		BiPredicate<String, String> startsWith = (str, prefix) -> str.startsWith(prefix);

		System.out.println(startsWith.test("Java 8", "Java"));

	}

}
