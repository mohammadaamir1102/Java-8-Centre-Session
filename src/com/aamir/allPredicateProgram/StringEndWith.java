package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class StringEndWith {

	public static void main(String[] args) {
		Predicate<String> stringendsWith = str -> str.endsWith("an");

		System.out.println(stringendsWith.test("my senior brother Mohammad Aamir kh an"));

		if (stringendsWith.test("i AM Abrar Ahmed"))
			System.out.println("String ends with the an.");
		else
			System.out.println("String does not end with the an.");

	}

}
