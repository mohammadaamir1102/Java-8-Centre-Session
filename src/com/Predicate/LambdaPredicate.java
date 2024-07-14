package com.Predicate;

import java.util.function.Predicate;

public class LambdaPredicate {

	public static void main(String[] args) {
		Predicate<Integer> isEvenPredicate=value ->value%2==0;
		System.out.println(isEvenPredicate.test(10));

	}

}
