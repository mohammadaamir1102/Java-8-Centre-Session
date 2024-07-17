package com.sameer.Lambda.BiPredicate;

import java.util.function.BiPredicate;

public class CheckOneNumberDevisibleByAnother {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;

		System.out.println(isDivisible.test(10, 5));
	}

}
