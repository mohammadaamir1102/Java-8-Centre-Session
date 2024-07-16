package com.aamir.Tufail;

import java.util.function.Predicate;

public class PredicateOrMethod {
	public static void main(String[] args) {
		Predicate<Integer>isEven=number->number%2==0;//true
		Predicate<Integer>ispositive=number->number>0;//true
		Predicate<Integer>isEvenOrPositive=isEven.or(ispositive);
		System.out.println(isEvenOrPositive.test(4));
	}

}
