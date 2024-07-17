package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		Predicate<Integer> isEvenAndGreaterThan10 = num -> num % 2 == 0 && num > 10;

		System.out.println(isEvenAndGreaterThan10.test(12));
		System.out.println(isEvenAndGreaterThan10.test(8));

	}
}
