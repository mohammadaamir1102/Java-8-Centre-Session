package com.aamir.ahmad;

import java.util.function.Predicate;


public class PrediLambdaApproach {

	public static void main(String[] args) {
		//Predicate<Integer> pred = (value) -> value % 2 == 0;
		//System.out.println(pred.test(11));
		
		Predicate <String> pre = value -> value.isEmpty();
		System.out.println(pre.test(""));
	}
}
