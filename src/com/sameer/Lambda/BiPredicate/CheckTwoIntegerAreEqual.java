package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class CheckTwoIntegerAreEqual {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);

		System.out.println(isEqual.test(10, 10));

	}

}
