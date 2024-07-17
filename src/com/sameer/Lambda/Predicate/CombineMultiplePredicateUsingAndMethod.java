package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CombineMultiplePredicateUsingAndMethod {
	public static void main(String[] args) {

		Predicate<String> startWithA = str -> str.startsWith("A");

		Predicate<String> length = len -> len.length() == 5;

		Predicate<String> combine = startWithA.and(length);

		System.out.println(combine.test("Sameer"));
		System.out.println(combine.test("Aadil"));

	}

}
