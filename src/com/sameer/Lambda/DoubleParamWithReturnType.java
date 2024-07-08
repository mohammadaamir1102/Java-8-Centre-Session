package com.sameer.Lambda;

interface Inputs {
	int sum(int num1, int num2);
}

public class DoubleParamWithReturnType {

	public static void main(String[] args) {

		Inputs inputs = (num1, num2) -> num1 + num2;
		System.out.println(inputs.sum(10, 29));

	}
}
