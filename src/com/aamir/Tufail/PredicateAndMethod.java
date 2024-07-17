package com.aamir.Tufail;

import java.util.function.Predicate;
public class PredicateAndMethod {
	public static void main(String[] args) {
		Predicate<Integer>isEven=number->number%2==0;//true
		Predicate<Integer>ispositive=number->number>0;//true
		Predicate<Integer>isEvenAndPositive=isEven.and(ispositive);
		System.out.println(isEvenAndPositive.test(4));
	}

}
