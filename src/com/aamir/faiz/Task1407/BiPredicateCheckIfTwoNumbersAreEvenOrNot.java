package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfTwoNumbersAreEvenOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkIsEven = (a, b) -> a % 2 == 0 && b % 2 == 0;
		System.out.println(checkIsEven.test(20, 18));
	}

}
