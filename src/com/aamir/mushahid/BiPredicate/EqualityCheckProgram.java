package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class EqualityCheckProgram {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);

		System.out.println("Is 5 equal to 5? " + isEqual.test(5, 5));
		System.out.println("Is 5 equal to 10? " + isEqual.test(5, 10));
	}
}
