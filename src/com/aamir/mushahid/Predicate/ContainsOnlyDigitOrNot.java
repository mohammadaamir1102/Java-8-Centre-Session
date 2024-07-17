package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class ContainsOnlyDigitOrNot {

	public static void main(String[] args) {
		Predicate<String> containsOnlyDigits = str -> str != null && str.matches("[0-9]");

		System.out.println(containsOnlyDigits.test("Mushahid"));

		if (containsOnlyDigits.test("31032006"))
			System.out.println("String contains digits only");
		else
			System.out.println("String does not contains only digits");
	}

}