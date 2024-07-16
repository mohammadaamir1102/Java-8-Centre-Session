package com.aamir.allBiPredicateProgram;

import java.util.function.BiPredicate;

public class CheckTwoNumberIsGreater {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> numcheck = (num1, num2) -> num1 > 10 && num2 < 18;

		int num1 = 12;
		int num2 = 15;

		System.out.println(numcheck.test(num1, num2));
	}

}
