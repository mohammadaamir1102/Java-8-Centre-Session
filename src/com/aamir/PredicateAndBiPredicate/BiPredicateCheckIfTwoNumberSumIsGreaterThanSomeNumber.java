package com.aamir.PredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfTwoNumberSumIsGreaterThanSomeNumber {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> sumGreaterThanANumber = (a, b) -> (a + b) > 10;
//		System.out.println(sumGreaterThanANumber.test(3, 9));
		System.out.println(sumGreaterThanANumber.test(2, 3));
	}

}
