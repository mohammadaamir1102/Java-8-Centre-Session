package com.aamir.faiz;

import java.util.function.Predicate;

public class PredicateAndMethod {

	public static void main(String[] args) {
		Predicate<Integer> isEven=number-> number%2==0;
		Predicate<Integer> isPositive=number-> number>0;
		
		Predicate<Integer> isEvenAndisPositive=isEven.and(isPositive);
		System.out.println(isEvenAndisPositive.test(20));

	}

}
