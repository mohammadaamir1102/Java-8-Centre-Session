package com.aamir.faiz;

import java.util.function.Predicate;

public class CheckStringLengthgreaterThanWhatEver {
	public static void main(String[] args) {
		
		Predicate<String> predicate=value -> value.length()<5;
		System.out.println(predicate.test("faiz"));
		
	}

}
