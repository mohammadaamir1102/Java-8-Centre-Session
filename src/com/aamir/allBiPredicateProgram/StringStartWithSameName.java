package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class StringStartWithSameName {

	public static void main(String[] args) {
		BiPredicate<String, String> startsWith = (str1, prefix) -> str1.startsWith(prefix);

		String str1 = "Hello World";
		String prefix = "Hello";
		
		System.out.println(startsWith.test(str1, prefix));
	}

}
