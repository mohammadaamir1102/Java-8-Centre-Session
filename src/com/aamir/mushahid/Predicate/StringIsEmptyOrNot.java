package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class StringIsEmptyOrNot {
	public static void main(String[] args) {
		Predicate<String> isNotEmpty = str -> str.isEmpty();
		System.out.println(isNotEmpty.test("Mushahid"));
		System.out.println(isNotEmpty.test(""));
        
	}
}
