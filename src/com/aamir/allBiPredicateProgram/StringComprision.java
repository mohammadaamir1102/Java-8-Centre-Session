package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class StringComprision {

	public static void main(String[] args) {
		BiPredicate<String, String> isEqualIgnoreCase = (str1, str2) ->  str1.equalsIgnoreCase(str2);

		String str1 = "Hello";
		String str2 = "HELLO";

		if (isEqualIgnoreCase.test(str1, str2)) {
			System.out.println("Strings are equal ignoring case.");
		} else {
			System.out.println("Strings are not equal ignoring case.");
		}
	}

}
