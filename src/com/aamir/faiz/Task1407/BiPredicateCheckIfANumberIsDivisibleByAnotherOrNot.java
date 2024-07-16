package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfANumberIsDivisibleByAnotherOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> divisibleByOrNot = (dividend, divisor) -> dividend % divisor == 0;
		System.out.println(divisibleByOrNot.test(7,3));
	}

}
