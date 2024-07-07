package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateLambdaApproach {
	public static void main(String[] args) {
		Predicate<Integer> isEven = value -> value % 2 == 0;
		System.out.println(isEven.test(20));
	}
}
