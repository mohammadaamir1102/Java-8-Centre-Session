package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CheckCharUpperOrNot {
	public static void main(String[] args) {
		Predicate<Character> checkaUpperOrLower = ch -> Character.isUpperCase(ch);
		System.out.println(checkaUpperOrLower.test('S'));
	}

}
