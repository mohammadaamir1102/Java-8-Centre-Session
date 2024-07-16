package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckGreater {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
		System.out.println(isGreater.test(10, 5)); // true
		System.out.println(isGreater.test(5, 10)); // false
	}
}
