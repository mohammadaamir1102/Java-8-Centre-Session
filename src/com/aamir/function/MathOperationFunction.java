package com.aamir.function;

import java.util.function.Function;

public class MathOperationFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> function = x -> x * x;
		System.out.println(function.apply(5));
	}
}
