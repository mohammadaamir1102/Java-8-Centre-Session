package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class StringLengthIsGreaterThan7 {
	public static void main(String[] args) {
		Predicate<String> lengthGreaterThan7 = str -> str.length() > 7;

		System.out.println(lengthGreaterThan7.test("Mushahid"));
		System.out.println(lengthGreaterThan7.test("Mumbai"));
	}
}
