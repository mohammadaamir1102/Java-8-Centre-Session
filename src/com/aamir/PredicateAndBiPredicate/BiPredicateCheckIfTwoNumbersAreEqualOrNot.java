package com.aamir.PredicateAndBiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfTwoNumbersAreEqualOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> equalOrNot=(a,b)-> a==b;
		System.out.println(equalOrNot.test(10,10));
	}

}
