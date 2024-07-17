package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class NumberIsDivisibleBy3orNot {
	public static void main(String[] args) {
		Predicate<Integer> divisibleBy3And5 = num -> num % 3 == 0;

		System.out.println(divisibleBy3And5.test(15));
		System.out.println(divisibleBy3And5.test(9)); 
	}
}
