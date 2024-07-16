package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateIsEven {
	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println(isEven.test(4)); // true
		System.out.println(isEven.test(3)); // false
	}
}
