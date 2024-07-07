package com.aamir.abrar;

import java.util.function.Predicate;

public class TreditionalPredicate  {

	public static void main(String[] args) {

		Predicate<Integer> predicate = value -> value%2==0;
		System.out.println(predicate.test(10));
	}



}
