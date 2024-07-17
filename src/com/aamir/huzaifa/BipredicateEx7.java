package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BipredicateEx7 {
	public static void main(String[] args) {
	        BiPredicate<Integer, Integer> isProductPositive = (x, y) -> (x * y) > 0;

	        System.out.println(isProductPositive.test(5, 3)); 
	        System.out.println(isProductPositive.test(-5, 3)); 
	    }
	}



