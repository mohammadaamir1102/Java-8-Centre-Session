package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class CheckValueEmptyOrNot {

	public static void main(String[] args) {

		BiPredicate<String, Integer> isValueEmpty = (value, minLength) -> {
			return value != null && value.length() >= minLength;
		};

		String input1 = "";
		String input2 = "Hello";
		int minLength = 1; 

		if (isValueEmpty.test(input1, minLength)) {
			System.out.println("Input 1 is not empty or has at least " + minLength + " characters.");
		} else {
			System.out.println("Input 1 is empty or does not meet the minimum length requirement.");
		}

		if (isValueEmpty.test(input2, minLength)) {
			System.out.println("Input 2 is not empty or has at least " + minLength + " characters.");
		} else {
			System.out.println("Input 2 is empty or does not meet the minimum length requirement.");
		}

	}

}
