package com.aamir.mushahid;

import java.util.function.Predicate;

public class PredicateOrMethodWork {
public static void main(String[] args) {
	
	Predicate<Integer> isEven = number -> number % 2 == 0;
	Predicate<Integer> isPositive = number -> number > 0;
	
	Predicate<Integer> isEvenAndIsPositive = isEven.or(isPositive);
	System.out.println(isEvenAndIsPositive.test(4));
}
}
