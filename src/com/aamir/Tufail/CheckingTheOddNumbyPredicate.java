package com.aamir.Tufail;

import java.util.function.Predicate;

public class CheckingTheOddNumbyPredicate {
	public static void main(String[] args) {
		Predicate<Integer>Odd=number->number%2!=0;//true
		Predicate<Integer>positive=number->number>0;//true
		Predicate<Integer>checkingElements=Odd.and(positive);
		System.out.println(checkingElements.test(9));
	}

}
