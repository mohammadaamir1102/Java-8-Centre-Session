package com.aamir.function;

import java.util.function.Function;

public class ParseIntegerFunction {
	 public static void main(String[] args) {
	        Function<String, Integer> function = Integer::parseInt;
	        System.out.println(function.apply("123"));
	    }
}
