package com.aamir.huzaifa;

import java.util.function.Predicate;



public class LamdausingPredicate {
	public static void main(String[] args) {
		Predicate<Integer> s =( Value)-> Value%2==0;
		System.out.println(s.test(5));
	}

}
