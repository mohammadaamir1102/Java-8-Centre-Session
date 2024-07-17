package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class ComparingTHeLengthOfTwoString {

	public static void main(String[] args) {

		BiPredicate<String, String> lengthCompare = (str1, str2) -> str1.length() == str2.length();

		System.out.println(lengthCompare.test("Java", "Python"));
	}

}
