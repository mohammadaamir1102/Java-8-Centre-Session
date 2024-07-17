package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CheckStringStartWithSpecificCaracterOrNot {
	public static void main(String[] args) {

		Predicate<String> startWith = str -> str.toLowerCase().startsWith("s");

		System.out.println(startWith.test("Sameer"));
	}

}
