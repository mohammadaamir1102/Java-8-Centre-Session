package com.aamir.huzaifa;
import java.util.function.BiPredicate;
public class BipredicatExa5 {
	    public static void main(String[] args) {
	        BiPredicate<Integer, Integer> isFirstGreaterThanSecond = (x, y) -> x > y;

	        System.out.println(isFirstGreaterThanSecond.test(10, 5)); // true
	        System.out.println(isFirstGreaterThanSecond.test(5, 10)); // false
	    }
	}



