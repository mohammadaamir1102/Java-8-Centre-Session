package com.aamir.Tufail;

import java.util.function.Predicate;

public class PredicateNegateMethod {
	public static void main(String[] args) {
		Predicate<Integer>isEven=number->number%2==0;
		Predicate<Integer>negative=isEven.negate();
		System.out.println(negative.test(10));//A method return a opposite of predicate's boolean value
	}

}
