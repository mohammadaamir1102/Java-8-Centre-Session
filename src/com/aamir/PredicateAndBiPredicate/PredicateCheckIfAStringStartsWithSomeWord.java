package com.aamir.PredicateAndBiPredicate;

import java.util.function.Predicate;

public class PredicateCheckIfAStringStartsWithSomeWord {

	public static void main(String[] args) {
		Predicate<String> startWith=str-> str.startsWith("Hello");
//		System.out.println(startWith.test("Hello Faiz"));
		System.out.println(startWith.test(" "));
	}

}
