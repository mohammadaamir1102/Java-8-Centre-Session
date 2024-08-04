package com.aamir.PredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfANumberIsDivisibleByAnotherOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> divisibleByOrNot = (dividend, divisor) -> dividend % divisor == 0;
		System.out.println(divisibleByOrNot.test(7,3));
	}

}
