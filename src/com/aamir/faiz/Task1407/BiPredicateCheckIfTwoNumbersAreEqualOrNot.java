package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfTwoNumbersAreEqualOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> equalOrNot=(a,b)-> a==b;
		System.out.println(equalOrNot.test(10,10));
	}

}
