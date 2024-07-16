package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BipredicateCheckIsMultiple {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isMultiple = (a, b) -> a % b == 0;
		System.out.println(isMultiple.test(10, 2)); // true
		System.out.println(isMultiple.test(10, 3)); // false
	}
}
