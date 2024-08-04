package com.aamir.ahmad;

import java.util.function.BiPredicate;

public class BiPrediDivided {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer>  bP = (dividend,divisor) -> dividend%divisor==0;
		System.out.println(bP.test(50, 5));
		
	}
}
