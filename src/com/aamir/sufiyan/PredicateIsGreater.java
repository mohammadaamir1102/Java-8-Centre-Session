package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateIsGreater {
	public static void main(String[] args) {
		Predicate<Integer> isGreaterThan = n -> n > 10;
		System.out.println(isGreaterThan.test(15)); // true
		System.out.println(isGreaterThan.test(5)); // false
	}
}
