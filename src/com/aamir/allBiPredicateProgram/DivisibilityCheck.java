package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class DivisibilityCheck {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isDivisibleBy = (num1, num2) -> num1 % num2 == 0;
         System.out.println(isDivisibleBy.test(10, 5));
	}

}
