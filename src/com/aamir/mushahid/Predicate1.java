package com.aamir.mushahid;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		Predicate<Integer> even = value -> value%2==0;
		System.out.println(even.test(10));
	}

}
