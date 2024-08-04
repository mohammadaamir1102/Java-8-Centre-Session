package com.aamir.PredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateNegateOnStringIsEmpty {
	public static void main(String[] args) {
		Predicate<String> isEmpty = str1 -> str1.isEmpty();
		Predicate<String> isEmptyNegate = isEmpty.negate();

		System.out.println(isEmptyNegate.test("Ahamd"));
		System.out.println(isEmptyNegate.test(""));
	}

}
