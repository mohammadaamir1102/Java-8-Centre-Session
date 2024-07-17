package com.aamir.Tufail;

import java.util.function.BiPredicate;

public class Bipredcate7 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer>num=(num1,num2)->num1.equals(num2);
		System.out.println(num.test(10, 5));
	}

}
