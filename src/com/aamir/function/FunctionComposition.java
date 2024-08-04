package com.aamir.function;

import java.util.function.Function;

public class FunctionComposition {
	public static void main(String[] args) {
		Function<Integer, Integer> multiply = x -> x * 2;
		Function<Integer, Integer> add = x -> x + 3;
		Function<Integer, Integer> composed = multiply.andThen(add);
		System.out.println(composed.apply(5));
	}

}
