package com.aamir.sufiyan;

import java.util.function.Predicate;

public class VerifyIfaCharacterIsUpperCase {
	public static void main(String[] args) {
		Predicate<Character> output = ch -> Character.isUpperCase(ch);
		System.out.println(output.test('A'));
	}
}
