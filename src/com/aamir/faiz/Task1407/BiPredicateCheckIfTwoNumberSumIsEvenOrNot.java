package com.aamir.faiz.Task1407;

import java.util.function.BiPredicate;

public class BiPredicateCheckIfTwoNumberSumIsEvenOrNot {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkSumIsEvenOrNot=(a,b)->(a+b)%2==0;
		System.out.println(checkSumIsEvenOrNot.test(4, 5));
//		System.out.println(checkSumIsEvenOrNot.test(2, 4));
		System.out.println(checkSumIsEvenOrNot.test(3, 7));
	}

}
