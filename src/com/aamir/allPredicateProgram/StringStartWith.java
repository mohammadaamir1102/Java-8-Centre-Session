package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class StringStartWith {

	public static void main(String[] args) {
		Predicate<String> startsWithfirstWord = str -> str != null && str.startsWith("Hello");

		System.out.println(startsWithfirstWord.test("Hello World"));

		if (startsWithfirstWord.test("Hello Abrar Khan"))
			System.out.println("String starts with the first Word.");
		else
			System.out.println("String does not start with first Word.");

	}

}
