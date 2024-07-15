package com.aamir.faiz.Task1407;

import java.util.function.Predicate;

public class PredicateCheckIfAStringStartsWithSomeWord {

	public static void main(String[] args) {
		Predicate<String> startWith=str-> str.startsWith("Hello");
//		System.out.println(startWith.test("Hello Faiz"));
		System.out.println(startWith.test(" "));
	}

}
