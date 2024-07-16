package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckLength {
	public static void main(String[] args) {
		BiPredicate<int[], int[]> isSameLength = (a, b) -> a.length == b.length;
		System.out.println(isSameLength.test(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 })); // true
		System.out.println(isSameLength.test(new int[] { 5, 2, 8 }, new int[] { 7, 1 })); // false
	}
}
