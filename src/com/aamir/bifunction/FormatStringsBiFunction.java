package com.aamir.bifunction;

import java.util.function.BiFunction;

public class FormatStringsBiFunction {
	 public static void main(String[] args) {
	        BiFunction<String, String, String> biFunction = String::format;
	        System.out.println(biFunction.apply("Hello, %s!", "World"));
	    }
}
