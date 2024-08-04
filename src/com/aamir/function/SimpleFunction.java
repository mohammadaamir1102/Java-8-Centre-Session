package com.aamir.function;

import java.util.function.Function;

public class SimpleFunction {

	public static void main(String[] args) {

		Function<String, Integer> function= String::length;
		System.out.println(function.apply("Abrar Khan"));
	}

}
