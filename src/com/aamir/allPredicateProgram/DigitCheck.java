package com.aamir.allPredicateProgram;

import java.util.function.Predicate;

public class DigitCheck {

	public static void main(String[] args) {
		Predicate<String> containsOnlyDigits = str -> str != null && str.matches("[0-9]");

       System.out.println(containsOnlyDigits.test("123Abrar"));

        if (containsOnlyDigits.test("123456789")) 
            System.out.println("String contains only digits.");
         else 
            System.out.println("String does not contain only digits.");
	}

}
