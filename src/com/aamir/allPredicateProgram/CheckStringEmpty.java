package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class CheckStringEmpty {

	public static void main(String[] args) {

		Predicate<String> isEmpty = str -> str == null || str.isEmpty();

		System.out.println(isEmpty.test("Abrar"));
		
		if (isEmpty.test(""))
			System.out.println("String is empty or null.");
		else
			System.out.println("String is not empty.");

	}

}
