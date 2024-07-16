package com.aamir.Tufail;


import java.util.List;
import java.util.function.Predicate;

public class predecateOfuppercaseTest {
	public static void main(String[] args) {
		Predicate<Character>output=ch->Character.isUpperCase(ch);
		System.out.println(output.test('a'));
	
	}
}
