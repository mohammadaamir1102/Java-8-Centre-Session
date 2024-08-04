package com.aamir.bifunction;

import java.util.function.BiFunction;

public class ParseAndSumBiFunction {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> biFunction = (a, b) -> Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(biFunction.apply("123", "456"));
	}
}
