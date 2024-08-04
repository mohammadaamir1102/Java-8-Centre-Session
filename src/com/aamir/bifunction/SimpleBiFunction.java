package com.aamir.bifunction;

import java.util.function.BiFunction;

public class SimpleBiFunction {
	 public static void main(String[] args) {
	        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
	        System.out.println(biFunction.apply(5, 3));
	    }
}
