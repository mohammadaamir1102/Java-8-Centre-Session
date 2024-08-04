package com.aamir.bifunction;

import java.util.function.BiFunction;

public class StringConcatBiFunction {
	 public static void main(String[] args) {
	        BiFunction<String, String, String> biFunction = (a, b) -> a + b;
	        System.out.println(biFunction.apply("Hello, ", "World!"));
	    }
}
