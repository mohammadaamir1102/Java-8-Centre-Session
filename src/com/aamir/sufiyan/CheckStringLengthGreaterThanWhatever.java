package com.aamir.sufiyan;

import java.util.function.Predicate;

public class CheckStringLengthGreaterThanWhatever {
	public static void main(String[] args) {
		Predicate<String> output = item -> item.length() < 5;
		System.out.println(output.test("Abusufiyan"));
	}
}
