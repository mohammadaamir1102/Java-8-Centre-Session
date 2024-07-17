package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CheckStringLenghtGraterOrNot {
	public static void main(String[] args) {
		Predicate<String> checkStringLength = str -> str.length() >= 6;
		System.out.println(checkStringLength.test("Sameer"));
	}

}
