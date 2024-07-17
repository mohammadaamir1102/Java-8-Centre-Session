package com.sameer.Lambda.Predicate;

import java.util.function.Predicate;

public class CheckNumberIsPositiveOrNot {
	public static void main(String[] args) {

		Predicate<Integer> checkPositive = num -> num > 0;

		System.out.println(checkPositive.test(-1));
	}

}
