package com.aamir.function;

import java.util.function.Function;

class Box {
	String label;
	int number;

	Box(String label, int number) {
		this.label = label;
		this.number = number;
	}

	@Override
	public String toString() {
		return label + ": " + number;
	}
}

public class ObjectTransformationFunction {
	public static void main(String[] args) {
		Function<String, Box> function = s -> new Box(s, s.length());
		System.out.println(function.apply("Test"));
	}
}
