package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class RegexMatch {

	public static void main(String[] args) {

		Predicate<String> matchesRegex = str -> str.matches("[a-zA-Z0-9]");

		if (matchesRegex.test("abrarkhan123"))
			System.out.println("String matches the regex pattern.");
		else
			System.out.println("String does not match the regex pattern.");

	}

}
