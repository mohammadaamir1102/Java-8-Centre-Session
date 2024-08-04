package com.aamir.bifunction;

import java.util.function.BiFunction;

public class MathOperationsBiFunction {

	 public static void main(String[] args) {
	        BiFunction<Integer, Integer, Double> biFunction = (a, b) -> Math.pow(a, b);
	        System.out.println(biFunction.apply(2, 3));
	    }
}
