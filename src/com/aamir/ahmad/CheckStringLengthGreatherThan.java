package com.aamir.ahmad;

import java.util.function.Predicate;

public class CheckStringLengthGreatherThan {

	public static void main(String[] args) {
		Predicate<String> pred = check -> check.length() >5 && check.length()<10 ;
		System.out.println(pred.test("AhmadKhan"));
		
	}
}
