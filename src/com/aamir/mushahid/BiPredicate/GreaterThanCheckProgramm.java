package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class GreaterThanCheckProgramm {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isGreaterThan = (a, b) -> a > b;

		System.out.println("Is 10 greater than 5? " + isGreaterThan.test(10, 5));
		System.out.println("Is 5 greater than 10? " + isGreaterThan.test(5, 10));
	}
}
