package com.aamir.mushahid;

import java.util.function.Predicate;

public class PredicateNegateMethod {
public static void main(String[] args) {
	
	Predicate<Integer> isEven = number -> number % 2 == 0;
	Predicate<Integer> isOdd = isEven.negate();
	System.out.println(isOdd.test(3));
	
}
}
