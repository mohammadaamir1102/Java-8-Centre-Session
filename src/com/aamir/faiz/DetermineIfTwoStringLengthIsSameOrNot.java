package com.aamir.faiz;

import java.util.function.BiPredicate;

public class DetermineIfTwoStringLengthIsSameOrNot {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (str1, str2) -> str1.length() == str2.length();
		System.out.println(biPredicate.test("faiz", "faiz"));
	}

}
