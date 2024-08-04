package com.aamir.function;

import java.util.function.Function;

public class StringManipulationFunction {
	 public static void main(String[] args) {
	        Function<String, String> function = String::toUpperCase;
	        System.out.println(function.apply("hello"));
	    }
}
