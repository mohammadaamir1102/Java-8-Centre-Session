package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfAStringContainsSomePartOfAnother {
	public static void main(String[] args) {
		BiPredicate<String, String> contains = (str1, str2) -> str1.contains(str2);
		System.out.println(contains.test("Hello!!! How are you??", "FLood"));
	}
}