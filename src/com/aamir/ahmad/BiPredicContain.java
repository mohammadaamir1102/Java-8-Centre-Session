package com.aamir.ahmad;


import java.util.function.BiPredicate;

public class BiPredicContain {

	public static void main(String[] args) {
		BiPredicate<String, String> BP = (strContain1,strContain2)->strContain1.contains(strContain2);
		System.out.println(BP.test("My name is Ahmad", "Ahmad"));
	}
}
