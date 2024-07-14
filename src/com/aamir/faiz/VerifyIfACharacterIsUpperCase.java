package com.aamir.faiz;

import java.util.function.Predicate;

public class VerifyIfACharacterIsUpperCase {
	public static void main(String[] args) {
		Predicate<Character> predicate=value -> Character.isUpperCase(value);
		System.out.println(predicate.test('A'));
	}

}
