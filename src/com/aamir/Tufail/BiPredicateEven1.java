package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class BiPredicateEven1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer>even=(number1,number2)->number1%number2==0;
		System.out.println(even.test(10,9));
	}

}
