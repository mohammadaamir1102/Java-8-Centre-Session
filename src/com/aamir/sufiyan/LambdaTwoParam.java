package com.aamir.sufiyan;

interface TwoParam {
	int sum(int num1, int num2);
}

public class LambdaTwoParam {

	public static void main(String[] args) {
		TwoParam ltp = (num1, num2) -> num1 - num2;
		System.out.println(ltp.sum(911, 111));
	}
}