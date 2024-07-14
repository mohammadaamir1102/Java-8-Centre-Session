package com.aamir.mushahid;

import java.util.function.Predicate;

public class VerifyCharacterIsUpperCase {

	public static void main(String[] args) {
		Predicate<Character> output =  Character::isUpperCase;
		System.out.println(output.test('A'));

	}

}
