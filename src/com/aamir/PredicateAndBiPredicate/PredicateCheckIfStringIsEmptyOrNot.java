package com.aamir.PredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateCheckIfStringIsEmptyOrNot {

	public static void main(String[] args) {
		Predicate<String> isEmpty = str1 -> str1.isEmpty();

//		System.out.println(isEmpty.test("faiz"));
		System.out.println(isEmpty.test(""));
	}

}
