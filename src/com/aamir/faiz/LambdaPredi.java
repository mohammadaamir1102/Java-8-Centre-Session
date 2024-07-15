package com.aamir.faiz;

import java.util.function.Predicate;

public class LambdaPredi {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (value) -> value % 2 == 0;
		System.out.println(isEven.test(10));
	}

}
