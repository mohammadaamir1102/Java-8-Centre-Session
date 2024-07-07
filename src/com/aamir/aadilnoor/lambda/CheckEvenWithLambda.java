package com.aamir.aadilnoor.lambda;

import java.util.function.Predicate;

public class CheckEvenWithLambda {

	public static void main(String[] args) {

		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(100));
	}
}
