package com.aamir.faiz.Task1407;

import java.util.function.Predicate;

public class PredicateCheckIfAStringEndsWithSomeWord {

	public static void main(String[] args) {
		Predicate<String> endsWith=str1->str1.endsWith("faiz");
		System.out.println(endsWith.test("my name is faiz"));
	}

}
